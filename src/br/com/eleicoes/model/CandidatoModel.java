package br.com.eleicoes.model;

public class CandidatoModel {
	  private long id = 0;
	  private String nomeUrna = null;
	  private String numero = null;
	  private String idCandidatoSuperior = null;
	  private String nomeCompleto = null;
	  private String descricaoSexo = null;
	  private String dataDeNascimento = null;
	  private String tituloEleitor = null;
	  private String cpf = null;
	  private String descricaoEstadoCivil = null;
	  private String descricaoCorRaca = null;
	  private String descricaoSituacao = null;
	  private String nacionalidade = null;
	  private String grauInstrucao = null;
	  private String ocupacao = null;
	  private String gastoCampanha1T = null;
	  private String gastoCampanha2T = null;
	  private String sgUfNascimento = null;
	  private String nomeMunicipioNascimento = null;
	  private String localCandidatura = null;
	  private String ufCandidatura = null;
	  private String ufSuperiorCandidatura = null;
	  private String dataUltimaAtualizacao = null;
	  private String fotoUrl = null;
	  private String fotoDataUltimaAtualizacao = null;
	  private String descricaoTotalizacao = null;
	  private String nomeColigacao = null;
	  private String composicaoColigacao = null;
	  private String descricaoTipoDrap = null;
	  private String numeroProcessoDrap = null;
	  private String numeroProcessoDrapEncrypt = null;
	  private String numeroProcesso = null;
	  private String numeroProcessoEncrypt = null;
	  private String numeroProcessoPrestContas = null;
	  private String numeroProcessoPrestContasEncrypt = null;
	  private String numeroProtocolo = null;
	  private CargoModel cargo = null;
	  private String bens = null;
	  private String totalDeBens = null;
	  private String vices = null;
	  private PartidoModel partido = null;
	  private EleicaoModel eleicao = null;
	  private String emails = null;
	  private String sites = null;
	  private String arquivos = null;
	  private String eleicoesAnteriores = null;
	  private String substituto = null;
	  private String motivos = null;
	  private String codigoSituacaoCandidato = null;
	  private String descricaoSituacaoCandidato = null;
	  private String isCandidatoInapto = null;
	  private String codigoSituacaoPartido = null;
	  private String descricaoSituacaoPartido = null;
	  private String isCandFechado = null;
	  private String cnpjcampanha = null;
	  private double gastoCampanha = 0;
	  private String descricaoNaturalidade;
	  private String st_SUBSTITUIDO = null;
	  private String st_MOTIVO_IND_PARTIDO = null;
	  private String st_DIVULGA = null;
	  private String st_DIVULGA_BENS = null;
	  private boolean st_REELEICAO;
	  private String st_DIVULGA_ARQUIVOS = null;
	  private String st_MOTIVO_FICHA_LIMPA = null;
	  private String st_MOTIVO_ABUSO_PODER = null;
	  private String st_MOTIVO_COMPRA_VOTO = null;
	  private String st_MOTIVO_CONDUTA_VEDADA = null;
	  private String st_MOTIVO_GASTO_ILICITO = null;
	  private String ds_MOTIVO_OUTROS = null;
	  private String st_MOTIVO_AUSENCIA_REQUISITO = null;


	 // Getter Methods 

	  public long getId() {
	    return id;
	  }

	  public String getNomeUrna() {
	    return nomeUrna;
	  }

	  public String getNumero() {
	    return numero;
	  }

	  public String getIdCandidatoSuperior() {
	    return idCandidatoSuperior;
	  }

	  public String getNomeCompleto() {
	    return nomeCompleto;
	  }

	  public String getDescricaoSexo() {
	    return descricaoSexo;
	  }

	  public String getDataDeNascimento() {
	    return dataDeNascimento;
	  }

	  public String getTituloEleitor() {
	    return tituloEleitor;
	  }

	  public String getCpf() {
	    return cpf;
	  }

	  public String getDescricaoEstadoCivil() {
	    return descricaoEstadoCivil;
	  }

	  public String getDescricaoCorRaca() {
	    return descricaoCorRaca;
	  }

