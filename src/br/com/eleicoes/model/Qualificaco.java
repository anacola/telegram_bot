package br.com.eleicoes.model;

public class Qualificaco {
	private String membro;
    private int codigoFuncao;
    private String funcao;
    private String nrRegistroConselho;
    private long dtGestaoInicio;
    private long dtGestaoFim;
    
	public String getMembro() {
		return membro;
	}
	public void setMembro(String membro) {
		this.membro = membro;
	}
	public int getCodigoFuncao() {
		return codigoFuncao;
	}
	public void setCodigoFuncao(int codigoFuncao) {
		this.codigoFuncao = codigoFuncao;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getNrRegistroConselho() {
		return nrRegistroConselho;
	}
	public void setNrRegistroConselho(String nrRegistroConselho) {
		this.nrRegistroConselho = nrRegistroConselho;
	}
	public long getDtGestaoInicio() {
		return dtGestaoInicio;
	}
	public void setDtGestaoInicio(long dtGestaoInicio) {
		this.dtGestaoInicio = dtGestaoInicio;
	}
	public long getDtGestaoFim() {
		return dtGestaoFim;
	}
	public void setDtGestaoFim(long dtGestaoFim) {
		this.dtGestaoFim = dtGestaoFim;
	}
}
