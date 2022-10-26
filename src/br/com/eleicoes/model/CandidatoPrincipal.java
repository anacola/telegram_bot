package br.com.eleicoes.model;

import java.util.ArrayList;

/**
 * Classe CandidatoPrincipal.
 */
public class CandidatoPrincipal {
	
	/** id eleicao. */
	private int idEleicao;
    
    /** ano. */
    private int ano;
    
    /** sg ue. */
    private String sgUe;
    
    /** sg ue superior. */
    private String sgUeSuperior;
    
    /** nm ue. */
    private String nmUe;
    
    /** nr partido. */
    private int nrPartido;
    
    /** nome partido. */
    private String nomePartido;
    
    /** sigla partido. */
    private String siglaPartido;
    
    /** sigla partido sem espaco. */
    private String siglaPartidoSemEspaco;
    
    /** nr candidato. */
    private int nrCandidato;
    
    /** id candidato. */
    private String idCandidato;
    
    /** nr processo pje. */
    private String nrProcessoPje;
    
    /** tp prestador. */
    private String tpPrestador;
    
    /** cnpj. */
    private String cnpj;
    
    /** id orgao. */
    private Object idOrgao;
    
    /** id prestador. */
    private String idPrestador;
    
    /** id prestador vice. */
    private String idPrestadorVice;
    
    /** id ultima entrega. */
    private String idUltimaEntrega;
    
    /** numero de controle entrega. */
    private String numeroDeControleEntrega;
    
    /** data ultima atualizacao contas. */
    private String dataUltimaAtualizacaoContas;
    
    /** entrega atual. */
    private Object entregaAtual;
    
    /** dados consolidados. */
    private DadosConsolidados dadosConsolidados;
    
    /** historico entregas. */
    private ArrayList<HistoricoEntrega> historicoEntregas;
    
    /** despesas. */
    private Despesas despesas;
    
    /** have extratos. */
    private boolean haveExtratos;
    
    /** have nfes. */
    private boolean haveNfes;
    
    /** concentracao despesas. */
    private ArrayList<ConcentracaoDespesa> concentracaoDespesas;
    
    /** ranking doadores. */
    private ArrayList<RankingDoadore> rankingDoadores;
    
    /** ranking fornecedores. */
    private ArrayList<RankingFornecedore> rankingFornecedores;
    
    /** contas bancarias. */
    private ArrayList<ContasBancaria> contasBancarias;
    
    /** receita individual. */
    private Object receitaIndividual;
    
    /** qualificacoes. */
    private ArrayList<Qualificaco> qualificacoes;
    
    /** divida campanha. */
    private Object dividaCampanha;
    
    /** sobra financeira. */
    private Object sobraFinanceira;
    
    /** sobra financeira FP. */
    private Object sobraFinanceiraFP;
    
    /** sobra financeira OR. */
    private Object sobraFinanceiraOR;
    
    /** sobra financeira FEFC. */
    private Object sobraFinanceiraFEFC;
    
    /** sobra estimavel. */
    private Object sobraEstimavel;
    
	/**
	 * Gets id eleicao.
	 *
	 * @return id eleicao
	 */
	public int getIdEleicao() {
		return idEleicao;
	}
	
	/**
	 * Sets id eleicao.
	 *
	 * @param idEleicao new id eleicao
	 */
	public void setIdEleicao(int idEleicao) {
		this.idEleicao = idEleicao;
	}
	
	/**
	 * Gets ano.
	 *
	 * @return ano
	 */
	public int getAno() {
		return ano;
	}
	
	/**
	 * Sets ano.
	 *
	 * @param ano new ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * Gets sg ue.
	 *
	 * @return sg ue
	 */
	public String getSgUe() {
		return sgUe;
	}
	
	/**
	 * Sets sg ue.
	 *
	 * @param sgUe new sg ue
	 */
	public void setSgUe(String sgUe) {
		this.sgUe = sgUe;
	}
	
	/**
	 * Gets sg ue superior.
	 *
	 * @return sg ue superior
	 */
	public String getSgUeSuperior() {
		return sgUeSuperior;
	}
	
	/**
	 * Sets sg ue superior.
	 *
	 * @param sgUeSuperior new sg ue superior
	 */
	public void setSgUeSuperior(String sgUeSuperior) {
		this.sgUeSuperior = sgUeSuperior;
	}
	
	/**
	 * Gets nm ue.
	 *
	 * @return nm ue
	 */
	public String getNmUe() {
		return nmUe;
	}
	
	/**
	 * Sets nm ue.
	 *
	 * @param nmUe new nm ue
	 */
	public void setNmUe(String nmUe) {
		this.nmUe = nmUe;
	}
	