	  public String getDescricaoSituacao() {
	    return descricaoSituacao;
	  }

	  public String getNacionalidade() {
	    return nacionalidade;
	  }

	  public String getGrauInstrucao() {
	    return grauInstrucao;
	  }

	  public String getOcupacao() {
	    return ocupacao;
	  }

	  public String getGastoCampanha1T() {
	    return gastoCampanha1T;
	  }

	  public String getGastoCampanha2T() {
	    return gastoCampanha2T;
	  }

	  public String getSgUfNascimento() {
	    return sgUfNascimento;
	  }

	  public String getNomeMunicipioNascimento() {
	    return nomeMunicipioNascimento;
	  }

	  public String getLocalCandidatura() {
	    return localCandidatura;
	  }

	  public String getUfCandidatura() {
	    return ufCandidatura;
	  }

	  public String getUfSuperiorCandidatura() {
	    return ufSuperiorCandidatura;
	  }

	  public String getDataUltimaAtualizacao() {
	    return dataUltimaAtualizacao;
	  }

	  public String getFotoUrl() {
	    return fotoUrl;
	  }

	  public String getFotoDataUltimaAtualizacao() {
	    return fotoDataUltimaAtualizacao;
	  }

	  public String getDescricaoTotalizacao() {
	    return descricaoTotalizacao;
	  }

	  public String getNomeColigacao() {
	    return nomeColigacao;
	  }

	  public String getComposicaoColigacao() {
	    return composicaoColigacao;
	  }

	  public String getDescricaoTipoDrap() {
	    return descricaoTipoDrap;
	  }

	  public String getNumeroProcessoDrap() {
	    return numeroProcessoDrap;
	  }

	  public String getNumeroProcessoDrapEncrypt() {
	    return numeroProcessoDrapEncrypt;
	  }

	  public String getNumeroProcesso() {
	    return numeroProcesso;
	  }

	  public String getNumeroProcessoEncrypt() {
	    return numeroProcessoEncrypt;
	  }

	  public String getNumeroProcessoPrestContas() {
	    return numeroProcessoPrestContas;
	  }

	  public String getNumeroProcessoPrestContasEncrypt() {
	    return numeroProcessoPrestContasEncrypt;
	  }

	  public String getNumeroProtocolo() {
	    return numeroProtocolo;
	  }

	  public CargoModel getCargo() {
	    return cargo;
	  }

	  public String getBens() {
	    return bens;
	  }

	  public String getTotalDeBens() {
	    return totalDeBens;
	  }

	  public String getVices() {
	    return vices;
	  }

	  public PartidoModel getPartido() {
	    return partido;
	  }

	  public EleicaoModel getEleicao() {
	    return eleicao;
	  }

	  public String getEmails() {
	    return emails;
	  }

	  public String getSites() {
	    return sites;
	  }

	  public String getArquivos() {
	    return arquivos;
	  }

	  public String getEleicoesAnteriores() {
	    return eleicoesAnteriores;
	  }

	  public String getSubstituto() {
	    return substituto;
	  }

	  public String getMotivos() {
	    return motivos;
	  }

	  public String getCodigoSituacaoCandidato() {
	    return codigoSituacaoCandidato;
	  }

	  public String getDescricaoSituacaoCandidato() {
	    return descricaoSituacaoCandidato;
	  }

	  public String getIsCandidatoInapto() {
	    return isCandidatoInapto;
	  }

	  public String getCodigoSituacaoPartido() {
	    return codigoSituacaoPartido;
	  }

	  public String getDescricaoSituacaoPartido() {
	    return descricaoSituacaoPartido;
	  }

	  public String getIsCandFechado() {
	    return isCandFechado;
	  }

	  public String getCnpjcampanha() {
	    return cnpjcampanha;
	  }

	  public double getGastoCampanha() {
	    return gastoCampanha;
	  }

	  public String getDescricaoNaturalidade() {
	    return descricaoNaturalidade;
	  }

	  public String getSt_SUBSTITUIDO() {
	    return st_SUBSTITUIDO;
	  }

	  public String getSt_MOTIVO_IND_PARTIDO() {
	    return st_MOTIVO_IND_PARTIDO;
	  }

