package br.com.eleicoes.model;

import java.util.ArrayList;

public class CandidatoPrincipal {
	private int idEleicao;
    private int ano;
    private String sgUe;
    private String sgUeSuperior;
    private String nmUe;
    private int nrPartido;
    private String nomePartido;
    private String siglaPartido;
    private String siglaPartidoSemEspaco;
    private int nrCandidato;
    private String idCandidato;
    private String nrProcessoPje;
    private String tpPrestador;
    private String cnpj;
    private Object idOrgao;
    private String idPrestador;
    private String idPrestadorVice;
    private String idUltimaEntrega;
    private String numeroDeControleEntrega;
    private String dataUltimaAtualizacaoContas;
    private Object entregaAtual;
    private DadosConsolidados dadosConsolidados;
    private ArrayList<HistoricoEntrega> historicoEntregas;
    private Despesas despesas;
    private boolean haveExtratos;
    private boolean haveNfes;
    private ArrayList<ConcentracaoDespesa> concentracaoDespesas;
    private ArrayList<RankingDoadore> rankingDoadores;
    private ArrayList<RankingFornecedore> rankingFornecedores;
    private ArrayList<ContasBancaria> contasBancarias;
    private Object receitaIndividual;
    private ArrayList<Qualificaco> qualificacoes;
    private Object dividaCampanha;
    private Object sobraFinanceira;
    private Object sobraFinanceiraFP;
    private Object sobraFinanceiraOR;
    private Object sobraFinanceiraFEFC;
    private Object sobraEstimavel;
    
