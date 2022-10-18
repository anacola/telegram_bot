package br.com.eleicoes.model;

public class RankingDoadore {
	private String cpfCnpj;
    private String nome;
    private String qntd;
    private double valor;
    private boolean stFinanciamentoColetivo;
    
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getQntd() {
		return qntd;
	}
	public void setQntd(String qntd) {
		this.qntd = qntd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isStFinanciamentoColetivo() {
		return stFinanciamentoColetivo;
	}
	public void setStFinanciamentoColetivo(boolean stFinanciamentoColetivo) {
		this.stFinanciamentoColetivo = stFinanciamentoColetivo;
	}
}
