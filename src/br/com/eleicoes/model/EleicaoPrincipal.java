package br.com.eleicoes.model;

import java.util.ArrayList;

public class EleicaoPrincipal {
	private UnidadeEleitoral unidadeEleitoral;
	private Cargo cargo;
	private ArrayList<Candidato> candidatos;
	
	public UnidadeEleitoral getUnidadeEleitoral() {
		return unidadeEleitoral;
	}
	public void setUnidadeEleitoral(UnidadeEleitoral unidadeEleitoral) {
		this.unidadeEleitoral = unidadeEleitoral;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}
	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}
}