	/**
	 * Gets nr partido.
	 *
	 * @return nr partido
	 */
	public int getNrPartido() {
		return nrPartido;
	}
	
	/**
	 * Sets nr partido.
	 *
	 * @param nrPartido new nr partido
	 */
	public void setNrPartido(int nrPartido) {
		this.nrPartido = nrPartido;
	}
	
	/**
	 * Gets nome partido.
	 *
	 * @return nome partido
	 */
	public String getNomePartido() {
		return nomePartido;
	}
	
	/**
	 * Sets nome partido.
	 *
	 * @param nomePartido new nome partido
	 */
	public void setNomePartido(String nomePartido) {
		this.nomePartido = nomePartido;
	}
	
	/**
	 * Gets sigla partido.
	 *
	 * @return sigla partido
	 */
	public String getSiglaPartido() {
		return siglaPartido;
	}
	
	/**
	 * Sets sigla partido.
	 *
	 * @param siglaPartido new sigla partido
	 */
	public void setSiglaPartido(String siglaPartido) {
		this.siglaPartido = siglaPartido;
	}
	
	/**
	 * Gets sigla partido sem espaco.
	 *
	 * @return sigla partido sem espaco
	 */
	public String getSiglaPartidoSemEspaco() {
		return siglaPartidoSemEspaco;
	}
	
	/**
	 * Sets sigla partido sem espaco.
	 *
	 * @param siglaPartidoSemEspaco new sigla partido sem espaco
	 */
	public void setSiglaPartidoSemEspaco(String siglaPartidoSemEspaco) {
		this.siglaPartidoSemEspaco = siglaPartidoSemEspaco;
	}
	
	/**
	 * Gets nr candidato.
	 *
	 * @return nr candidato
	 */
	public int getNrCandidato() {
		return nrCandidato;
	}
	
	/**
	 * Sets nr candidato.
	 *
	 * @param nrCandidato new nr candidato
	 */
	public void setNrCandidato(int nrCandidato) {
		this.nrCandidato = nrCandidato;
	}
	
	/**
	 * Gets id candidato.
	 *
	 * @return id candidato
	 */
	public String getIdCandidato() {
		return idCandidato;
	}
	
	/**
	 * Sets id candidato.
	 *
	 * @param idCandidato new id candidato
	 */
	public void setIdCandidato(String idCandidato) {
		this.idCandidato = idCandidato;
	}
	
	/**
	 * Gets nr processo pje.
	 *
	 * @return nr processo pje
	 */
	public String getNrProcessoPje() {
		return nrProcessoPje;
	}
	
	/**
	 * Sets nr processo pje.
	 *
	 * @param nrProcessoPje new nr processo pje
	 */
	public void setNrProcessoPje(String nrProcessoPje) {
		this.nrProcessoPje = nrProcessoPje;
	}
	
	/**
	 * Gets tp prestador.
	 *
	 * @return tp prestador
	 */
	public String getTpPrestador() {
		return tpPrestador;
	}
	
	/**
	 * Sets tp prestador.
	 *
	 * @param tpPrestador new tp prestador
	 */
	public void setTpPrestador(String tpPrestador) {
		this.tpPrestador = tpPrestador;
	}
	
	/**
	 * Gets cnpj.
	 *
	 * @return cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}
	
	/**
	 * Sets cnpj.
	 *
	 * @param cnpj new cnpj
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	/**
	 * Gets id orgao.
	 *
	 * @return id orgao
	 */
	public Object getIdOrgao() {
		return idOrgao;
	}
	
	/**
	 * Sets id orgao.
	 *
	 * @param idOrgao new id orgao
	 */
	public void setIdOrgao(Object idOrgao) {
		this.idOrgao = idOrgao;
	}
	
	/**
	 * Gets id prestador.
	 *
	 * @return id prestador
	 */
	public String getIdPrestador() {
		return idPrestador;
	}
	
	/**
	 * Sets id prestador.
	 *
	 * @param idPrestador new id prestador
	 */
	public void setIdPrestador(String idPrestador) {
		this.idPrestador = idPrestador;
	}
	
	/**
	 * Gets id prestador vice.
	 *
	 * @return id prestador vice
	 */
	public String getIdPrestadorVice() {
		return idPrestadorVice;
	}
	
	/**
	 * Sets id prestador vice.
	 *
	 * @param idPrestadorVice new id prestador vice
	 */
	public void setIdPrestadorVice(String idPrestadorVice) {
		this.idPrestadorVice = idPrestadorVice;
	}
	
	/**
	 * Gets id ultima entrega.
	 *
	 * @return id ultima entrega
	 */
	public String getIdUltimaEntrega() {
		return idUltimaEntrega;
	}
	
