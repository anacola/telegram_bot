package br.com.eleicoes.model;

/**
 * Classe Candidato.
 */
public class Candidato {
    
    /** id. */
    private long id;
    
    /** nome urna. */
    private String nomeUrna;
    
    /** numero. */
    private String numero;
    
    /** id candidato superior. */
    private Object idCandidatoSuperior;
    
    /** nome completo. */
    private String nomeCompleto;
    
    /** descricao sexo. */
    private Object descricaoSexo;
    
    /** data de nascimento. */
    private Object dataDeNascimento;
    
    /** titulo eleitor. */
    private Object tituloEleitor;
    
    /** cpf. */
    private Object cpf;
    
    /** descricao estado civil. */
    private Object descricaoEstadoCivil;
    
    /** descricao cor raca. */
    private Object descricaoCorRaca;
    
    /** descricao situacao. */
    private String descricaoSituacao;
    
    /** nacionalidade. */
    private Object nacionalidade;
    
    /** grau instrucao. */
    private Object grauInstrucao;
    
    /** ocupacao. */
    private Object ocupacao;
    
    /** gasto campanha 1 T. */
    private Object gastoCampanha1T;
    
    /** gasto campanha 2 T. */
    private Object gastoCampanha2T;
    
    /** sg uf nascimento. */
    private Object sgUfNascimento;
    
    /** nome municipio nascimento. */
    private Object nomeMunicipioNascimento;
    
    /** local candidatura. */
    private Object localCandidatura;
    
    /** uf candidatura. */
    private Object ufCandidatura;
    
    /** uf superior candidatura. */
    private Object ufSuperiorCandidatura;
    
    /** data ultima atualizacao. */
    private Object dataUltimaAtualizacao;
    
    /** foto url. */
    private Object fotoUrl;
    
    /** foto data ultima atualizacao. */
    private Object fotoDataUltimaAtualizacao;
    
    /** descricao totalizacao. */
    private String descricaoTotalizacao;
    
    /** nome coligacao. */
    private String nomeColigacao;
    
    /** composicao coligacao. */
    private Object composicaoColigacao;
    
    /** descricao tipo drap. */
    private Object descricaoTipoDrap;
    
    /** numero processo drap. */
    private Object numeroProcessoDrap;
    
    /** numero processo drap encrypt. */
    private Object numeroProcessoDrapEncrypt;
    
    /** numero processo. */
    private Object numeroProcesso;
    
    /** numero processo encrypt. */
    private Object numeroProcessoEncrypt;
    
    /** numero processo prest contas. */
    private Object numeroProcessoPrestContas;
    
    /** numero processo prest contas encrypt. */
    private Object numeroProcessoPrestContasEncrypt;
    
    /** numero protocolo. */
    private Object numeroProtocolo;
    
    /** cargo. */
    private Cargo cargo;
    
    /** bens. */
    private Object bens;
    
    /** total de bens. */
    private Object totalDeBens;
    
    /** vices. */
    private Object vices;
    
    /** partido. */
    private Partido partido;
    
    /** eleicao. */
    private Eleicao eleicao;
    
    /** emails. */
    private Object emails;
    
    /** sites. */
    private Object sites;
    
    /** arquivos. */
    private Object arquivos;
    
    /** eleicoes anteriores. */
    private Object eleicoesAnteriores;
    
    /** substituto. */
    private Object substituto;
    
    /** motivos. */
    private Object motivos;
    
    /** codigo situacao candidato. */
    private Object codigoSituacaoCandidato;
    
    /** descricao situacao candidato. */
    private Object descricaoSituacaoCandidato;
    
    /** is candidato inapto. */
    private Object isCandidatoInapto;
    
    /** codigo situacao partido. */
    private Object codigoSituacaoPartido;
    
    /** descricao situacao partido. */
    private Object descricaoSituacaoPartido;
    
    /** is cand fechado. */
    private Object isCandFechado;
    
    /** st SUBSTITUIDO. */
    private Object st_SUBSTITUIDO;
    
    /** cnpjcampanha. */
    private Object cnpjcampanha;
    
    /** gasto campanha. */
    private double gastoCampanha;
    
    /** descricao naturalidade. */
    private String descricaoNaturalidade;
    
    /** st MOTIV O AUSENCI A REQUISITO. */
    private Object st_MOTIVO_AUSENCIA_REQUISITO;
    
    /** st MOTIV O IN D PARTIDO. */
    private Object st_MOTIVO_IND_PARTIDO;
    
    /** st DIVULGA. */
    private Object st_DIVULGA;
    
    /** st DIVULG A BENS. */
    private Object st_DIVULGA_BENS;
    