	  public String getSt_DIVULGA() {
	    return st_DIVULGA;
	  }

	  public String getSt_DIVULGA_BENS() {
	    return st_DIVULGA_BENS;
	  }

	  public boolean getSt_REELEICAO() {
	    return st_REELEICAO;
	  }

	  public String getSt_DIVULGA_ARQUIVOS() {
	    return st_DIVULGA_ARQUIVOS;
	  }

	  public String getSt_MOTIVO_FICHA_LIMPA() {
	    return st_MOTIVO_FICHA_LIMPA;
	  }

	  public String getSt_MOTIVO_ABUSO_PODER() {
	    return st_MOTIVO_ABUSO_PODER;
	  }

	  public String getSt_MOTIVO_COMPRA_VOTO() {
	    return st_MOTIVO_COMPRA_VOTO;
	  }

	  public String getSt_MOTIVO_CONDUTA_VEDADA() {
	    return st_MOTIVO_CONDUTA_VEDADA;
	  }

	  public String getSt_MOTIVO_GASTO_ILICITO() {
	    return st_MOTIVO_GASTO_ILICITO;
	  }

	  public String getDs_MOTIVO_OUTROS() {
	    return ds_MOTIVO_OUTROS;
	  }

	  public String getSt_MOTIVO_AUSENCIA_REQUISITO() {
	    return st_MOTIVO_AUSENCIA_REQUISITO;
	  }

	 // Setter Methods 

	  public void setId( long id ) {
	    this.id = id;
	  }

	  public void setNomeUrna( String nomeUrna ) {
	    this.nomeUrna = nomeUrna;
	  }

	  public void setNumero( String numero ) {
	    this.numero = numero;
	  }

	  public void setIdCandidatoSuperior( String idCandidatoSuperior ) {
	    this.idCandidatoSuperior = idCandidatoSuperior;
	  }

	  public void setNomeCompleto( String nomeCompleto ) {
	    this.nomeCompleto = nomeCompleto;
	  }

	  public void setDescricaoSexo( String descricaoSexo ) {
	    this.descricaoSexo = descricaoSexo;
	  }

	  public void setDataDeNascimento( String dataDeNascimento ) {
	    this.dataDeNascimento = dataDeNascimento;
	  }

	  public void setTituloEleitor( String tituloEleitor ) {
	    this.tituloEleitor = tituloEleitor;
	  }

	  public void setCpf( String cpf ) {
	    this.cpf = cpf;
	  }

	  public void setDescricaoEstadoCivil( String descricaoEstadoCivil ) {
	    this.descricaoEstadoCivil = descricaoEstadoCivil;
	  }

	  public void setDescricaoCorRaca( String descricaoCorRaca ) {
	    this.descricaoCorRaca = descricaoCorRaca;
	  }

	  public void setDescricaoSituacao( String descricaoSituacao ) {
	    this.descricaoSituacao = descricaoSituacao;
	  }

	  public void setNacionalidade( String nacionalidade ) {
	    this.nacionalidade = nacionalidade;
	  }

	  public void setGrauInstrucao( String grauInstrucao ) {
	    this.grauInstrucao = grauInstrucao;
	  }

	  public void setOcupacao( String ocupacao ) {
	    this.ocupacao = ocupacao;
	  }

	  public void setGastoCampanha1T( String gastoCampanha1T ) {
	    this.gastoCampanha1T = gastoCampanha1T;
	  }

	  public void setGastoCampanha2T( String gastoCampanha2T ) {
	    this.gastoCampanha2T = gastoCampanha2T;
	  }

	  public void setSgUfNascimento( String sgUfNascimento ) {
	    this.sgUfNascimento = sgUfNascimento;
	  }

	  public void setNomeMunicipioNascimento( String nomeMunicipioNascimento ) {
	    this.nomeMunicipioNascimento = nomeMunicipioNascimento;
	  }

	  public void setLocalCandidatura( String localCandidatura ) {
	    this.localCandidatura = localCandidatura;
	  }

	  public void setUfCandidatura( String ufCandidatura ) {
	    this.ufCandidatura = ufCandidatura;
	  }

