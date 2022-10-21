package br.com.eleicoes.controller;

import java.util.List;

import br.com.eleicoes.enums.RegioesEnum;
import br.com.eleicoes.interfaces.StepInterface;
import br.com.eleicoes.model.InformacoesUmUsuario;
import br.com.eleicoes.util.MensagensUtils;

public class StepTres extends StepMain implements StepInterface{
	
	@Override
	public List<String> executa(String respostaUsuario, InformacoesUmUsuario informacoesUsuario) {
		
		proximoStep = 4;
		
		if(respostaUsuario.equals(RegioesEnum.NORTE.getCodigoRegiao())) {
			super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_NORTE);
		}
		else if(respostaUsuario.equals(RegioesEnum.NORDESTE.getCodigoRegiao())) {
			super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_NORDESTE);
		}
		else if(respostaUsuario.equals(RegioesEnum.CENTRO_OESTE.getCodigoRegiao())) {
			super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_CENTRO_OESTE);
		}
		else if(respostaUsuario.equals(RegioesEnum.SUDESTE.getCodigoRegiao())) {
			super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_SUDESTE);
		}
		else if(respostaUsuario.equals(RegioesEnum.SUL.getCodigoRegiao())) {
			super.atualizaInfoUsuario(informacoesUsuario, respostaUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_SUL);
		}
		else {
			proximoStep = stepAtual;
			super.atualizaInfoUsuario(informacoesUsuario);
			mensagensBot.add(MensagensUtils.MENSAGEM_ERRO);
			mensagensBot.add(MensagensUtils.MENSAGEM_REGIOES);
		}
		
		return mensagensBot;
	}

}
