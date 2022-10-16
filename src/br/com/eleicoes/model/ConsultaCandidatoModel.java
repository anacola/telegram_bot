package br.com.eleicoes.model;

import java.util.ArrayList;

public class ConsultaCandidatoModel {
	private long idEleicao = 0;
	private int ano = 0;
	private String sgUe = null;
	private String sgUeSuperior = null;
	private String nmUe = null;
	private int nrPartido = 0;
	private String nomePartido = null;
	private String siglaPartido = null;
	private String siglaPartidoSemEspaco = null;
	private int nrCandidato = 0;
	private String idCandidato = null;
	private String nrProcessoPje = null;
	private String tpPrestador = null;
	private String cnpj = null;
	private String idOrgao = null;
	private String idPrestador = null;
	private String idPrestadorVice = null;
	private String idUltimaEntrega = null;
	private String numeroDeControleEntrega = null;
	private String dataUltimaAtualizacaoContas = null;
	private String entregaAtual = null;
	private DadosConsolidadosModel dadosConsolidados = null;
	private ArrayList<EntregaModel> historicoEntregas = new ArrayList<EntregaModel>();
	private DespesasModel despesas = null;
	private boolean haveExtratos;
	private boolean haveNfes;
	private ArrayList<DespesaModel> concentracaoDespesas = new ArrayList<DespesaModel>();
	private ArrayList<DoadorModel> rankingDoadores = new ArrayList<DoadorModel>();
	private ArrayList<FornecedorModel> rankingFornecedores = new ArrayList<FornecedorModel>();
	private ArrayList<ContaBancariaModel> contasBancarias = new ArrayList<ContaBancariaModel>();
	private String receitaIndividual = null;
	private ArrayList<QualificacaoModel> qualificacoes = new ArrayList<QualificacaoModel>();
	private String dividaCampanha = null;
	private String sobraFinanceira = null;
	private String sobraFinanceiraFP = null;
	private String sobraFinanceiraOR = null;
	private String sobraFinanceiraFEFC = null;
	private String sobraEstimavel = null;

	// Getter Methods

	public long getIdEleicao() {
		return idEleicao;
	}

	public int getAno() {
		return ano;
	}

	public String getSgUe() {
		return sgUe;
	}

	public String getSgUeSuperior() {
		return sgUeSuperior;
	}

	public String getNmUe() {
		return nmUe;
	}

	public int getNrPartido() {
		return nrPartido;
	}

	public String getNomePartido() {
		return nomePartido;
	}

	public String getSiglaPartido() {
		return siglaPartido;
	}

	public String getSiglaPartidoSemEspaco() {
		return siglaPartidoSemEspaco;
	}

	public int getNrCandidato() {
		return nrCandidato;
	}

	public String getIdCandidato() {
		return idCandidato;
	}

	public String getNrProcessoPje() {
		return nrProcessoPje;
	}

	public String getTpPrestador() {
		return tpPrestador;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getIdOrgao() {
		return idOrgao;
	}

	public String getIdPrestador() {
		return idPrestador;
	}

	public String getIdPrestadorVice() {
		return idPrestadorVice;
	}

	public String getIdUltimaEntrega() {
		return idUltimaEntrega;
	}

	public String getNumeroDeControleEntrega() {
		return numeroDeControleEntrega;
	}

	public String getDataUltimaAtualizacaoContas() {
		return dataUltimaAtualizacaoContas;
	}

	public String getEntregaAtual() {
		return entregaAtual;
	}

	public DadosConsolidadosModel getDadosConsolidados() {
		return dadosConsolidados;
	}

	public DespesasModel getDespesas() {
		return despesas;
	}

	public boolean getHaveExtratos() {
		return haveExtratos;
	}

	public boolean getHaveNfes() {
		return haveNfes;
	}

	public String getReceitaIndividual() {
		return receitaIndividual;
	}

	public String getDividaCampanha() {
		return dividaCampanha;
	}

	public String getSobraFinanceira() {
		return sobraFinanceira;
	}

	public String getSobraFinanceiraFP() {
		return sobraFinanceiraFP;
	}

	public String getSobraFinanceiraOR() {
		return sobraFinanceiraOR;
	}

	public String getSobraFinanceiraFEFC() {
		return sobraFinanceiraFEFC;
	}

	public String getSobraEstimavel() {
		return sobraEstimavel;
	}

	// Setter Methods

	public void setIdEleicao(long idEleicao) {
		this.idEleicao = idEleicao;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setSgUe(String sgUe) {
		this.sgUe = sgUe;
	}

	public void setSgUeSuperior(String sgUeSuperior) {
		this.sgUeSuperior = sgUeSuperior;
	}

	public void setNmUe(String nmUe) {
		this.nmUe = nmUe;
	}

	public void setNrPartido(int nrPartido) {
		this.nrPartido = nrPartido;
	}

	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}

	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}

