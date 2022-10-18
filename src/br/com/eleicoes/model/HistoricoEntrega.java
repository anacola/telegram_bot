package br.com.eleicoes.model;

public class HistoricoEntrega {
	private String dataEntrega;
    private String tipo;
    private String retificadora;
    private String numeroControle;
    private String idEntrega;
    private boolean isCompare;
    
	public String getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getRetificadora() {
		return retificadora;
	}
	public void setRetificadora(String retificadora) {
		this.retificadora = retificadora;
	}
	public String getNumeroControle() {
		return numeroControle;
	}
	public void setNumeroControle(String numeroControle) {
		this.numeroControle = numeroControle;
	}
	public String getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(String idEntrega) {
		this.idEntrega = idEntrega;
	}
	public boolean isCompare() {
		return isCompare;
	}
	public void setCompare(boolean isCompare) {
		this.isCompare = isCompare;
	}
}