	public int getIdEleicao() {
		return idEleicao;
	}
	public void setIdEleicao(int idEleicao) {
		this.idEleicao = idEleicao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getSgUe() {
		return sgUe;
	}
	public void setSgUe(String sgUe) {
		this.sgUe = sgUe;
	}
	public String getSgUeSuperior() {
		return sgUeSuperior;
	}
	public void setSgUeSuperior(String sgUeSuperior) {
		this.sgUeSuperior = sgUeSuperior;
	}
	public String getNmUe() {
		return nmUe;
	}
	public void setNmUe(String nmUe) {
		this.nmUe = nmUe;
	}
	public int getNrPartido() {
		return nrPartido;
	}
	public void setNrPartido(int nrPartido) {
		this.nrPartido = nrPartido;
	}
	public String getNomePartido() {
		return nomePartido;
	}
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	public String getSiglaPartido() {
		return siglaPartido;
	}
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	public String getSiglaPartidoSemEspaco() {
		return siglaPartidoSemEspaco;
	}
	public void setSiglaPartidoSemEspaco(String siglaPartidoSemEspaco) {
		this.siglaPartidoSemEspaco = siglaPartidoSemEspaco;
	}
	public int getNrCandidato() {
		return nrCandidato;
	}
	public void setNrCandidato(int nrCandidato) {
		this.nrCandidato = nrCandidato;
	}
	public String getIdCandidato() {
		return idCandidato;
	}
	public void setIdCandidato(String idCandidato) {
		this.idCandidato = idCandidato;
	}
	public String getNrProcessoPje() {
		return nrProcessoPje;
	}
	public void setNrProcessoPje(String nrProcessoPje) {
		this.nrProcessoPje = nrProcessoPje;
	}
	public String getTpPrestador() {
		return tpPrestador;
	}
	public void setTpPrestador(String tpPrestador) {
		this.tpPrestador = tpPrestador;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Object getIdOrgao() {
		return idOrgao;
	}
	public void setIdOrgao(Object idOrgao) {
		this.idOrgao = idOrgao;
	}
	public String getIdPrestador() {
		return idPrestador;
	}
	public void setIdPrestador(String idPrestador) {
		this.idPrestador = idPrestador;
	}
	public String getIdPrestadorVice() {
		return idPrestadorVice;
	}
	public void setIdPrestadorVice(String idPrestadorVice) {
		this.idPrestadorVice = idPrestadorVice;
	}
	public String getIdUltimaEntrega() {
		return idUltimaEntrega;
	}
	public void setIdUltimaEntrega(String idUltimaEntrega) {
		this.idUltimaEntrega = idUltimaEntrega;
	}
	public String getNumeroDeControleEntrega() {
		return numeroDeControleEntrega;
	}
	public void setNumeroDeControleEntrega(String numeroDeControleEntrega) {
		this.numeroDeControleEntrega = numeroDeControleEntrega;
	}
	public String getDataUltimaAtualizacaoContas() {
		return dataUltimaAtualizacaoContas;
	}
	public void setDataUltimaAtualizacaoContas(String dataUltimaAtualizacaoContas) {
		this.dataUltimaAtualizacaoContas = dataUltimaAtualizacaoContas;
	}
	public Object getEntregaAtual() {
		return entregaAtual;
	}
	public void setEntregaAtual(Object entregaAtual) {
		this.entregaAtual = entregaAtual;
	}
	public DadosConsolidados getDadosConsolidados() {
		return dadosConsolidados;
	}
	public void setDadosConsolidados(DadosConsolidados dadosConsolidados) {
		this.dadosConsolidados = dadosConsolidados;
	}
	public ArrayList<HistoricoEntrega> getHistoricoEntregas() {
		return historicoEntregas;
	}
	public void setHistoricoEntregas(ArrayList<HistoricoEntrega> historicoEntregas) {
		this.historicoEntregas = historicoEntregas;
	}
	public Despesas getDespesas() {
		return despesas;
	}
	public void setDespesas(Despesas despesas) {
		this.despesas = despesas;
	}
	public boolean isHaveExtratos() {
		return haveExtratos;
	}
	public void setHaveExtratos(boolean haveExtratos) {
		this.haveExtratos = haveExtratos;
	}
	public boolean isHaveNfes() {
		return haveNfes;
	}
	public void setHaveNfes(boolean haveNfes) {
		this.haveNfes = haveNfes;
	}
	public ArrayList<ConcentracaoDespesa> getConcentracaoDespesas() {
		return concentracaoDespesas;
	}
	public void setConcentracaoDespesas(ArrayList<ConcentracaoDespesa> concentracaoDespesas) {
		this.concentracaoDespesas = concentracaoDespesas;
	}
	public ArrayList<RankingDoadore> getRankingDoadores() {
		return rankingDoadores;
	}
	public void setRankingDoadores(ArrayList<RankingDoadore> rankingDoadores) {
		this.rankingDoadores = rankingDoadores;
	}
	public ArrayList<RankingFornecedore> getRankingFornecedores() {
		return rankingFornecedores;
	}
	public void setRankingFornecedores(ArrayList<RankingFornecedore> rankingFornecedores) {
		this.rankingFornecedores = rankingFornecedores;
	}
	public ArrayList<ContasBancaria> getContasBancarias() {
		return contasBancarias;
	}
	public void setContasBancarias(ArrayList<ContasBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}
	public Object getReceitaIndividual() {
		return receitaIndividual;
	}
	public void setReceitaIndividual(Object receitaIndividual) {
		this.receitaIndividual = receitaIndividual;
	}
	public ArrayList<Qualificaco> getQualificacoes() {
		return qualificacoes;
	}
	public void setQualificacoes(ArrayList<Qualificaco> qualificacoes) {
		this.qualificacoes = qualificacoes;
	}
	public Object getDividaCampanha() {
		return dividaCampanha;
	}
	public void setDividaCampanha(Object dividaCampanha) {
		this.dividaCampanha = dividaCampanha;
	}
	public Object getSobraFinanceira() {
		return sobraFinanceira;
	}
	public void setSobraFinanceira(Object sobraFinanceira) {
		this.sobraFinanceira = sobraFinanceira;
	}
	public Object getSobraFinanceiraFP() {
		return sobraFinanceiraFP;
	}
	public void setSobraFinanceiraFP(Object sobraFinanceiraFP) {
		this.sobraFinanceiraFP = sobraFinanceiraFP;
	}
	public Object getSobraFinanceiraOR() {
		return sobraFinanceiraOR;
	}
	public void setSobraFinanceiraOR(Object sobraFinanceiraOR) {
		this.sobraFinanceiraOR = sobraFinanceiraOR;
	}
	public Object getSobraFinanceiraFEFC() {
		return sobraFinanceiraFEFC;
	}
	public void setSobraFinanceiraFEFC(Object sobraFinanceiraFEFC) {
		this.sobraFinanceiraFEFC = sobraFinanceiraFEFC;
	}
	public Object getSobraEstimavel() {
		return sobraEstimavel;
	}
	public void setSobraEstimavel(Object sobraEstimavel) {
		this.sobraEstimavel = sobraEstimavel;
	}
}
