package br.com.eleicoes.enums;

public enum RegioesEnum {
	NORTE("1"),
	NORDESTE("2"),
	CENTRO_OESTE("3"),
	SUDESTE("4"),
	SUL("5");
	
	String codigoRegiao;

	RegioesEnum(String codigoRegiao) {
		this.codigoRegiao = codigoRegiao;
	}

	public String getCodigoRegiao() {
		return codigoRegiao;
	}	
	
}
