package br.com.eleicoes.controller;

import java.util.ArrayList;

import br.com.eleicoes.model.Candidato;
import br.com.eleicoes.model.InformacoesUmUsuario;

public class StepMain {
	
	protected int stepAtual;
	protected int proximoStep;
	protected ArrayList<String> mensagensBot = new ArrayList<String>();
	private int numResposta;
	
	protected void atualizaInfoUsuario(InformacoesUmUsuario informacoesUsuario) {
		stepAtual = informacoesUsuario.getStep();
		informacoesUsuario.setStep(proximoStep);
	}
	
	protected void atualizaInfoUsuario(InformacoesUmUsuario informacoesUsuario, String respostaUsuario) {
		
		stepAtual = informacoesUsuario.getStep();
		numResposta = stepAtual-1;
		informacoesUsuario.getRespostas().put(numResposta, respostaUsuario);
		informacoesUsuario.setStep(proximoStep);
		
	}
	
	protected void atualizaInfoUsuario(InformacoesUmUsuario informacoesUsuario, String respostaUsuario, Candidato candidatoPesquisado) {
		
		stepAtual = informacoesUsuario.getStep();
		numResposta = stepAtual-1;
		informacoesUsuario.getRespostas().put(numResposta, respostaUsuario);
		informacoesUsuario.setCandidatoPesquisado(candidatoPesquisado);
		informacoesUsuario.setStep(proximoStep);
		
	}
	
}
