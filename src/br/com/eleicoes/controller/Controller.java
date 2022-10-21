package br.com.eleicoes.controller;

import java.util.List;

import br.com.eleicoes.model.InformacoesUmUsuario;

public class Controller {

	public List<String> controleStep(String entrada, InformacoesUmUsuario informacoesUsuario) {
		
		switch (informacoesUsuario.getStep()) {
		case 1:
			return new StepUm().executa(entrada, informacoesUsuario);
		case 2:
			return new StepDois().executa(entrada, informacoesUsuario);
		case 3:
			return new StepTres().executa(entrada, informacoesUsuario);
		default:
			return new StepErro().executa(entrada, informacoesUsuario);
		}
	}
	
}