	  public void setUfSuperiorCandidatura( String ufSuperiorCandidatura ) {
	    this.ufSuperiorCandidatura = ufSuperiorCandidatura;
	  }

	  public void setDataUltimaAtualizacao( String dataUltimaAtualizacao ) {
	    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	  }

	  public void setFotoUrl( String fotoUrl ) {
	    this.fotoUrl = fotoUrl;
	  }

	  public void setFotoDataUltimaAtualizacao( String fotoDataUltimaAtualizacao ) {
	    this.fotoDataUltimaAtualizacao = fotoDataUltimaAtualizacao;
	  }

	  public void setDescricaoTotalizacao( String descricaoTotalizacao ) {
	    this.descricaoTotalizacao = descricaoTotalizacao;
	  }

	  public void setNomeColigacao( String nomeColigacao ) {
	    this.nomeColigacao = nomeColigacao;
	  }

	  public void setComposicaoColigacao( String composicaoColigacao ) {
	    this.composicaoColigacao = composicaoColigacao;
	  }

	  public void setDescricaoTipoDrap( String descricaoTipoDrap ) {
	    this.descricaoTipoDrap = descricaoTipoDrap;
	  }

	  public void setNumeroProcessoDrap( String numeroProcessoDrap ) {
	    this.numeroProcessoDrap = numeroProcessoDrap;
	  }

	  public void setNumeroProcessoDrapEncrypt( String numeroProcessoDrapEncrypt ) {
	    this.numeroProcessoDrapEncrypt = numeroProcessoDrapEncrypt;
	  }

	  public void setNumeroProcesso( String numeroProcesso ) {
	    this.numeroProcesso = numeroProcesso;
	  }

	  public void setNumeroProcessoEncrypt( String numeroProcessoEncrypt ) {
	    this.numeroProcessoEncrypt = numeroProcessoEncrypt;
	  }

	  public void setNumeroProcessoPrestContas( String numeroProcessoPrestContas ) {
	    this.numeroProcessoPrestContas = numeroProcessoPrestContas;
	  }

	  public void setNumeroProcessoPrestContasEncrypt( String numeroProcessoPrestContasEncrypt ) {
	    this.numeroProcessoPrestContasEncrypt = numeroProcessoPrestContasEncrypt;
	  }

	  public void setNumeroProtocolo( String numeroProtocolo ) {
	    this.numeroProtocolo = numeroProtocolo;
	  }

	  public void setCargo( CargoModel cargo ) {
	    this.cargo = cargo;
	  }

	  public void setBens( String bens ) {
	    this.bens = bens;
	  }

	  public void setTotalDeBens( String totalDeBens ) {
	    this.totalDeBens = totalDeBens;
	  }

	  public void setVices( String vices ) {
	    this.vices = vices;
	  }

	  public void setPartido( PartidoModel partido ) {
	    this.partido = partido;
	  }

	  public void setEleicao( EleicaoModel eleicao ) {
	    this.eleicao = eleicao;
	  }

	  public void setEmails( String emails ) {
	    this.emails = emails;
	  }

	  public void setSites( String sites ) {
	    this.sites = sites;
	  }

	  public void setArquivos( String arquivos ) {
	    this.arquivos = arquivos;
	  }

	  public void setEleicoesAnteriores( String eleicoesAnteriores ) {
	    this.eleicoesAnteriores = eleicoesAnteriores;
	  }

	  public void setSubstituto( String substituto ) {
	    this.substituto = substituto;
	  }

	  public void setMotivos( String motivos ) {
	    this.motivos = motivos;
	  }

	  public void setCodigoSituacaoCandidato( String codigoSituacaoCandidato ) {
	    this.codigoSituacaoCandidato = codigoSituacaoCandidato;
	  }

	  public void setDescricaoSituacaoCandidato( String descricaoSituacaoCandidato ) {
	    this.descricaoSituacaoCandidato = descricaoSituacaoCandidato;
	  }

	  public void setIsCandidatoInapto( String isCandidatoInapto ) {
	    this.isCandidatoInapto = isCandidatoInapto;
	  }

