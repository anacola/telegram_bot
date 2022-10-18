package br.com.eleicoes.model;

public class Partido {
    private int numero;
    private String sigla;
    private Object nome;
    
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Object getNome() {
		return nome;
	}
	public void setNome(Object nome) {
		this.nome = nome;
	}
}
