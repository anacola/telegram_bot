package br.com.eleicoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

import br.com.eleicoes.constantes.EleicoesConstantes;
import br.com.eleicoes.model.Candidato;
import br.com.eleicoes.service.CandidatoService;
import br.com.eleicoes.util.CandidatoUtils;
import br.com.eleicoes.util.MensagensUtils;
import br.com.eleicoes.util.RegexUtil;

public class Steps {

	public static void executarStepInicio(Update update, TelegramBot bot, HashMap<String, List<String>> usuarios) {
		bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_INICIAL_CANDIDATOS));
		resetRespostas(usuarios, String.valueOf(update.message().chat().id()));
		adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), "inicio");
	}
	
	public static void executarStep1(Update update, TelegramBot bot, HashMap<String, List<String>> usuarios) {
		if (RegexUtil.validaResposta(EleicoesConstantes.REGEX_1_5, update.message().text())) {
			if ("1".equals(update.message().text())) {
				bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NOME_CANDIDATO));
				adicionarRespostaPresidente(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			} else {
				bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_REGIOES));
				adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			}
		} else {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_INICIAL_CANDIDATOS));
		}
	}
	
	public static void executarStep2(Update update, TelegramBot bot, HashMap<String, List<String>> usuarios) {
		switch (update.message().text()) {
		case "1":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NORTE));
			break;
		case "2":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NORDESTE));
			break;
		case "3":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_CENTRO_OESTE));
			break;
		case "4":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_SUDESTE));
			break;
		case "5":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_SUL));
			break;
		default:
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_REGIOES));
			break;
		}
		
		if (RegexUtil.validaResposta(EleicoesConstantes.REGEX_1_5, update.message().text())) {
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
		}
	}
	
	public static void executarStep3(Update update, TelegramBot bot, HashMap<String, List<String>> usuarios, List<String> respostas) {

		String respostaRegiao = respostas.get(2);
		switch (respostaRegiao) {
		case "1":
			respostaEstado(update, usuarios, bot, EleicoesConstantes.REGEX_1_7, respostaRegiao);
			break;
		case "2":
			respostaEstado(update, usuarios, bot, EleicoesConstantes.REGEX_1_9, respostaRegiao);
			break;
		case "3":
			respostaEstado(update, usuarios, bot, EleicoesConstantes.REGEX_1_4, respostaRegiao);
			break;
		case "4":
			respostaEstado(update, usuarios, bot, EleicoesConstantes.REGEX_1_4, respostaRegiao);
			break;
		case "5":
			respostaEstado(update, usuarios, bot, EleicoesConstantes.REGEX_1_3, respostaRegiao);
			break;
		}
	}
	
	public static void executarStep4(Update update, TelegramBot bot, HashMap<String, List<String>> usuarios, List<String> respostas) {
		List<Candidato> candidatos;
		if ("1".equals(respostas.get(1))) {
			candidatos = CandidatoService.listarCandidatos("BR", "1");
		} else {
			candidatos = CandidatoService.listarCandidatos(MensagensUtils.getEstadoCandidato(respostas.get(2), respostas.get(3)), MensagensUtils.getCargoCandidato(respostas.get(1)));
		}
		
		List<Candidato> candidatoFiltrado = CandidatoUtils.filtrarCandidato(candidatos, update.message().text());
		
		if (candidatoFiltrado.size() == 0) {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO_NOME_CANDIDATO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NOME_CANDIDATO));
		} else if (candidatoFiltrado.size() > 1) {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO_CANDIDADO_DUPLICADO));
		} else {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.mensagemCandidatoFormatada(candidatoFiltrado.get(0))));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
		}
	}
	
	public static void executarStep5(Update update, TelegramBot bot) {
		bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_REINICIAR_PESQUISA));
	}
	
	public static void respostaEstado(Update update, HashMap<String, List<String>> usuarios, TelegramBot bot, String regex, String respostaRegiao) {
		if (RegexUtil.validaResposta(regex, update.message().text())) {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NOME_CANDIDATO));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
		} else {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.getMensagemEstadoById(respostaRegiao)));
		}
	}
	
	public static void adicionarResposta(HashMap<String, List<String>> usuarios, String idUsuario, String resposta) {
	    List<String> respostas = usuarios.get(idUsuario);
	    if(respostas == null) {
	    	respostas = new ArrayList<String>();
	    }
	    respostas.add(resposta);
        usuarios.put(idUsuario, respostas);
	}
	
	public static void adicionarRespostaPresidente(HashMap<String, List<String>> usuarios, String idUsuario, String resposta) {
	    List<String> respostas = usuarios.get(idUsuario);
	    if(respostas == null) {
	    	respostas = new ArrayList<String>();
	    }
	    respostas.add(resposta);
	    respostas.add(resposta);
	    respostas.add(resposta);
        usuarios.put(idUsuario, respostas);
	}
	
	public static void resetRespostas(HashMap<String, List<String>> usuarios, String idUsuario) {
	    List<String> respostas = new ArrayList<String>();	    
        usuarios.put(idUsuario, respostas);
	}
}
