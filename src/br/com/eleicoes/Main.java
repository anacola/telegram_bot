package br.com.eleicoes;

import java.util.HashMap;
import java.util.List;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.response.GetUpdatesResponse;

import br.com.eleicoes.model.Usuario;
import br.com.eleicoes.util.CandidatoUtils;

public class Main {

	public static void main(String[] args) {
		// Criacao do objeto bot com as informacoes de acesso.
		TelegramBot bot = new TelegramBot("5629294896:AAFaHgT-nubZSCecbLiqhDcQO563iOKI9Xk");

		HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
		
		// Objeto responsavel por receber as mensagens.
		GetUpdatesResponse updatesResponse;

		// Controle de off-set, isto e, a partir deste ID sera lido as mensagens
		// pendentes na fila.
		int m = 0;
		// Loop infinito pode ser alterado por algum timer de intervalo curto.
		while (true) {
			// Executa comando no Telegram para obter as mensagens pendentes a partir de um
			// off-set (limite inicial).
			updatesResponse = bot.execute(new GetUpdates().limit(100).offset(m));

			// Lista de mensagens.
			List<Update> updates = updatesResponse.updates();
			

			// Analise de cada acao da mensagem.
			for (Update update : updates) {

				// Atualizacao do off-set.
				m = update.updateId() + 1;

				// Envio de "Escrevendo" antes de enviar a resposta.
				bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
				
				Usuario usuario = usuarios.get(String.valueOf(update.message().chat().id()));
				
				if (usuario == null || "inicio".equalsIgnoreCase(CandidatoUtils.removeAcentos(update.message().text()))) {
					Steps.executarStepInicio(update, bot, usuarios);
				} else {
					List<String> respostas = usuario.getRespostas();
					int step = respostas.size();
					switch (step) {
					case 1:
						Steps.executarStep1(update, bot, usuarios);
						break;
					case 2:
						Steps.executarStep2(update, bot, usuarios);
						break;
					case 3:
						Steps.executarStep3(update, bot, usuarios, respostas);
						break;
					case 4:
						Steps.executarStep4(update, bot, usuarios, respostas);
						break;
					case 5:
						Steps.executarStep5(update, bot, usuarios, respostas);
						break;
					case 6:
						Steps.executarStep6(update, bot);
						break;
					}
				}
			}
		}
	}

}
