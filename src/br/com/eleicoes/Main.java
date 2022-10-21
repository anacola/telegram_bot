package br.com.eleicoes;

import java.util.HashMap;
import java.util.List;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.ChatAction;
import com.pengrad.telegrambot.request.GetUpdates;
import com.pengrad.telegrambot.request.SendChatAction;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.GetUpdatesResponse;
import br.com.eleicoes.controller.Controller;
import br.com.eleicoes.model.InformacoesUmUsuario;

public class Main {

	private static HashMap<Long, InformacoesUmUsuario> informacoesTodosUsuarios = new HashMap<Long, InformacoesUmUsuario>();
	
	public static void main(String[] args) {
		// Criacao do objeto bot com as informacoes de acesso.
		TelegramBot bot = new TelegramBot("5367767257:AAHrtvZdGjDgrXsGBem99YHKLaMLU4clrwY");

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
				
				criaThreadUsuario(update.message().chat().id());

				// Envio de "Escrevendo" antes de enviar a resposta.
				bot.execute(new SendChatAction(update.message().chat().id(), ChatAction.typing.name()));
				
				List<String> mensagensBot = new Controller().controleStep(update.message().text(),
													   informacoesTodosUsuarios.get(update.message().chat().id())
													  );
				
				for (String mensagem : mensagensBot) {
					bot.execute(new SendMessage(update.message().chat().id(), mensagem));
				}
				
				mensagensBot.clear();
				System.out.println("teste");
			
			}
		}
	}
	
	private static void criaThreadUsuario (Long idChat) {
		
		if(!informacoesTodosUsuarios.containsKey(idChat)) {
			informacoesTodosUsuarios.put(idChat, new InformacoesUmUsuario());
		}
		
	}

}
