package br.com.eleicoes.model;

import java.util.ArrayList;

/**
 * Classe EleicaoPrincipal.
 */
public class EleicaoPrincipal {
	
	/** unidade eleitoral. */
	private UnidadeEleitoral unidadeEleitoral;
	
	/** cargo. */
	private Cargo cargo;
	
	/** candidatos. */
	private ArrayList<Candidato> candidatos;
	
	/**
	 * Gets unidade eleitoral.
	 *
	 * @return unidade eleitoral
	 */
	public UnidadeEleitoral getUnidadeEleitoral() {
		return unidadeEleitoral;
	}
	
	/**
	 * Sets unidade eleitoral.
	 *
	 * @param unidadeEleitoral new unidade eleitoral
	 */
	public void setUnidadeEleitoral(UnidadeEleitoral unidadeEleitoral) {
		this.unidadeEleitoral = unidadeEleitoral;
	}
	
	/**
	 * Gets cargo.
	 *
	 * @return cargo
	 */
	public Cargo getCargo() {
		return cargo;
	}
	
	/**
	 * Sets cargo.
	 *
	 * @param cargo new cargo
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	/**
	 * Gets candidatos.
	 *
	 * @return candidatos
	 */
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	
	/**
	 * Sets candidatos.
	 *
	 * @param candidatos new candidatos
	 */
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
}