	  public void setCodigoSituacaoPartido( String codigoSituacaoPartido ) {
	    this.codigoSituacaoPartido = codigoSituacaoPartido;
	  }

	  public void setDescricaoSituacaoPartido( String descricaoSituacaoPartido ) {
	    this.descricaoSituacaoPartido = descricaoSituacaoPartido;
	  }

	  public void setIsCandFechado( String isCandFechado ) {
	    this.isCandFechado = isCandFechado;
	  }

	  public void setCnpjcampanha( String cnpjcampanha ) {
	    this.cnpjcampanha = cnpjcampanha;
	  }

	  public void setGastoCampanha( double gastoCampanha ) {
	    this.gastoCampanha = gastoCampanha;
	  }

	  public void setDescricaoNaturalidade( String descricaoNaturalidade ) {
	    this.descricaoNaturalidade = descricaoNaturalidade;
	  }

	  public void setSt_SUBSTITUIDO( String st_SUBSTITUIDO ) {
	    this.st_SUBSTITUIDO = st_SUBSTITUIDO;
	  }

	  public void setSt_MOTIVO_IND_PARTIDO( String st_MOTIVO_IND_PARTIDO ) {
	    this.st_MOTIVO_IND_PARTIDO = st_MOTIVO_IND_PARTIDO;
	  }

	  public void setSt_DIVULGA( String st_DIVULGA ) {
	    this.st_DIVULGA = st_DIVULGA;
	  }

	  public void setSt_DIVULGA_BENS( String st_DIVULGA_BENS ) {
	    this.st_DIVULGA_BENS = st_DIVULGA_BENS;
	  }

	  public void setSt_REELEICAO( boolean st_REELEICAO ) {
	    this.st_REELEICAO = st_REELEICAO;
	  }

	  public void setSt_DIVULGA_ARQUIVOS( String st_DIVULGA_ARQUIVOS ) {
	    this.st_DIVULGA_ARQUIVOS = st_DIVULGA_ARQUIVOS;
	  }

	  public void setSt_MOTIVO_FICHA_LIMPA( String st_MOTIVO_FICHA_LIMPA ) {
	    this.st_MOTIVO_FICHA_LIMPA = st_MOTIVO_FICHA_LIMPA;
	  }

	  public void setSt_MOTIVO_ABUSO_PODER( String st_MOTIVO_ABUSO_PODER ) {
	    this.st_MOTIVO_ABUSO_PODER = st_MOTIVO_ABUSO_PODER;
	  }

	  public void setSt_MOTIVO_COMPRA_VOTO( String st_MOTIVO_COMPRA_VOTO ) {
	    this.st_MOTIVO_COMPRA_VOTO = st_MOTIVO_COMPRA_VOTO;
	  }

	  public void setSt_MOTIVO_CONDUTA_VEDADA( String st_MOTIVO_CONDUTA_VEDADA ) {
	    this.st_MOTIVO_CONDUTA_VEDADA = st_MOTIVO_CONDUTA_VEDADA;
	  }

	  public void setSt_MOTIVO_GASTO_ILICITO( String st_MOTIVO_GASTO_ILICITO ) {
	    this.st_MOTIVO_GASTO_ILICITO = st_MOTIVO_GASTO_ILICITO;
	  }

	  public void setDs_MOTIVO_OUTROS( String ds_MOTIVO_OUTROS ) {
	    this.ds_MOTIVO_OUTROS = ds_MOTIVO_OUTROS;
	  }

	  public void setSt_MOTIVO_AUSENCIA_REQUISITO( String st_MOTIVO_AUSENCIA_REQUISITO ) {
	    this.st_MOTIVO_AUSENCIA_REQUISITO = st_MOTIVO_AUSENCIA_REQUISITO;
	  }

