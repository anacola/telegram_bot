package br.com.eleicoes.model;

import java.util.HashMap;

public class InformacoesUmUsuario {

	private HashMap<Integer, String> respostas = new HashMap<Integer, String>();
	
	private Candidato candidatoPesquisado;
	
	private int step = 1;

	public HashMap<Integer, String> getRespostas() {
		return respostas;
	}

	public void setRespostas(HashMap<Integer, String> respostas) {
		this.respostas = respostas;
	}

	public Candidato getCandidatoPesquisado() {
		return candidatoPesquisado;
	}

	public void setCandidatoPesquisado(Candidato candidatoPesquisado) {
		this.candidatoPesquisado = candidatoPesquisado;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	
	
	
}
