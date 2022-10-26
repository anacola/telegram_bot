package br.com.eleicoes.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private List<String> respostas = new ArrayList<String>();
	private Candidato candidato = new Candidato();
	
	public List<String> getRespostas() {
		return respostas;
	}
	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}
	public Candidato getCandidato() {
		return candidato;
	}
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