	@Override
	public String toString() {
		return "CandidatoModel [id=" + id + ", nomeUrna=" + nomeUrna + ", numero=" + numero + ", idCandidatoSuperior="
				+ idCandidatoSuperior + ", nomeCompleto=" + nomeCompleto + ", descricaoSexo=" + descricaoSexo
				+ ", dataDeNascimento=" + dataDeNascimento + ", tituloEleitor=" + tituloEleitor + ", cpf=" + cpf
				+ ", descricaoEstadoCivil=" + descricaoEstadoCivil + ", descricaoCorRaca=" + descricaoCorRaca
				+ ", descricaoSituacao=" + descricaoSituacao + ", nacionalidade=" + nacionalidade + ", grauInstrucao="
				+ grauInstrucao + ", ocupacao=" + ocupacao + ", gastoCampanha1T=" + gastoCampanha1T
				+ ", gastoCampanha2T=" + gastoCampanha2T + ", sgUfNascimento=" + sgUfNascimento
				+ ", nomeMunicipioNascimento=" + nomeMunicipioNascimento + ", localCandidatura=" + localCandidatura
				+ ", ufCandidatura=" + ufCandidatura + ", ufSuperiorCandidatura=" + ufSuperiorCandidatura
				+ ", dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", fotoUrl=" + fotoUrl
				+ ", fotoDataUltimaAtualizacao=" + fotoDataUltimaAtualizacao + ", descricaoTotalizacao="
				+ descricaoTotalizacao + ", nomeColigacao=" + nomeColigacao + ", composicaoColigacao="
				+ composicaoColigacao + ", descricaoTipoDrap=" + descricaoTipoDrap + ", numeroProcessoDrap="
				+ numeroProcessoDrap + ", numeroProcessoDrapEncrypt=" + numeroProcessoDrapEncrypt + ", numeroProcesso="
				+ numeroProcesso + ", numeroProcessoEncrypt=" + numeroProcessoEncrypt + ", numeroProcessoPrestContas="
				+ numeroProcessoPrestContas + ", numeroProcessoPrestContasEncrypt=" + numeroProcessoPrestContasEncrypt
				+ ", numeroProtocolo=" + numeroProtocolo + ", cargo=" + cargo.toString() + ", bens=" + bens + ", totalDeBens="
				+ totalDeBens + ", vices=" + vices + ", partido=" + partido.toString() + ", eleicao=" + eleicao.toString() + ", emails="
				+ emails + ", sites=" + sites + ", arquivos=" + arquivos + ", eleicoesAnteriores=" + eleicoesAnteriores
				+ ", substituto=" + substituto + ", motivos=" + motivos + ", codigoSituacaoCandidato="
				+ codigoSituacaoCandidato + ", descricaoSituacaoCandidato=" + descricaoSituacaoCandidato
				+ ", isCandidatoInapto=" + isCandidatoInapto + ", codigoSituacaoPartido=" + codigoSituacaoPartido
				+ ", descricaoSituacaoPartido=" + descricaoSituacaoPartido + ", isCandFechado=" + isCandFechado
				+ ", cnpjcampanha=" + cnpjcampanha + ", gastoCampanha=" + gastoCampanha + ", descricaoNaturalidade="
				+ descricaoNaturalidade + ", st_SUBSTITUIDO=" + st_SUBSTITUIDO + ", st_MOTIVO_IND_PARTIDO="
				+ st_MOTIVO_IND_PARTIDO + ", st_DIVULGA=" + st_DIVULGA + ", st_DIVULGA_BENS=" + st_DIVULGA_BENS
				+ ", st_REELEICAO=" + st_REELEICAO + ", st_DIVULGA_ARQUIVOS=" + st_DIVULGA_ARQUIVOS
				+ ", st_MOTIVO_FICHA_LIMPA=" + st_MOTIVO_FICHA_LIMPA + ", st_MOTIVO_ABUSO_PODER="
				+ st_MOTIVO_ABUSO_PODER + ", st_MOTIVO_COMPRA_VOTO=" + st_MOTIVO_COMPRA_VOTO
				+ ", st_MOTIVO_CONDUTA_VEDADA=" + st_MOTIVO_CONDUTA_VEDADA + ", st_MOTIVO_GASTO_ILICITO="
				+ st_MOTIVO_GASTO_ILICITO + ", ds_MOTIVO_OUTROS=" + ds_MOTIVO_OUTROS + ", st_MOTIVO_AUSENCIA_REQUISITO="
				+ st_MOTIVO_AUSENCIA_REQUISITO + "]";
	}
	}