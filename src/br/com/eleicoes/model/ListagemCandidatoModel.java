package br.com.eleicoes.model;

import java.util.ArrayList;

public class ListagemCandidatoModel {
	
	private UnidadeEleitoralModel unidadeEleitoral = new UnidadeEleitoralModel();
	private CargoModel cargo = new CargoModel();
	private ArrayList<CandidatoModel> candidatos = new ArrayList<CandidatoModel>();

	// Getter Methods

	public UnidadeEleitoralModel getUnidadeEleitoral() {
		return unidadeEleitoral;
	}

	public CargoModel getCargo() {
		return cargo;
	}

	// Setter Methods

	public void setUnidadeEleitoral(UnidadeEleitoralModel unidadeEleitoral) {
		this.unidadeEleitoral = unidadeEleitoral;
	}

	public void setCargo(CargoModel cargo) {
		this.cargo = cargo;
	}

	public ArrayList<CandidatoModel> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<CandidatoModel> candidatos) {
		this.candidatos = candidatos;
	}

	
	@Override
	public String toString() {
		return "ListagemCandidatoModel [unidadeEleitoral=" + (unidadeEleitoral == null ? "" : unidadeEleitoral.toString()) + ", cargo="
				+ (cargo == null ? "" : cargo.toString()) + ", candidatos=" + (candidatos == null ? "" : candidatos.toString()) + "]";
	}
	 
}
