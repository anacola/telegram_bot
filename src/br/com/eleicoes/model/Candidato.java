package br.com.eleicoes.model;

public class Candidato {
    private Object id;
    private String nomeUrna;
    private int numero;
    private Object idCandidatoSuperior;
    private String nomeCompleto;
    private Object descricaoSexo;
    private Object dataDeNascimento;
    private Object tituloEleitor;
    private Object cpf;
    private Object descricaoEstadoCivil;
    private Object descricaoCorRaca;
    private String descricaoSituacao;
    private Object nacionalidade;
    private Object grauInstrucao;
    private Object ocupacao;
    private Object gastoCampanha1T;
    private Object gastoCampanha2T;
    private Object sgUfNascimento;
    private Object nomeMunicipioNascimento;
    private Object localCandidatura;
    private Object ufCandidatura;
    private Object ufSuperiorCandidatura;
    private Object dataUltimaAtualizacao;
    private Object fotoUrl;
    private Object fotoDataUltimaAtualizacao;
    private String descricaoTotalizacao;
    private String nomeColigacao;
    private Object composicaoColigacao;
    private Object descricaoTipoDrap;
    private Object numeroProcessoDrap;
    private Object numeroProcessoDrapEncrypt;
    private Object numeroProcesso;
    private Object numeroProcessoEncrypt;
    private Object numeroProcessoPrestContas;
    private Object numeroProcessoPrestContasEncrypt;
    private Object numeroProtocolo;
    private Cargo cargo;
    private Object bens;
    private Object totalDeBens;
    private Object vices;
    private Partido partido;
    private Eleicao eleicao;
    private Object emails;
    private Object sites;
    private Object arquivos;
    private Object eleicoesAnteriores;
    private Object substituto;
    private Object motivos;
    private Object codigoSituacaoCandidato;
    private Object descricaoSituacaoCandidato;
    private Object isCandidatoInapto;
    private Object codigoSituacaoPartido;
    private Object descricaoSituacaoPartido;
    private Object isCandFechado;
    private Object st_SUBSTITUIDO;
    private Object cnpjcampanha;
    private double gastoCampanha;
    private String descricaoNaturalidade;
    private Object st_MOTIVO_AUSENCIA_REQUISITO;
    private Object st_MOTIVO_IND_PARTIDO;
    private Object st_DIVULGA;
    private Object st_DIVULGA_BENS;
    private boolean st_REELEICAO;
    private Object st_DIVULGA_ARQUIVOS;
    private Object st_MOTIVO_FICHA_LIMPA;
    private Object st_MOTIVO_ABUSO_PODER;
    private Object st_MOTIVO_COMPRA_VOTO;
    private Object st_MOTIVO_CONDUTA_VEDADA;
    private Object st_MOTIVO_GASTO_ILICITO;
    private Object ds_MOTIVO_OUTROS;
    
