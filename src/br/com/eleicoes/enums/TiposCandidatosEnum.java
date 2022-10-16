package br.com.eleicoes.enums;

public enum TiposCandidatosEnum {
	PRESIDENTE(1,1,"Presidente"),
	GOVERNADOR(2,3, "Governador"),
	SENADOR(3,5, "Senador"),
	DEPUTADO_FEDERAL(4,6, "Deputado Federal"),
	DEPUTADO_ESTADUAL(5,7, "Deputado Estadual");

	private int idCargo;
	private int codTipoCandidato;
	private String descricao;
	
	TiposCandidatosEnum(int idCargo, int codTipoCandidato, String descricao){
		this.idCargo = idCargo;
		this.codTipoCandidato = codTipoCandidato;
		this.descricao = descricao;		
	}
	
	public int getIdCandidato() {
		return idCargo;
	}

	public int getCodTipoCandidato() {
		return codTipoCandidato;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
