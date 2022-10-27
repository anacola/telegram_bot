package br.com.eleicoes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Usuario.
 */
public class Usuario {
	
	/** respostas. */
	private List<String> respostas = new ArrayList<String>();
	
	/** candidato. */
	private Candidato candidato = new Candidato();
	
	/**
	 * Gets respostas.
	 *
	 * @return respostas
	 */
	public List<String> getRespostas() {
		return respostas;
	}
	
	/**
	 * Sets respostas.
	 *
	 * @param respostas new respostas
	 */
	public void setRespostas(List<String> respostas) {
		this.respostas = respostas;
	}
	
	/**
	 * Gets candidato.
	 *
	 * @return candidato
	 */
	public Candidato getCandidato() {
		return candidato;
	}
	
	/**
	 * Sets candidato.
	 *
	 * @param candidato new candidato
	 */
	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	
}