	public void setSiglaPartidoSemEspaco(String siglaPartidoSemEspaco) {
		this.siglaPartidoSemEspaco = siglaPartidoSemEspaco;
	}

	public void setNrCandidato(int nrCandidato) {
		this.nrCandidato = nrCandidato;
	}

	public void setIdCandidato(String idCandidato) {
		this.idCandidato = idCandidato;
	}

	public void setNrProcessoPje(String nrProcessoPje) {
		this.nrProcessoPje = nrProcessoPje;
	}

	public void setTpPrestador(String tpPrestador) {
		this.tpPrestador = tpPrestador;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setIdOrgao(String idOrgao) {
		this.idOrgao = idOrgao;
	}

	public void setIdPrestador(String idPrestador) {
		this.idPrestador = idPrestador;
	}

	public void setIdPrestadorVice(String idPrestadorVice) {
		this.idPrestadorVice = idPrestadorVice;
	}

	public void setIdUltimaEntrega(String idUltimaEntrega) {
		this.idUltimaEntrega = idUltimaEntrega;
	}

	public void setNumeroDeControleEntrega(String numeroDeControleEntrega) {
		this.numeroDeControleEntrega = numeroDeControleEntrega;
	}

	public void setDataUltimaAtualizacaoContas(String dataUltimaAtualizacaoContas) {
		this.dataUltimaAtualizacaoContas = dataUltimaAtualizacaoContas;
	}

	public void setEntregaAtual(String entregaAtual) {
		this.entregaAtual = entregaAtual;
	}

	public void setDadosConsolidados(DadosConsolidadosModel dadosConsolidados) {
		this.dadosConsolidados = dadosConsolidados;
	}

	public void setDespesas(DespesasModel despesas) {
		this.despesas = despesas;
	}

	public void setHaveExtratos(boolean haveExtratos) {
		this.haveExtratos = haveExtratos;
	}

	public void setHaveNfes(boolean haveNfes) {
		this.haveNfes = haveNfes;
	}

	public void setReceitaIndividual(String receitaIndividual) {
		this.receitaIndividual = receitaIndividual;
	}

	public void setDividaCampanha(String dividaCampanha) {
		this.dividaCampanha = dividaCampanha;
	}

	public void setSobraFinanceira(String sobraFinanceira) {
		this.sobraFinanceira = sobraFinanceira;
	}

	public void setSobraFinanceiraFP(String sobraFinanceiraFP) {
		this.sobraFinanceiraFP = sobraFinanceiraFP;
	}

	public void setSobraFinanceiraOR(String sobraFinanceiraOR) {
		this.sobraFinanceiraOR = sobraFinanceiraOR;
	}

	public void setSobraFinanceiraFEFC(String sobraFinanceiraFEFC) {
		this.sobraFinanceiraFEFC = sobraFinanceiraFEFC;
	}

	public void setSobraEstimavel(String sobraEstimavel) {
		this.sobraEstimavel = sobraEstimavel;
	}

	public ArrayList<EntregaModel> getHistoricoEntregas() {
		return historicoEntregas;
	}

	public void setHistoricoEntregas(ArrayList<EntregaModel> historicoEntregas) {
		this.historicoEntregas = historicoEntregas;
	}

	public ArrayList<DespesaModel> getConcentracaoDespesas() {
		return concentracaoDespesas;
	}

	public void setConcentracaoDespesas(ArrayList<DespesaModel> concentracaoDespesas) {
		this.concentracaoDespesas = concentracaoDespesas;
	}

	public ArrayList<DoadorModel> getRankingDoadores() {
		return rankingDoadores;
	}

	public void setRankingDoadores(ArrayList<DoadorModel> rankingDoadores) {
		this.rankingDoadores = rankingDoadores;
	}

	public ArrayList<FornecedorModel> getRankingFornecedores() {
		return rankingFornecedores;
	}

	public void setRankingFornecedores(ArrayList<FornecedorModel> rankingFornecedores) {
		this.rankingFornecedores = rankingFornecedores;
	}

	public ArrayList<ContaBancariaModel> getContasBancarias() {
		return contasBancarias;
	}

	public void setContasBancarias(ArrayList<ContaBancariaModel> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}

	public ArrayList<QualificacaoModel> getQualificacoes() {
		return qualificacoes;
	}

	public void setQualificacoes(ArrayList<QualificacaoModel> qualificacoes) {
		this.qualificacoes = qualificacoes;
	}

	
	@Override
	public String toString() {
		return "ConsultaCandidatoModel [idEleicao=" + idEleicao + ", ano=" + ano + ", sgUe=" + sgUe + ", sgUeSuperior="
				+ sgUeSuperior + ", nmUe=" + nmUe + ", nrPartido=" + nrPartido + ", nomePartido=" + nomePartido
				+ ", siglaPartido=" + siglaPartido + ", siglaPartidoSemEspaco=" + siglaPartidoSemEspaco
				+ ", nrCandidato=" + nrCandidato + ", idCandidato=" + idCandidato + ", nrProcessoPje=" + nrProcessoPje
				+ ", tpPrestador=" + tpPrestador + ", cnpj=" + cnpj + ", idOrgao=" + idOrgao + ", idPrestador="
				+ idPrestador + ", idPrestadorVice=" + idPrestadorVice + ", idUltimaEntrega=" + idUltimaEntrega
				+ ", numeroDeControleEntrega=" + numeroDeControleEntrega + ", dataUltimaAtualizacaoContas="
				+ dataUltimaAtualizacaoContas + ", entregaAtual=" + entregaAtual + ", dadosConsolidados="
				+ dadosConsolidados + ", historicoEntregas=" + historicoEntregas.toString() + ", Despesas=" + despesas
				+ ", haveExtratos=" + haveExtratos + ", haveNfes=" + haveNfes + ", concentracaoDespesas="
				+ (concentracaoDespesas == null ? "" : concentracaoDespesas.toString()) + ", rankingDoadores=" + (rankingDoadores == null ? "" : rankingDoadores.toString())
				+ ", rankingFornecedores=" + (rankingFornecedores == null ? "" : rankingFornecedores.toString()) + ", contasBancarias="
				+ (contasBancarias == null ? "" : contasBancarias.toString()) + ", receitaIndividual=" + receitaIndividual + ", qualificacoes="
				+ (qualificacoes == null ? "" : qualificacoes.toString()) + ", dividaCampanha=" + dividaCampanha + ", sobraFinanceira="
				+ sobraFinanceira + ", sobraFinanceiraFP=" + sobraFinanceiraFP + ", sobraFinanceiraOR="
				+ sobraFinanceiraOR + ", sobraFinanceiraFEFC=" + sobraFinanceiraFEFC + ", sobraEstimavel="
				+ sobraEstimavel + "]";
	}
	 
}