    /** st REELEICAO. */
    private boolean st_REELEICAO;
    
    /** st DIVULG A ARQUIVOS. */
    private Object st_DIVULGA_ARQUIVOS;
    
    /** st MOTIV O FICH A LIMPA. */
    private Object st_MOTIVO_FICHA_LIMPA;
    
    /** st MOTIV O ABUS O PODER. */
    private Object st_MOTIVO_ABUSO_PODER;
    
    /** st MOTIV O COMPR A VOTO. */
    private Object st_MOTIVO_COMPRA_VOTO;
    
    /** st MOTIV O CONDUT A VEDADA. */
    private Object st_MOTIVO_CONDUTA_VEDADA;
    
    /** st MOTIV O GAST O ILICITO. */
    private Object st_MOTIVO_GASTO_ILICITO;
    
    /** ds MOTIV O OUTROS. */
    private Object ds_MOTIVO_OUTROS;
    
	/**
	 * Gets id.
	 *
	 * @return id
	 */
	public long getId() {
		return id;
	}
	
	/**
	 * Sets id.
	 *
	 * @param id new id
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * Gets nome urna.
	 *
	 * @return nome urna
	 */
	public String getNomeUrna() {
		return nomeUrna;
	}
	
	/**
	 * Sets nome urna.
	 *
	 * @param nomeUrna new nome urna
	 */
	public void setNomeUrna(String nomeUrna) {
		this.nomeUrna = nomeUrna;
	}
	
	/**
	 * Gets numero.
	 *
	 * @return numero
	 */
	public String getNumero() {
		return numero;
	}
	
	/**
	 * Sets numero.
	 *
	 * @param numero new numero
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	/**
	 * Gets id candidato superior.
	 *
	 * @return id candidato superior
	 */
	public Object getIdCandidatoSuperior() {
		return idCandidatoSuperior;
	}
	
	/**
	 * Sets id candidato superior.
	 *
	 * @param idCandidatoSuperior new id candidato superior
	 */
	public void setIdCandidatoSuperior(Object idCandidatoSuperior) {
		this.idCandidatoSuperior = idCandidatoSuperior;
	}
	
	/**
	 * Gets nome completo.
	 *
	 * @return nome completo
	 */
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	/**
	 * Sets nome completo.
	 *
	 * @param nomeCompleto new nome completo
	 */
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	/**
	 * Gets descricao sexo.
	 *
	 * @return descricao sexo
	 */
	public Object getDescricaoSexo() {
		return descricaoSexo;
	}
	
	/**
	 * Sets descricao sexo.
	 *
	 * @param descricaoSexo new descricao sexo
	 */
	public void setDescricaoSexo(Object descricaoSexo) {
		this.descricaoSexo = descricaoSexo;
	}
	
	/**
	 * Gets data de nascimento.
	 *
	 * @return data de nascimento
	 */
	public Object getDataDeNascimento() {
		return dataDeNascimento;
	}
	
	/**
	 * Sets data de nascimento.
	 *
	 * @param dataDeNascimento new data de nascimento
	 */
	public void setDataDeNascimento(Object dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	/**
	 * Gets titulo eleitor.
	 *
	 * @return titulo eleitor
	 */
	public Object getTituloEleitor() {
		return tituloEleitor;
	}
	
	/**
	 * Sets titulo eleitor.
	 *
	 * @param tituloEleitor new titulo eleitor
	 */
	public void setTituloEleitor(Object tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}
	
	/**
	 * Gets cpf.
	 *
	 * @return cpf
	 */
	public Object getCpf() {
		return cpf;
	}
	
	/**
	 * Sets cpf.
	 *
	 * @param cpf new cpf
	 */
	public void setCpf(Object cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * Gets descricao estado civil.
	 *
	 * @return descricao estado civil
	 */
	public Object getDescricaoEstadoCivil() {
		return descricaoEstadoCivil;
	}
	
	/**
	 * Sets descricao estado civil.
	 *
	 * @param descricaoEstadoCivil new descricao estado civil
	 */
	public void setDescricaoEstadoCivil(Object descricaoEstadoCivil) {
		this.descricaoEstadoCivil = descricaoEstadoCivil;
	}
	
	/**
	 * Gets descricao cor raca.
	 *
	 * @return descricao cor raca
	 */
	public Object getDescricaoCorRaca() {
		return descricaoCorRaca;
	}
	
	/**
	 * Sets descricao cor raca.
	 *
	 * @param descricaoCorRaca new descricao cor raca
	 */
	public void setDescricaoCorRaca(Object descricaoCorRaca) {
		this.descricaoCorRaca = descricaoCorRaca;
	}
	
	/**
	 * Gets descricao situacao.
	 *
	 * @return descricao situacao
	 */
	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}
	
	/**
	 * Sets descricao situacao.
	 *
	 * @param descricaoSituacao new descricao situacao
	 */
	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}
	
