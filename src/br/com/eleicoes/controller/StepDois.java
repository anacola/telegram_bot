package br.com.eleicoes.controller;

import java.util.List;

import br.com.eleicoes.interfaces.StepInterface;
import br.com.eleicoes.model.InformacoesUmUsuario;
import br.com.eleicoes.util.MensagensUtils;

public class StepDois extends StepMain implements StepInterface {
	
	@Override
	public List<String> executa (String respostaUsuario, InformacoesUmUsuario informacoesUsuario) {
		
		proximoStep = 3;
		
		super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
		
		mensagensBot.add(MensagensUtils.MENSAGEM_REGIOES);
		return mensagensBot;
	}
}
