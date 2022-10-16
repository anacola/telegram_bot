package br.com.eleicoes.model;

public class DespesasModel {
	  private double limiteDeGasto1T;
	  private double limiteDeGasto2T;
	  private double valorLimiteDeGastos;
	  private double totalDespesasContratadas;
	  private double totalDespesasPagas;
	  private double doacoesOutrosCandidatosPartigos;
	  private double fundosPartidarios;
	  private double fundoEspecial;
	  private double outrosRecursos;
	  private double financeiras;
	  private double estimaveis;


	 

	public double getLimiteDeGasto1T() {
		return limiteDeGasto1T;
	}




	public double getLimiteDeGasto2T() {
		return limiteDeGasto2T;
	}




	public double getValorLimiteDeGastos() {
		return valorLimiteDeGastos;
	}




	public double getTotalDespesasContratadas() {
		return totalDespesasContratadas;
	}




	public double getTotalDespesasPagas() {
		return totalDespesasPagas;
	}




	public double getDoacoesOutrosCandidatosPartigos() {
		return doacoesOutrosCandidatosPartigos;
	}




	public double getFundosPartidarios() {
		return fundosPartidarios;
	}




	public double getFundoEspecial() {
		return fundoEspecial;
	}




	public double getOutrosRecursos() {
		return outrosRecursos;
	}




	public double getFinanceiras() {
		return financeiras;
	}




	public double getEstimaveis() {
		return estimaveis;
	}




	public void setLimiteDeGasto1T(double limiteDeGasto1T) {
		this.limiteDeGasto1T = limiteDeGasto1T;
	}




	public void setLimiteDeGasto2T(double limiteDeGasto2T) {
		this.limiteDeGasto2T = limiteDeGasto2T;
	}




	public void setValorLimiteDeGastos(double valorLimiteDeGastos) {
		this.valorLimiteDeGastos = valorLimiteDeGastos;
	}




	public void setTotalDespesasContratadas(double totalDespesasContratadas) {
		this.totalDespesasContratadas = totalDespesasContratadas;
	}




	public void setTotalDespesasPagas(double totalDespesasPagas) {
		this.totalDespesasPagas = totalDespesasPagas;
	}




	public void setDoacoesOutrosCandidatosPartigos(double doacoesOutrosCandidatosPartigos) {
		this.doacoesOutrosCandidatosPartigos = doacoesOutrosCandidatosPartigos;
	}




	public void setFundosPartidarios(double fundosPartidarios) {
		this.fundosPartidarios = fundosPartidarios;
	}




	public void setFundoEspecial(double fundoEspecial) {
		this.fundoEspecial = fundoEspecial;
	}




	public void setOutrosRecursos(double outrosRecursos) {
		this.outrosRecursos = outrosRecursos;
	}




	public void setFinanceiras(double financeiras) {
		this.financeiras = financeiras;
	}




	public void setEstimaveis(double estimaveis) {
		this.estimaveis = estimaveis;
	}




	@Override
	public String toString() {
		return "DespesasModel [limiteDeGasto1T=" + limiteDeGasto1T + ", limiteDeGasto2T=" + limiteDeGasto2T
				+ ", valorLimiteDeGastos=" + valorLimiteDeGastos + ", totalDespesasContratadas="
				+ totalDespesasContratadas + ", totalDespesasPagas=" + totalDespesasPagas
				+ ", doacoesOutrosCandidatosPartigos=" + doacoesOutrosCandidatosPartigos + ", fundosPartidarios="
				+ fundosPartidarios + ", fundoEspecial=" + fundoEspecial + ", outrosRecursos=" + outrosRecursos
				+ ", financeiras=" + financeiras + ", estimaveis=" + estimaveis + "]";
	}
	}