	/**
	 * Gets nacionalidade.
	 *
	 * @return nacionalidade
	 */
	public Object getNacionalidade() {
		return nacionalidade;
	}
	
	/**
	 * Sets nacionalidade.
	 *
	 * @param nacionalidade new nacionalidade
	 */
	public void setNacionalidade(Object nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	/**
	 * Gets grau instrucao.
	 *
	 * @return grau instrucao
	 */
	public Object getGrauInstrucao() {
		return grauInstrucao;
	}
	
	/**
	 * Sets grau instrucao.
	 *
	 * @param grauInstrucao new grau instrucao
	 */
	public void setGrauInstrucao(Object grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}
	
	/**
	 * Gets ocupacao.
	 *
	 * @return ocupacao
	 */
	public Object getOcupacao() {
		return ocupacao;
	}
	
	/**
	 * Sets ocupacao.
	 *
	 * @param ocupacao new ocupacao
	 */
	public void setOcupacao(Object ocupacao) {
		this.ocupacao = ocupacao;
	}
	
	/**
	 * Gets gasto campanha 1 T.
	 *
	 * @return gasto campanha 1 T
	 */
	public Object getGastoCampanha1T() {
		return gastoCampanha1T;
	}
	
	/**
	 * Sets gasto campanha 1 T.
	 *
	 * @param gastoCampanha1T new gasto campanha 1 T
	 */
	public void setGastoCampanha1T(Object gastoCampanha1T) {
		this.gastoCampanha1T = gastoCampanha1T;
	}
	
	/**
	 * Gets gasto campanha 2 T.
	 *
	 * @return gasto campanha 2 T
	 */
	public Object getGastoCampanha2T() {
		return gastoCampanha2T;
	}
	
	/**
	 * Sets gasto campanha 2 T.
	 *
	 * @param gastoCampanha2T new gasto campanha 2 T
	 */
	public void setGastoCampanha2T(Object gastoCampanha2T) {
		this.gastoCampanha2T = gastoCampanha2T;
	}
	
	/**
	 * Gets sg uf nascimento.
	 *
	 * @return sg uf nascimento
	 */
	public Object getSgUfNascimento() {
		return sgUfNascimento;
	}
	
	/**
	 * Sets sg uf nascimento.
	 *
	 * @param sgUfNascimento new sg uf nascimento
	 */
	public void setSgUfNascimento(Object sgUfNascimento) {
		this.sgUfNascimento = sgUfNascimento;
	}
	
	/**
	 * Gets nome municipio nascimento.
	 *
	 * @return nome municipio nascimento
	 */
	public Object getNomeMunicipioNascimento() {
		return nomeMunicipioNascimento;
	}
	
	/**
	 * Sets nome municipio nascimento.
	 *
	 * @param nomeMunicipioNascimento new nome municipio nascimento
	 */
	public void setNomeMunicipioNascimento(Object nomeMunicipioNascimento) {
		this.nomeMunicipioNascimento = nomeMunicipioNascimento;
	}
	
	/**
	 * Gets local candidatura.
	 *
	 * @return local candidatura
	 */
	public Object getLocalCandidatura() {
		return localCandidatura;
	}
	
	/**
	 * Sets local candidatura.
	 *
	 * @param localCandidatura new local candidatura
	 */
	public void setLocalCandidatura(Object localCandidatura) {
		this.localCandidatura = localCandidatura;
	}
	
	/**
	 * Gets uf candidatura.
	 *
	 * @return uf candidatura
	 */
	public Object getUfCandidatura() {
		return ufCandidatura;
	}
	
	/**
	 * Sets uf candidatura.
	 *
	 * @param ufCandidatura new uf candidatura
	 */
	public void setUfCandidatura(Object ufCandidatura) {
		this.ufCandidatura = ufCandidatura;
	}
	
	/**
	 * Gets uf superior candidatura.
	 *
	 * @return uf superior candidatura
	 */
	public Object getUfSuperiorCandidatura() {
		return ufSuperiorCandidatura;
	}
	
	/**
	 * Sets uf superior candidatura.
	 *
	 * @param ufSuperiorCandidatura new uf superior candidatura
	 */
	public void setUfSuperiorCandidatura(Object ufSuperiorCandidatura) {
		this.ufSuperiorCandidatura = ufSuperiorCandidatura;
	}
	
	/**
	 * Gets data ultima atualizacao.
	 *
	 * @return data ultima atualizacao
	 */
	public Object getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}
	
