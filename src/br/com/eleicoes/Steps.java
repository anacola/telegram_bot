package br.com.eleicoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

import br.com.eleicoes.constantes.EleicoesConstantes;
import br.com.eleicoes.model.Candidato;
import br.com.eleicoes.model.CandidatoPrincipal;
import br.com.eleicoes.model.Usuario;
import br.com.eleicoes.service.CandidatoService;
import br.com.eleicoes.util.CandidatoUtils;
import br.com.eleicoes.util.MensagensUtils;
import br.com.eleicoes.util.RegexUtil;

/**
 * Classe responsável pelos steps da aplicação.
 */
public class Steps {

	/**
	 * Executar step inicio.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 */
	public static void executarStepInicio(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios) {
		bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_INICIAL_CANDIDATOS));
		resetRespostas(usuarios, String.valueOf(update.message().chat().id()));
		adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), "inicio");
	}
	
	/**
	 * Executar step 1.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 */
	public static void executarStep1(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios) {
		int respostaUsuario = 0;
		try {
			respostaUsuario = Integer.parseInt(update.message().text());
		} catch (NumberFormatException nf){
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_INICIAL_CANDIDATOS));
			return;
		}
		if (respostaUsuario >= 1 && respostaUsuario <= 5) {
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
			return;
		}
	}
	
	/**
	 * Executar step 2.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 */
	public static void executarStep2(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios) {
		switch (update.message().text()) {
		case "1":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NORTE));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			break;
		case "2":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NORDESTE));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			break;
		case "3":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_CENTRO_OESTE));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			break;
		case "4":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_SUDESTE));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			break;
		case "5":
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_SUL));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			break;
		default:
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_REGIOES));
			break;
		}

	}
	
	/**
	 * Executar step 3.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 * @param respostas de List<String>
	 */
	public static void executarStep3(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios, List<String> respostas) {

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
	
	/**
	 * Executar step 4.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 * @param respostas de List<String>
	 */
	public static void executarStep4(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios, List<String> respostas) {
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
			Candidato candidatoPesquisado = candidatoFiltrado.get(0);
			usuarios.get(String.valueOf(update.message().chat().id())).setCandidato(candidatoPesquisado);
		}
	}
	
	
		
	/**
	 * Executar step 5.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 * @param usuarios de HashMap<String, Usuario>
	 * @param respostas de List<String>
	 */
	public static void executarStep5(Update update, TelegramBot bot, HashMap<String, Usuario> usuarios, List<String> respostas) {	
		CandidatoPrincipal candidatos;
		Candidato candidatoPesquisado = usuarios.get(String.valueOf(update.message().chat().id())).getCandidato();
		if(RegexUtil.validaResposta(EleicoesConstantes.REGEX_1_4, update.message().text())) {
			if ("1".equals(respostas.get(1))) {
				candidatos = CandidatoService.detalhesCandidato("BR", "1", candidatoPesquisado.getNumero().substring(0,2), candidatoPesquisado.getNumero(), String.valueOf(candidatoPesquisado.getId()));
			} else {
				candidatos = CandidatoService.detalhesCandidato(MensagensUtils.getEstadoCandidato(respostas.get(2), respostas.get(3)), MensagensUtils.getCargoCandidato(respostas.get(1)), candidatoPesquisado.getNumero().substring(0,2), candidatoPesquisado.getNumero(), String.valueOf(candidatoPesquisado.getId()));
			}
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.outrasInfosCandidatos(candidatos, update.message().text())));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
			
		}else {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.mensagemCandidatoFormatada(candidatoPesquisado)));
		}
	}
		
	
	/**
	 * Executar step 6.
	 *
	 * @param update de Update
	 * @param bot de TelegramBot
	 */
	public static void executarStep6(Update update, TelegramBot bot) {	
		bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_REINICIAR_PESQUISA));
	}
	
	/**
	 * Resposta estado.
	 *
	 * @param update de Update
	 * @param usuarios de HashMap<String, Usuario>
	 * @param bot de TelegramBot
	 * @param regex String
	 * @param respostaRegiao de String
	 */
	public static void respostaEstado(Update update, HashMap<String, Usuario> usuarios, TelegramBot bot, String regex, String respostaRegiao) {
		if (RegexUtil.validaResposta(regex, update.message().text())) {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_NOME_CANDIDATO));
			adicionarResposta(usuarios, String.valueOf(update.message().chat().id()), update.message().text());
		} else {
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.MENSAGEM_ERRO));
			bot.execute(new SendMessage(update.message().chat().id(), MensagensUtils.getMensagemEstadoById(respostaRegiao)));
		}
	}
	
	
	/**
	 * Adicionar resposta.
	 *
	 * @param usuarios de HashMap<String, Usuario>
	 * @param idUsuario de String
	 * @param resposta de String
	 */
	public static void adicionarResposta(HashMap<String, Usuario> usuarios, String idUsuario, String resposta) {
	    List<String> respostas = usuarios.get(idUsuario).getRespostas();
	    if(respostas == null) {
	    	respostas = new ArrayList<String>();
	    }
	    respostas.add(resposta);
	}
	
	/**
	 * Adicionar resposta presidente.
	 *
	 * @param usuarios de HashMap<String, Usuario>
	 * @param idUsuario de String
	 * @param resposta de String
	 */
	public static void adicionarRespostaPresidente(HashMap<String, Usuario> usuarios, String idUsuario, String resposta) {
	    List<String> respostas = usuarios.get(idUsuario).getRespostas();
	    if(respostas == null) {
	    	respostas = new ArrayList<String>();
	    }
	    respostas.add(resposta);
	    respostas.add(resposta);
	    respostas.add(resposta);
	}
	
	/**
	 * Reset respostas.
	 *
	 * @param usuarios de HashMap<String, Usuario>
	 * @param idUsuario de String
	 */
	public static void resetRespostas(HashMap<String, Usuario> usuarios, String idUsuario) {
	    Usuario usuario = new Usuario();
        usuarios.put(idUsuario, usuario);
	}
}