	public Object getId() {
		return id;
	}
	public void setId(Object id) {
		this.id = id;
	}
	public String getNomeUrna() {
		return nomeUrna;
	}
	public void setNomeUrna(String nomeUrna) {
		this.nomeUrna = nomeUrna;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Object getIdCandidatoSuperior() {
		return idCandidatoSuperior;
	}
	public void setIdCandidatoSuperior(Object idCandidatoSuperior) {
		this.idCandidatoSuperior = idCandidatoSuperior;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Object getDescricaoSexo() {
		return descricaoSexo;
	}
	public void setDescricaoSexo(Object descricaoSexo) {
		this.descricaoSexo = descricaoSexo;
	}
	public Object getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Object dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Object getTituloEleitor() {
		return tituloEleitor;
	}
	public void setTituloEleitor(Object tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	public Object getCpf() {
		return cpf;
	}
	public void setCpf(Object cpf) {
		this.cpf = cpf;
	}
	public Object getDescricaoEstadoCivil() {
		return descricaoEstadoCivil;
	}
	public void setDescricaoEstadoCivil(Object descricaoEstadoCivil) {
		this.descricaoEstadoCivil = descricaoEstadoCivil;
	}
	public Object getDescricaoCorRaca() {
		return descricaoCorRaca;
	}
	public void setDescricaoCorRaca(Object descricaoCorRaca) {
		this.descricaoCorRaca = descricaoCorRaca;
	}
	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}
	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}
	public Object getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Object nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Object getGrauInstrucao() {
		return grauInstrucao;
	}
	public void setGrauInstrucao(Object grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	public Object getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(Object ocupacao) {
		this.ocupacao = ocupacao;
	}
	public Object getGastoCampanha1T() {
		return gastoCampanha1T;
	}
	public void setGastoCampanha1T(Object gastoCampanha1T) {
		this.gastoCampanha1T = gastoCampanha1T;
	}
	public Object getGastoCampanha2T() {
		return gastoCampanha2T;
	}
	public void setGastoCampanha2T(Object gastoCampanha2T) {
		this.gastoCampanha2T = gastoCampanha2T;
	}
	public Object getSgUfNascimento() {
		return sgUfNascimento;
	}
	public void setSgUfNascimento(Object sgUfNascimento) {
		this.sgUfNascimento = sgUfNascimento;
	}
	public Object getNomeMunicipioNascimento() {
		return nomeMunicipioNascimento;
	}
	public void setNomeMunicipioNascimento(Object nomeMunicipioNascimento) {
		this.nomeMunicipioNascimento = nomeMunicipioNascimento;
	}
	public Object getLocalCandidatura() {
		return localCandidatura;
	}
	public void setLocalCandidatura(Object localCandidatura) {
		this.localCandidatura = localCandidatura;
	}
	public Object getUfCandidatura() {
		return ufCandidatura;
	}
	public void setUfCandidatura(Object ufCandidatura) {
		this.ufCandidatura = ufCandidatura;
	}
	public Object getUfSuperiorCandidatura() {
		return ufSuperiorCandidatura;
	}
	public void setUfSuperiorCandidatura(Object ufSuperiorCandidatura) {
		this.ufSuperiorCandidatura = ufSuperiorCandidatura;
	}
	public Object getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	public void setDataUltimaAtualizacao(Object dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	public Object getFotoUrl() {
		return fotoUrl;
	}
	public void setFotoUrl(Object fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
	public Object getFotoDataUltimaAtualizacao() {
		return fotoDataUltimaAtualizacao;
	}
	public void setFotoDataUltimaAtualizacao(Object fotoDataUltimaAtualizacao) {
		this.fotoDataUltimaAtualizacao = fotoDataUltimaAtualizacao;
	}
	public String getDescricaoTotalizacao() {
		return descricaoTotalizacao;
	}
	public void setDescricaoTotalizacao(String descricaoTotalizacao) {
		this.descricaoTotalizacao = descricaoTotalizacao;
	}
	public String getNomeColigacao() {
		return nomeColigacao;
	}
	public void setNomeColigacao(String nomeColigacao) {
		this.nomeColigacao = nomeColigacao;
	}
	public Object getComposicaoColigacao() {
		return composicaoColigacao;
	}
	public void setComposicaoColigacao(Object composicaoColigacao) {
		this.composicaoColigacao = composicaoColigacao;
	}
	public Object getDescricaoTipoDrap() {
		return descricaoTipoDrap;
	}
	public void setDescricaoTipoDrap(Object descricaoTipoDrap) {
		this.descricaoTipoDrap = descricaoTipoDrap;
	}
	public Object getNumeroProcessoDrap() {
		return numeroProcessoDrap;
	}
	public void setNumeroProcessoDrap(Object numeroProcessoDrap) {
		this.numeroProcessoDrap = numeroProcessoDrap;
	}
	public Object getNumeroProcessoDrapEncrypt() {
		return numeroProcessoDrapEncrypt;
	}
	public void setNumeroProcessoDrapEncrypt(Object numeroProcessoDrapEncrypt) {
		this.numeroProcessoDrapEncrypt = numeroProcessoDrapEncrypt;
	}
	public Object getNumeroProcesso() {
		return numeroProcesso;
	}
	public void setNumeroProcesso(Object numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	public Object getNumeroProcessoEncrypt() {
		return numeroProcessoEncrypt;
	}
	public void setNumeroProcessoEncrypt(Object numeroProcessoEncrypt) {
		this.numeroProcessoEncrypt = numeroProcessoEncrypt;
	}
	public Object getNumeroProcessoPrestContas() {
		return numeroProcessoPrestContas;
	}
	public void setNumeroProcessoPrestContas(Object numeroProcessoPrestContas) {
		this.numeroProcessoPrestContas = numeroProcessoPrestContas;
	}
	public Object getNumeroProcessoPrestContasEncrypt() {
		return numeroProcessoPrestContasEncrypt;
	}
	public void setNumeroProcessoPrestContasEncrypt(Object numeroProcessoPrestContasEncrypt) {
		this.numeroProcessoPrestContasEncrypt = numeroProcessoPrestContasEncrypt;
	}
	public Object getNumeroProtocolo() {
		return numeroProtocolo;
	}
	public void setNumeroProtocolo(Object numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Object getBens() {
		return bens;
	}
	public void setBens(Object bens) {
		this.bens = bens;
	}
	public Object getTotalDeBens() {
		return totalDeBens;
	}
	public void setTotalDeBens(Object totalDeBens) {
		this.totalDeBens = totalDeBens;
	}
	public Object getVices() {
		return vices;
	}
	public void setVices(Object vices) {
		this.vices = vices;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public Eleicao getEleicao() {
		return eleicao;
	}
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	public Object getEmails() {
		return emails;
	}
	public void setEmails(Object emails) {
		this.emails = emails;
	}
	public Object getSites() {
		return sites;
	}
	public void setSites(Object sites) {
		this.sites = sites;
	}
	public Object getArquivos() {
		return arquivos;
	}
	public void setArquivos(Object arquivos) {
		this.arquivos = arquivos;
	}
	public Object getEleicoesAnteriores() {
		return eleicoesAnteriores;
	}
	public void setEleicoesAnteriores(Object eleicoesAnteriores) {
		this.eleicoesAnteriores = eleicoesAnteriores;
	}
	public Object getSubstituto() {
		return substituto;
	}
	public void setSubstituto(Object substituto) {
		this.substituto = substituto;
	}
	public Object getMotivos() {
		return motivos;
	}
	public void setMotivos(Object motivos) {
		this.motivos = motivos;
	}
	public Object getCodigoSituacaoCandidato() {
		return codigoSituacaoCandidato;
	}
	public void setCodigoSituacaoCandidato(Object codigoSituacaoCandidato) {
		this.codigoSituacaoCandidato = codigoSituacaoCandidato;
	}
	public Object getDescricaoSituacaoCandidato() {
		return descricaoSituacaoCandidato;
	}
	public void setDescricaoSituacaoCandidato(Object descricaoSituacaoCandidato) {
		this.descricaoSituacaoCandidato = descricaoSituacaoCandidato;
	}
	public Object getIsCandidatoInapto() {
		return isCandidatoInapto;
	}
	public void setIsCandidatoInapto(Object isCandidatoInapto) {
		this.isCandidatoInapto = isCandidatoInapto;
	}
	public Object getCodigoSituacaoPartido() {
		return codigoSituacaoPartido;
	}
	public void setCodigoSituacaoPartido(Object codigoSituacaoPartido) {
		this.codigoSituacaoPartido = codigoSituacaoPartido;
	}
	public Object getDescricaoSituacaoPartido() {
		return descricaoSituacaoPartido;
	}
	public void setDescricaoSituacaoPartido(Object descricaoSituacaoPartido) {
		this.descricaoSituacaoPartido = descricaoSituacaoPartido;
	}
	public Object getIsCandFechado() {
		return isCandFechado;
	}
	public void setIsCandFechado(Object isCandFechado) {
		this.isCandFechado = isCandFechado;
	}
	public Object getSt_SUBSTITUIDO() {
		return st_SUBSTITUIDO;
	}
	public void setSt_SUBSTITUIDO(Object st_SUBSTITUIDO) {
		this.st_SUBSTITUIDO = st_SUBSTITUIDO;
	}
	public Object getCnpjcampanha() {
		return cnpjcampanha;
	}
	public void setCnpjcampanha(Object cnpjcampanha) {
		this.cnpjcampanha = cnpjcampanha;
	}
	public double getGastoCampanha() {
		return gastoCampanha;
	}
	public void setGastoCampanha(double gastoCampanha) {
		this.gastoCampanha = gastoCampanha;
	}
	public String getDescricaoNaturalidade() {
		return descricaoNaturalidade;
	}
	public void setDescricaoNaturalidade(String descricaoNaturalidade) {
		this.descricaoNaturalidade = descricaoNaturalidade;
	}
	public Object getSt_MOTIVO_AUSENCIA_REQUISITO() {
		return st_MOTIVO_AUSENCIA_REQUISITO;
	}
	public void setSt_MOTIVO_AUSENCIA_REQUISITO(Object st_MOTIVO_AUSENCIA_REQUISITO) {
		this.st_MOTIVO_AUSENCIA_REQUISITO = st_MOTIVO_AUSENCIA_REQUISITO;
	}
	public Object getSt_MOTIVO_IND_PARTIDO() {
		return st_MOTIVO_IND_PARTIDO;
	}
	public void setSt_MOTIVO_IND_PARTIDO(Object st_MOTIVO_IND_PARTIDO) {
		this.st_MOTIVO_IND_PARTIDO = st_MOTIVO_IND_PARTIDO;
	}
	public Object getSt_DIVULGA() {
		return st_DIVULGA;
	}
	public void setSt_DIVULGA(Object st_DIVULGA) {
		this.st_DIVULGA = st_DIVULGA;
	}
	public Object getSt_DIVULGA_BENS() {
		return st_DIVULGA_BENS;
	}
	public void setSt_DIVULGA_BENS(Object st_DIVULGA_BENS) {
		this.st_DIVULGA_BENS = st_DIVULGA_BENS;
	}
	public boolean isSt_REELEICAO() {
		return st_REELEICAO;
	}
	public void setSt_REELEICAO(boolean st_REELEICAO) {
		this.st_REELEICAO = st_REELEICAO;
	}
	public Object getSt_DIVULGA_ARQUIVOS() {
		return st_DIVULGA_ARQUIVOS;
	}
	public void setSt_DIVULGA_ARQUIVOS(Object st_DIVULGA_ARQUIVOS) {
		this.st_DIVULGA_ARQUIVOS = st_DIVULGA_ARQUIVOS;
	}
	public Object getSt_MOTIVO_FICHA_LIMPA() {
		return st_MOTIVO_FICHA_LIMPA;
	}
	public void setSt_MOTIVO_FICHA_LIMPA(Object st_MOTIVO_FICHA_LIMPA) {
		this.st_MOTIVO_FICHA_LIMPA = st_MOTIVO_FICHA_LIMPA;
	}
	public Object getSt_MOTIVO_ABUSO_PODER() {
		return st_MOTIVO_ABUSO_PODER;
	}
	public void setSt_MOTIVO_ABUSO_PODER(Object st_MOTIVO_ABUSO_PODER) {
		this.st_MOTIVO_ABUSO_PODER = st_MOTIVO_ABUSO_PODER;
	}
	public Object getSt_MOTIVO_COMPRA_VOTO() {
		return st_MOTIVO_COMPRA_VOTO;
	}
	public void setSt_MOTIVO_COMPRA_VOTO(Object st_MOTIVO_COMPRA_VOTO) {
		this.st_MOTIVO_COMPRA_VOTO = st_MOTIVO_COMPRA_VOTO;
	}
	public Object getSt_MOTIVO_CONDUTA_VEDADA() {
		return st_MOTIVO_CONDUTA_VEDADA;
	}
	public void setSt_MOTIVO_CONDUTA_VEDADA(Object st_MOTIVO_CONDUTA_VEDADA) {
		this.st_MOTIVO_CONDUTA_VEDADA = st_MOTIVO_CONDUTA_VEDADA;
	}
	public Object getSt_MOTIVO_GASTO_ILICITO() {
		return st_MOTIVO_GASTO_ILICITO;
	}
	public void setSt_MOTIVO_GASTO_ILICITO(Object st_MOTIVO_GASTO_ILICITO) {
		this.st_MOTIVO_GASTO_ILICITO = st_MOTIVO_GASTO_ILICITO;
	}
	public Object getDs_MOTIVO_OUTROS() {
		return ds_MOTIVO_OUTROS;
	}
	public void setDs_MOTIVO_OUTROS(Object ds_MOTIVO_OUTROS) {
		this.ds_MOTIVO_OUTROS = ds_MOTIVO_OUTROS;
	}
}