	/**
	 * Sets id ultima entrega.
	 *
	 * @param idUltimaEntrega new id ultima entrega
	 */
	public void setIdUltimaEntrega(String idUltimaEntrega) {
		this.idUltimaEntrega = idUltimaEntrega;
	}
	
	/**
	 * Gets numero de controle entrega.
	 *
	 * @return numero de controle entrega
	 */
	public String getNumeroDeControleEntrega() {
		return numeroDeControleEntrega;
	}
	
	/**
	 * Sets numero de controle entrega.
	 *
	 * @param numeroDeControleEntrega new numero de controle entrega
	 */
	public void setNumeroDeControleEntrega(String numeroDeControleEntrega) {
		this.numeroDeControleEntrega = numeroDeControleEntrega;
	}
	
	/**
	 * Gets data ultima atualizacao contas.
	 *
	 * @return data ultima atualizacao contas
	 */
	public String getDataUltimaAtualizacaoContas() {
		return dataUltimaAtualizacaoContas;
	}
	
	/**
	 * Sets data ultima atualizacao contas.
	 *
	 * @param dataUltimaAtualizacaoContas new data ultima atualizacao contas
	 */
	public void setDataUltimaAtualizacaoContas(String dataUltimaAtualizacaoContas) {
		this.dataUltimaAtualizacaoContas = dataUltimaAtualizacaoContas;
	}
	
	/**
	 * Gets entrega atual.
	 *
	 * @return entrega atual
	 */
	public Object getEntregaAtual() {
		return entregaAtual;
	}
	
	/**
	 * Sets entrega atual.
	 *
	 * @param entregaAtual new entrega atual
	 */
	public void setEntregaAtual(Object entregaAtual) {
		this.entregaAtual = entregaAtual;
	}
	
	/**
	 * Gets dados consolidados.
	 *
	 * @return dados consolidados
	 */
	public DadosConsolidados getDadosConsolidados() {
		return dadosConsolidados;
	}
	
	/**
	 * Sets dados consolidados.
	 *
	 * @param dadosConsolidados new dados consolidados
	 */
	public void setDadosConsolidados(DadosConsolidados dadosConsolidados) {
		this.dadosConsolidados = dadosConsolidados;
	}
	
	/**
	 * Gets historico entregas.
	 *
	 * @return historico entregas
	 */
	public ArrayList<HistoricoEntrega> getHistoricoEntregas() {
		return historicoEntregas;
	}
	
	/**
	 * Sets historico entregas.
	 *
	 * @param historicoEntregas new historico entregas
	 */
	public void setHistoricoEntregas(ArrayList<HistoricoEntrega> historicoEntregas) {
		this.historicoEntregas = historicoEntregas;
	}
	
	/**
	 * Gets despesas.
	 *
	 * @return despesas
	 */
	public Despesas getDespesas() {
		return despesas;
	}
	
	/**
	 * Sets despesas.
	 *
	 * @param despesas new despesas
	 */
	public void setDespesas(Despesas despesas) {
		this.despesas = despesas;
	}
	
	/**
	 * Checks if is have extratos.
	 *
	 * @return true, if is have extratos
	 */
	public boolean isHaveExtratos() {
		return haveExtratos;
	}
	
	/**
	 * Sets have extratos.
	 *
	 * @param haveExtratos new have extratos
	 */
	public void setHaveExtratos(boolean haveExtratos) {
		this.haveExtratos = haveExtratos;
	}
	
	/**
	 * Checks if is have nfes.
	 *
	 * @return true, if is have nfes
	 */
	public boolean isHaveNfes() {
		return haveNfes;
	}
	
	/**
	 * Sets have nfes.
	 *
	 * @param haveNfes new have nfes
	 */
	public void setHaveNfes(boolean haveNfes) {
		this.haveNfes = haveNfes;
	}
	
	/**
	 * Gets concentracao despesas.
	 *
	 * @return concentracao despesas
	 */
	public ArrayList<ConcentracaoDespesa> getConcentracaoDespesas() {
		return concentracaoDespesas;
	}
	
	/**
	 * Sets concentracao despesas.
	 *
	 * @param concentracaoDespesas new concentracao despesas
	 */
	public void setConcentracaoDespesas(ArrayList<ConcentracaoDespesa> concentracaoDespesas) {
		this.concentracaoDespesas = concentracaoDespesas;
	}
	
	/**
	 * Gets ranking doadores.
	 *
	 * @return ranking doadores
	 */
	public ArrayList<RankingDoadore> getRankingDoadores() {
		return rankingDoadores;
	}
	
	/**
	 * Sets ranking doadores.
	 *
	 * @param rankingDoadores new ranking doadores
	 */
	public void setRankingDoadores(ArrayList<RankingDoadore> rankingDoadores) {
		this.rankingDoadores = rankingDoadores;
	}
	