	/**
	 * Sets data ultima atualizacao.
	 *
	 * @param dataUltimaAtualizacao new data ultima atualizacao
	 */
	public void setDataUltimaAtualizacao(Object dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	
	/**
	 * Gets foto url.
	 *
	 * @return foto url
	 */
	public Object getFotoUrl() {
		return fotoUrl;
	}
	
	/**
	 * Sets foto url.
	 *
	 * @param fotoUrl new foto url
	 */
	public void setFotoUrl(Object fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
	
	/**
	 * Gets foto data ultima atualizacao.
	 *
	 * @return foto data ultima atualizacao
	 */
	public Object getFotoDataUltimaAtualizacao() {
		return fotoDataUltimaAtualizacao;
	}
	
	/**
	 * Sets foto data ultima atualizacao.
	 *
	 * @param fotoDataUltimaAtualizacao new foto data ultima atualizacao
	 */
	public void setFotoDataUltimaAtualizacao(Object fotoDataUltimaAtualizacao) {
		this.fotoDataUltimaAtualizacao = fotoDataUltimaAtualizacao;
	}
	
	/**
	 * Gets descricao totalizacao.
	 *
	 * @return descricao totalizacao
	 */
	public String getDescricaoTotalizacao() {
		return descricaoTotalizacao;
	}
	
	/**
	 * Sets descricao totalizacao.
	 *
	 * @param descricaoTotalizacao new descricao totalizacao
	 */
	public void setDescricaoTotalizacao(String descricaoTotalizacao) {
		this.descricaoTotalizacao = descricaoTotalizacao;
	}
	
	/**
	 * Gets nome coligacao.
	 *
	 * @return nome coligacao
	 */
	public String getNomeColigacao() {
		return nomeColigacao;
	}
	
	/**
	 * Sets nome coligacao.
	 *
	 * @param nomeColigacao new nome coligacao
	 */
	public void setNomeColigacao(String nomeColigacao) {
		this.nomeColigacao = nomeColigacao;
	}
	
	/**
	 * Gets composicao coligacao.
	 *
	 * @return composicao coligacao
	 */
	public Object getComposicaoColigacao() {
		return composicaoColigacao;
	}
	
	/**
	 * Sets composicao coligacao.
	 *
	 * @param composicaoColigacao new composicao coligacao
	 */
	public void setComposicaoColigacao(Object composicaoColigacao) {
		this.composicaoColigacao = composicaoColigacao;
	}
	
	/**
	 * Gets descricao tipo drap.
	 *
	 * @return descricao tipo drap
	 */
	public Object getDescricaoTipoDrap() {
		return descricaoTipoDrap;
	}
	
	/**
	 * Sets descricao tipo drap.
	 *
	 * @param descricaoTipoDrap new descricao tipo drap
	 */
	public void setDescricaoTipoDrap(Object descricaoTipoDrap) {
		this.descricaoTipoDrap = descricaoTipoDrap;
	}
	
	/**
	 * Gets numero processo drap.
	 *
	 * @return numero processo drap
	 */
	public Object getNumeroProcessoDrap() {
		return numeroProcessoDrap;
	}
	
	/**
	 * Sets numero processo drap.
	 *
	 * @param numeroProcessoDrap new numero processo drap
	 */
	public void setNumeroProcessoDrap(Object numeroProcessoDrap) {
		this.numeroProcessoDrap = numeroProcessoDrap;
	}
	
	/**
	 * Gets numero processo drap encrypt.
	 *
	 * @return numero processo drap encrypt
	 */
	public Object getNumeroProcessoDrapEncrypt() {
		return numeroProcessoDrapEncrypt;
	}
	
	/**
	 * Sets numero processo drap encrypt.
	 *
	 * @param numeroProcessoDrapEncrypt new numero processo drap encrypt
	 */
	public void setNumeroProcessoDrapEncrypt(Object numeroProcessoDrapEncrypt) {
		this.numeroProcessoDrapEncrypt = numeroProcessoDrapEncrypt;
	}
	
	/**
	 * Gets numero processo.
	 *
	 * @return numero processo
	 */
	public Object getNumeroProcesso() {
		return numeroProcesso;
	}
	
	/**
	 * Sets numero processo.
	 *
	 * @param numeroProcesso new numero processo
	 */
	public void setNumeroProcesso(Object numeroProcesso) {
		this.numeroProcesso = numeroProcesso;
	}
	
	/**
	 * Gets numero processo encrypt.
	 *
	 * @return numero processo encrypt
	 */
	public Object getNumeroProcessoEncrypt() {
		return numeroProcessoEncrypt;
	}
	
	/**
	 * Sets numero processo encrypt.
	 *
	 * @param numeroProcessoEncrypt new numero processo encrypt
	 */
	public void setNumeroProcessoEncrypt(Object numeroProcessoEncrypt) {
		this.numeroProcessoEncrypt = numeroProcessoEncrypt;
	}
	
	/**
	 * Gets numero processo prest contas.
	 *
	 * @return numero processo prest contas
	 */
	public Object getNumeroProcessoPrestContas() {
		return numeroProcessoPrestContas;
	}
	
	/**
	 * Sets numero processo prest contas.
	 *
	 * @param numeroProcessoPrestContas new numero processo prest contas
	 */
	public void setNumeroProcessoPrestContas(Object numeroProcessoPrestContas) {
		this.numeroProcessoPrestContas = numeroProcessoPrestContas;
	}
	
	/**
	 * Gets numero processo prest contas encrypt.
	 *
	 * @return numero processo prest contas encrypt
	 */
	public Object getNumeroProcessoPrestContasEncrypt() {
		return numeroProcessoPrestContasEncrypt;
	}
	
	/**
	 * Sets numero processo prest contas encrypt.
	 *
	 * @param numeroProcessoPrestContasEncrypt new numero processo prest contas encrypt
	 */
	public void setNumeroProcessoPrestContasEncrypt(Object numeroProcessoPrestContasEncrypt) {
		this.numeroProcessoPrestContasEncrypt = numeroProcessoPrestContasEncrypt;
	}
	
	/**
	 * Gets numero protocolo.
	 *
	 * @return numero protocolo
	 */
	public Object getNumeroProtocolo() {
		return numeroProtocolo;
	}
	
	/**
	 * Sets numero protocolo.
	 *
	 * @param numeroProtocolo new numero protocolo
	 */
	public void setNumeroProtocolo(Object numeroProtocolo) {
		this.numeroProtocolo = numeroProtocolo;
	}
	
	/**
	 * Gets cargo.
	 *
	 * @return cargo
	 */
	public Cargo getCargo() {
		return cargo;
	}
	
	/**
	 * Sets cargo.
	 *
	 * @param cargo new cargo
	 */
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	/**
	 * Gets bens.
	 *
	 * @return bens
	 */
	public Object getBens() {
		return bens;
	}
	
	/**
	 * Sets bens.
	 *
	 * @param bens new bens
	 */
	public void setBens(Object bens) {
		this.bens = bens;
	}
	
	/**
	 * Gets total de bens.
	 *
	 * @return total de bens
	 */
	public Object getTotalDeBens() {
		return totalDeBens;
	}
	
	/**
	 * Sets total de bens.
	 *
	 * @param totalDeBens new total de bens
	 */
	public void setTotalDeBens(Object totalDeBens) {
		this.totalDeBens = totalDeBens;
	}
	
	/**
	 * Gets vices.
	 *
	 * @return vices
	 */
	public Object getVices() {
		return vices;
	}
	
	/**
	 * Sets vices.
	 *
	 * @param vices new vices
	 */
	public void setVices(Object vices) {
		this.vices = vices;
	}
	
	/**
	 * Gets partido.
	 *
	 * @return partido
	 */
	public Partido getPartido() {
		return partido;
	}
	
	/**
	 * Sets partido.
	 *
	 * @param partido new partido
	 */
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	
	/**
	 * Gets eleicao.
	 *
	 * @return eleicao
	 */
	public Eleicao getEleicao() {
		return eleicao;
	}
	
	/**
	 * Sets eleicao.
	 *
	 * @param eleicao new eleicao
	 */
	public void setEleicao(Eleicao eleicao) {
		this.eleicao = eleicao;
	}
	
	/**
	 * Gets emails.
	 *
	 * @return emails
	 */
	public Object getEmails() {
		return emails;
	}
	
	/**
	 * Sets emails.
	 *
	 * @param emails new emails
	 */
	public void setEmails(Object emails) {
		this.emails = emails;
	}
	
	/**
	 * Gets sites.
	 *
	 * @return sites
	 */
	public Object getSites() {
		return sites;
	}
	
	/**
	 * Sets sites.
	 *
	 * @param sites new sites
	 */
	public void setSites(Object sites) {
		this.sites = sites;
	}
	
	/**
	 * Gets arquivos.
	 *
	 * @return arquivos
	 */
	public Object getArquivos() {
		return arquivos;
	}
	
	/**
	 * Sets arquivos.
	 *
	 * @param arquivos new arquivos
	 */
	public void setArquivos(Object arquivos) {
		this.arquivos = arquivos;
	}
	
	/**
	 * Gets eleicoes anteriores.
	 *
	 * @return eleicoes anteriores
	 */
	public Object getEleicoesAnteriores() {
		return eleicoesAnteriores;
	}
	
	/**
	 * Sets eleicoes anteriores.
	 *
	 * @param eleicoesAnteriores new eleicoes anteriores
	 */
	public void setEleicoesAnteriores(Object eleicoesAnteriores) {
		this.eleicoesAnteriores = eleicoesAnteriores;
	}
	
	/**
	 * Gets substituto.
	 *
	 * @return substituto
	 */
	public Object getSubstituto() {
		return substituto;
	}
	
	/**
	 * Sets substituto.
	 *
	 * @param substituto new substituto
	 */
	public void setSubstituto(Object substituto) {
		this.substituto = substituto;
	}
	
	/**
	 * Gets motivos.
	 *
	 * @return motivos
	 */
	public Object getMotivos() {
		return motivos;
	}
	
	/**
	 * Sets motivos.
	 *
	 * @param motivos new motivos
	 */
	public void setMotivos(Object motivos) {
		this.motivos = motivos;
	}
	
	/**
	 * Gets codigo situacao candidato.
	 *
	 * @return codigo situacao candidato
	 */
	public Object getCodigoSituacaoCandidato() {
		return codigoSituacaoCandidato;
	}
	
	/**
	 * Sets codigo situacao candidato.
	 *
	 * @param codigoSituacaoCandidato new codigo situacao candidato
	 */
	public void setCodigoSituacaoCandidato(Object codigoSituacaoCandidato) {
		this.codigoSituacaoCandidato = codigoSituacaoCandidato;
	}
	
	/**
	 * Gets descricao situacao candidato.
	 *
	 * @return descricao situacao candidato
	 */
	public Object getDescricaoSituacaoCandidato() {
		return descricaoSituacaoCandidato;
	}
	
	/**
	 * Sets descricao situacao candidato.
	 *
	 * @param descricaoSituacaoCandidato new descricao situacao candidato
	 */
	public void setDescricaoSituacaoCandidato(Object descricaoSituacaoCandidato) {
		this.descricaoSituacaoCandidato = descricaoSituacaoCandidato;
	}
	
	/**
	 * Gets checks if is candidato inapto.
	 *
	 * @return checks if is candidato inapto
	 */
	public Object getIsCandidatoInapto() {
		return isCandidatoInapto;
	}
	
	/**
	 * Sets checks if is candidato inapto.
	 *
	 * @param isCandidatoInapto new checks if is candidato inapto
	 */
	public void setIsCandidatoInapto(Object isCandidatoInapto) {
		this.isCandidatoInapto = isCandidatoInapto;
	}
	
	/**
	 * Gets codigo situacao partido.
	 *
	 * @return codigo situacao partido
	 */
	public Object getCodigoSituacaoPartido() {
		return codigoSituacaoPartido;
	}
	
	/**
	 * Sets codigo situacao partido.
	 *
	 * @param codigoSituacaoPartido new codigo situacao partido
	 */
	public void setCodigoSituacaoPartido(Object codigoSituacaoPartido) {
		this.codigoSituacaoPartido = codigoSituacaoPartido;
	}
	
	/**
	 * Gets descricao situacao partido.
	 *
	 * @return descricao situacao partido
	 */
	public Object getDescricaoSituacaoPartido() {
		return descricaoSituacaoPartido;
	}
	
	/**
	 * Sets descricao situacao partido.
	 *
	 * @param descricaoSituacaoPartido new descricao situacao partido
	 */
	public void setDescricaoSituacaoPartido(Object descricaoSituacaoPartido) {
		this.descricaoSituacaoPartido = descricaoSituacaoPartido;
	}
	
	/**
	 * Gets checks if is cand fechado.
	 *
	 * @return checks if is cand fechado
	 */
	public Object getIsCandFechado() {
		return isCandFechado;
	}
	
	/**
	 * Sets checks if is cand fechado.
	 *
	 * @param isCandFechado new checks if is cand fechado
	 */
	public void setIsCandFechado(Object isCandFechado) {
		this.isCandFechado = isCandFechado;
	}
	
	/**
	 * Gets st SUBSTITUIDO.
	 *
	 * @return st SUBSTITUIDO
	 */
	public Object getSt_SUBSTITUIDO() {
		return st_SUBSTITUIDO;
	}
	
	/**
	 * Sets st SUBSTITUIDO.
	 *
	 * @param st_SUBSTITUIDO new st SUBSTITUIDO
	 */
	public void setSt_SUBSTITUIDO(Object st_SUBSTITUIDO) {
		this.st_SUBSTITUIDO = st_SUBSTITUIDO;
	}
	
	/**
	 * Gets cnpjcampanha.
	 *
	 * @return cnpjcampanha
	 */
	public Object getCnpjcampanha() {
		return cnpjcampanha;
	}
	
	/**
	 * Sets cnpjcampanha.
	 *
	 * @param cnpjcampanha new cnpjcampanha
	 */
	public void setCnpjcampanha(Object cnpjcampanha) {
		this.cnpjcampanha = cnpjcampanha;
	}
	
	/**
	 * Gets gasto campanha.
	 *
	 * @return gasto campanha
	 */
	public double getGastoCampanha() {
		return gastoCampanha;
	}
	
	/**
	 * Sets gasto campanha.
	 *
	 * @param gastoCampanha new gasto campanha
	 */
	public void setGastoCampanha(double gastoCampanha) {
		this.gastoCampanha = gastoCampanha;
	}
	
	/**
	 * Gets descricao naturalidade.
	 *
	 * @return descricao naturalidade
	 */
	public String getDescricaoNaturalidade() {
		return descricaoNaturalidade;
	}
	
	/**
	 * Sets descricao naturalidade.
	 *
	 * @param descricaoNaturalidade new descricao naturalidade
	 */
	public void setDescricaoNaturalidade(String descricaoNaturalidade) {
		this.descricaoNaturalidade = descricaoNaturalidade;
	}
	
	/**
	 * Gets st MOTIV O AUSENCI A REQUISITO.
	 *
	 * @return st MOTIV O AUSENCI A REQUISITO
	 */
	public Object getSt_MOTIVO_AUSENCIA_REQUISITO() {
		return st_MOTIVO_AUSENCIA_REQUISITO;
	}
	
	/**
	 * Sets st MOTIV O AUSENCI A REQUISITO.
	 *
	 * @param st_MOTIVO_AUSENCIA_REQUISITO new st MOTIV O AUSENCI A REQUISITO
	 */
	public void setSt_MOTIVO_AUSENCIA_REQUISITO(Object st_MOTIVO_AUSENCIA_REQUISITO) {
		this.st_MOTIVO_AUSENCIA_REQUISITO = st_MOTIVO_AUSENCIA_REQUISITO;
	}
	
	/**
	 * Gets st MOTIV O IN D PARTIDO.
	 *
	 * @return st MOTIV O IN D PARTIDO
	 */
	public Object getSt_MOTIVO_IND_PARTIDO() {
		return st_MOTIVO_IND_PARTIDO;
	}
	
	/**
	 * Sets st MOTIV O IN D PARTIDO.
	 *
	 * @param st_MOTIVO_IND_PARTIDO new st MOTIV O IN D PARTIDO
	 */
	public void setSt_MOTIVO_IND_PARTIDO(Object st_MOTIVO_IND_PARTIDO) {
		this.st_MOTIVO_IND_PARTIDO = st_MOTIVO_IND_PARTIDO;
	}
	
	/**
	 * Gets st DIVULGA.
	 *
	 * @return st DIVULGA
	 */
	public Object getSt_DIVULGA() {
		return st_DIVULGA;
	}
	
	/**
	 * Sets st DIVULGA.
	 *
	 * @param st_DIVULGA new st DIVULGA
	 */
	public void setSt_DIVULGA(Object st_DIVULGA) {
		this.st_DIVULGA = st_DIVULGA;
	}
	
	/**
	 * Gets st DIVULG A BENS.
	 *
	 * @return st DIVULG A BENS
	 */
	public Object getSt_DIVULGA_BENS() {
		return st_DIVULGA_BENS;
	}
	
	/**
	 * Sets st DIVULG A BENS.
	 *
	 * @param st_DIVULGA_BENS new st DIVULG A BENS
	 */
	public void setSt_DIVULGA_BENS(Object st_DIVULGA_BENS) {
		this.st_DIVULGA_BENS = st_DIVULGA_BENS;
	}
	
	/**
	 * Checks if is st REELEICAO.
	 *
	 * @return true, if is st REELEICAO
	 */
	public boolean isSt_REELEICAO() {
		return st_REELEICAO;
	}
	
	/**
	 * Sets st REELEICAO.
	 *
	 * @param st_REELEICAO new st REELEICAO
	 */
	public void setSt_REELEICAO(boolean st_REELEICAO) {
		this.st_REELEICAO = st_REELEICAO;
	}
	
	/**
	 * Gets st DIVULG A ARQUIVOS.
	 *
	 * @return st DIVULG A ARQUIVOS
	 */
	public Object getSt_DIVULGA_ARQUIVOS() {
		return st_DIVULGA_ARQUIVOS;
	}
	
	/**
	 * Sets st DIVULG A ARQUIVOS.
	 *
	 * @param st_DIVULGA_ARQUIVOS new st DIVULG A ARQUIVOS
	 */
	public void setSt_DIVULGA_ARQUIVOS(Object st_DIVULGA_ARQUIVOS) {
		this.st_DIVULGA_ARQUIVOS = st_DIVULGA_ARQUIVOS;
	}
	
	/**
	 * Gets st MOTIV O FICH A LIMPA.
	 *
	 * @return st MOTIV O FICH A LIMPA
	 */
	public Object getSt_MOTIVO_FICHA_LIMPA() {
		return st_MOTIVO_FICHA_LIMPA;
	}
	
	/**
	 * Sets st MOTIV O FICH A LIMPA.
	 *
	 * @param st_MOTIVO_FICHA_LIMPA new st MOTIV O FICH A LIMPA
	 */
	public void setSt_MOTIVO_FICHA_LIMPA(Object st_MOTIVO_FICHA_LIMPA) {
		this.st_MOTIVO_FICHA_LIMPA = st_MOTIVO_FICHA_LIMPA;
	}
	
	/**
	 * Gets st MOTIV O ABUS O PODER.
	 *
	 * @return st MOTIV O ABUS O PODER
	 */
	public Object getSt_MOTIVO_ABUSO_PODER() {
		return st_MOTIVO_ABUSO_PODER;
	}
	
	/**
	 * Sets st MOTIV O ABUS O PODER.
	 *
	 * @param st_MOTIVO_ABUSO_PODER new st MOTIV O ABUS O PODER
	 */
	public void setSt_MOTIVO_ABUSO_PODER(Object st_MOTIVO_ABUSO_PODER) {
		this.st_MOTIVO_ABUSO_PODER = st_MOTIVO_ABUSO_PODER;
	}
	
	/**
	 * Gets st MOTIV O COMPR A VOTO.
	 *
	 * @return st MOTIV O COMPR A VOTO
	 */
	public Object getSt_MOTIVO_COMPRA_VOTO() {
		return st_MOTIVO_COMPRA_VOTO;
	}
	
	/**
	 * Sets st MOTIV O COMPR A VOTO.
	 *
	 * @param st_MOTIVO_COMPRA_VOTO new st MOTIV O COMPR A VOTO
	 */
	public void setSt_MOTIVO_COMPRA_VOTO(Object st_MOTIVO_COMPRA_VOTO) {
		this.st_MOTIVO_COMPRA_VOTO = st_MOTIVO_COMPRA_VOTO;
	}
	
	/**
	 * Gets st MOTIV O CONDUT A VEDADA.
	 *
	 * @return st MOTIV O CONDUT A VEDADA
	 */
	public Object getSt_MOTIVO_CONDUTA_VEDADA() {
		return st_MOTIVO_CONDUTA_VEDADA;
	}
	
	/**
	 * Sets st MOTIV O CONDUT A VEDADA.
	 *
	 * @param st_MOTIVO_CONDUTA_VEDADA new st MOTIV O CONDUT A VEDADA
	 */
	public void setSt_MOTIVO_CONDUTA_VEDADA(Object st_MOTIVO_CONDUTA_VEDADA) {
		this.st_MOTIVO_CONDUTA_VEDADA = st_MOTIVO_CONDUTA_VEDADA;
	}
	
	/**
	 * Gets st MOTIV O GAST O ILICITO.
	 *
	 * @return st MOTIV O GAST O ILICITO
	 */
	public Object getSt_MOTIVO_GASTO_ILICITO() {
		return st_MOTIVO_GASTO_ILICITO;
	}
	
	/**
	 * Sets st MOTIV O GAST O ILICITO.
	 *
	 * @param st_MOTIVO_GASTO_ILICITO new st MOTIV O GAST O ILICITO
	 */
	public void setSt_MOTIVO_GASTO_ILICITO(Object st_MOTIVO_GASTO_ILICITO) {
		this.st_MOTIVO_GASTO_ILICITO = st_MOTIVO_GASTO_ILICITO;
	}
	
	/**
	 * Gets ds MOTIV O OUTROS.
	 *
	 * @return ds MOTIV O OUTROS
	 */
	public Object getDs_MOTIVO_OUTROS() {
		return ds_MOTIVO_OUTROS;
	}
	
	/**
	 * Sets ds MOTIV O OUTROS.
	 *
	 * @param ds_MOTIVO_OUTROS new ds MOTIV O OUTROS
	 */
	public void setDs_MOTIVO_OUTROS(Object ds_MOTIVO_OUTROS) {
		this.ds_MOTIVO_OUTROS = ds_MOTIVO_OUTROS;
	}
}