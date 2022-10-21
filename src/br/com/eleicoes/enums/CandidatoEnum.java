package br.com.eleicoes.enums;

public enum CandidatoEnum {

	PRESIDENTE("1",1,"Presidente"),
	GOVERNADOR("2",3,"Governador");
	
	private String ordem;
	private int codigoTipoCandidato;
	private String descricao;

	private CandidatoEnum(String ordem, int codigoTipoCandidato, String descricao) {
		this.ordem = ordem;
		this.codigoTipoCandidato = codigoTipoCandidato;
		this.descricao = descricao;
	}

	public String getOrdem() {
		return ordem;
	}

	public int getCodigoTipoCandidato() {
		return codigoTipoCandidato;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