	/**
	 * Gets ranking fornecedores.
	 *
	 * @return ranking fornecedores
	 */
	public ArrayList<RankingFornecedore> getRankingFornecedores() {
		return rankingFornecedores;
	}
	
	/**
	 * Sets ranking fornecedores.
	 *
	 * @param rankingFornecedores new ranking fornecedores
	 */
	public void setRankingFornecedores(ArrayList<RankingFornecedore> rankingFornecedores) {
		this.rankingFornecedores = rankingFornecedores;
	}
	
	/**
	 * Gets contas bancarias.
	 *
	 * @return contas bancarias
	 */
	public ArrayList<ContasBancaria> getContasBancarias() {
		return contasBancarias;
	}
	
	/**
	 * Sets contas bancarias.
	 *
	 * @param contasBancarias new contas bancarias
	 */
	public void setContasBancarias(ArrayList<ContasBancaria> contasBancarias) {
		this.contasBancarias = contasBancarias;
	}
	
	/**
	 * Gets receita individual.
	 *
	 * @return receita individual
	 */
	public Object getReceitaIndividual() {
		return receitaIndividual;
	}
	
	/**
	 * Sets receita individual.
	 *
	 * @param receitaIndividual new receita individual
	 */
	public void setReceitaIndividual(Object receitaIndividual) {
		this.receitaIndividual = receitaIndividual;
	}
	
	/**
	 * Gets qualificacoes.
	 *
	 * @return qualificacoes
	 */
	public ArrayList<Qualificaco> getQualificacoes() {
		return qualificacoes;
	}
	
	/**
	 * Sets qualificacoes.
	 *
	 * @param qualificacoes new qualificacoes
	 */
	public void setQualificacoes(ArrayList<Qualificaco> qualificacoes) {
		this.qualificacoes = qualificacoes;
	}
	
	/**
	 * Gets divida campanha.
	 *
	 * @return divida campanha
	 */
	public Object getDividaCampanha() {
		return dividaCampanha;
	}
	
	/**
	 * Sets divida campanha.
	 *
	 * @param dividaCampanha new divida campanha
	 */
	public void setDividaCampanha(Object dividaCampanha) {
		this.dividaCampanha = dividaCampanha;
	}
	
	/**
	 * Gets sobra financeira.
	 *
	 * @return sobra financeira
	 */
	public Object getSobraFinanceira() {
		return sobraFinanceira;
	}
	
	/**
	 * Sets sobra financeira.
	 *
	 * @param sobraFinanceira new sobra financeira
	 */
	public void setSobraFinanceira(Object sobraFinanceira) {
		this.sobraFinanceira = sobraFinanceira;
	}
	
	/**
	 * Gets sobra financeira FP.
	 *
	 * @return sobra financeira FP
	 */
	public Object getSobraFinanceiraFP() {
		return sobraFinanceiraFP;
	}
	
	/**
	 * Sets sobra financeira FP.
	 *
	 * @param sobraFinanceiraFP new sobra financeira FP
	 */
	public void setSobraFinanceiraFP(Object sobraFinanceiraFP) {
		this.sobraFinanceiraFP = sobraFinanceiraFP;
	}
	
	/**
	 * Gets sobra financeira OR.
	 *
	 * @return sobra financeira OR
	 */
	public Object getSobraFinanceiraOR() {
		return sobraFinanceiraOR;
	}
	
	/**
	 * Sets sobra financeira OR.
	 *
	 * @param sobraFinanceiraOR new sobra financeira OR
	 */
	public void setSobraFinanceiraOR(Object sobraFinanceiraOR) {
		this.sobraFinanceiraOR = sobraFinanceiraOR;
	}
	
	/**
	 * Gets sobra financeira FEFC.
	 *
	 * @return sobra financeira FEFC
	 */
	public Object getSobraFinanceiraFEFC() {
		return sobraFinanceiraFEFC;
	}
	
	/**
	 * Sets sobra financeira FEFC.
	 *
	 * @param sobraFinanceiraFEFC new sobra financeira FEFC
	 */
	public void setSobraFinanceiraFEFC(Object sobraFinanceiraFEFC) {
		this.sobraFinanceiraFEFC = sobraFinanceiraFEFC;
	}
	
	/**
	 * Gets sobra estimavel.
	 *
	 * @return sobra estimavel
	 */
	public Object getSobraEstimavel() {
		return sobraEstimavel;
	}
	
	/**
	 * Sets sobra estimavel.
	 *
	 * @param sobraEstimavel new sobra estimavel
	 */
	public void setSobraEstimavel(Object sobraEstimavel) {
		this.sobraEstimavel = sobraEstimavel;
	}
}
