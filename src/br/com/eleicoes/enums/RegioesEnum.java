package br.com.eleicoes.enums;

public enum RegioesEnum {
	NORTE(1,"Norte"),
	NORDESTE(2, "Nordeste"),
	CENTRO_OESTE(3, "Centro-Oeste"),
	SUDESTE(4, "Sudeste"),
	SUL(5, "Sul");

	private int idRegiao;
	private String regiao;
	
	RegioesEnum(int idRegiao, String regiao){
		this.idRegiao = idRegiao;
		this.regiao = regiao;		
	}

	public int getIdRegiao() {
		return idRegiao;
	}

	public String getRegiao() {
		return regiao;
	}

}
