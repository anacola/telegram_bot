package br.com.eleicoes.enums;

public enum TiposCandidatosEnum {
	PRESIDENTE(1,"Presidente"),
	GOVERNADOR(3, "Governador"),
	SENADOR(5, "Senador"),
	DEPUTADO_FEDERAL(6, "Deputado Federal"),
	DEPUTADO_ESTADUAL(7, "Deputado Estadual");

	private int codTipoCandidato;
	private String descricao;
	
	TiposCandidatosEnum(int codTipoCandidato, String descricao){
		this.codTipoCandidato = codTipoCandidato;
		this.descricao = descricao;		
	}

	public int getCodTipoCandidato() {
		return codTipoCandidato;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
