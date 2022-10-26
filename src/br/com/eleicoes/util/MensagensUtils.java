package br.com.eleicoes.util;

import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import br.com.eleicoes.model.Candidato;
import br.com.eleicoes.model.CandidatoPrincipal;

public class MensagensUtils {

	public static final String MENSAGEM_INICIAL_CANDIDATOS = 
			"Escolha uma das opções para pesquisa do seu candidato: \n"
			+ "\n1 - Presidente"
			+ "\n2 - Governador"
			+ "\n3 - Senador"
			+ "\n4 - Deputado Federal"
			+ "\n5 - Deputado Estadual";
	
	public static final String MENSAGEM_REGIOES = 
			"De qual região é o seu candidato: \n"
			+ "\n1 - Norte"
			+ "\n2 - Nordeste"
			+ "\n3 - Centro-Oeste"
			+ "\n4 - Sudeste"
			+ "\n5 - Sul"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_NORTE = 
			"De qual estado é o seu candidato: \n"
			+ "\n1 - Acre"
			+ "\n2 - Amazonas"
			+ "\n3 - Amapá"
			+ "\n4 - Pará"
			+ "\n5 - Rondônia"
			+ "\n6 - Roraima"
			+ "\n7 - Tocantins"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_NORDESTE = 
			"De qual estado é o seu candidato: \n"
			+ "\n1 - Alagoas"
			+ "\n2 - Bahia"
			+ "\n3 - Ceará"
			+ "\n4 - Maranhão"
			+ "\n5 - Paraíba"
			+ "\n6 - Pernambuco"
			+ "\n7 - Piaui"
			+ "\n8 - Rio Grande do Norte"
			+ "\n9 - Sergipe"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_CENTRO_OESTE = 
			"De qual estado é o seu candidato: \n"
			+ "\n1 - Distrito Federal"
			+ "\n2 - Goiás"
			+ "\n3 - Mato Grosso do Sul"
			+ "\n4 - Mato Grosso"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_SUDESTE = 
			"De qual estado é o seu candidato: \n"
			+ "\n1 - Espírito Santo"
			+ "\n2 - Minas Gerais"
			+ "\n3 - Rio de Janeio"
			+ "\n4 - São Paulo"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_SUL = 
			"De qual estado é o seu candidato: \n"
			+ "\n1 - Paraná"
			+ "\n2 - Rio Grande do Sul"
			+ "\n3 - Santa Catarina"
			+ "\n\nDigite 'inicio' para começar novamente";
	
	public static final String MENSAGEM_NOME_CANDIDATO = 
			"Qual o nome do seu candidato ?";
	
	public static final String MENSAGEM_ERRO = 
			"Resposta incompatível, favor tente novamente !!!";
	
	public static final String MENSAGEM_ERRO_NOME_CANDIDATO = 
			"Candidato não foi encontrado, favor tente novamente !!!";
	
	public static final String MENSAGEM_ERRO_CANDIDADO_DUPLICADO = 
			"Foi encontrado mais de 1 candidato com esse nome \n"
			+ "Digite o nome completo do candidato...";
	
	public static final String MENSAGEM_REINICIAR_PESQUISA = 
			"Para iniciar nova pesquisa digite 'inicio'";
	
	public static String mensagemCandidatoFormatada(Candidato candidato) {
		return "Número candidato: "+candidato.getNumero()+"\n"
				+ "Nome Urna: "+candidato.getNomeUrna()+"\n"
				+ "Nome Completo: "+candidato.getNomeCompleto()+"\n"
				+ "Cargo: "+candidato.getCargo().getNome()+"\n"
				+ "Situação: "+candidato.getDescricaoTotalizacao()+"\n"
				+ "Partido: "+candidato.getPartido().getSigla() + "\n"				
				+ "O que mais gostaria de saber sobre esse candidato? \n"
				+ "\n1 - Limite de gasto 1º Turno"
				+ "\n2 - Limite de gasto 2º Turno"
				+ "\n3 - Fundo Partidário Utilizado"
				+ "\n4 - Fundo Especial Utilizado";
	}
	
	public static String nomeCandidato (List<String> listaTodosCandidatos) {
		return listaTodosCandidatos + "\n";
	}
	
	
	public static String outrasInfosCandidatos (CandidatoPrincipal candidatoPrincipal, String respostaUsuario) {
		String mensagemRetorno = "";
		switch (respostaUsuario) {
		case "1":
			mensagemRetorno = "Limite de gasto 1º Turno R$: " + String.format("%.2f", candidatoPrincipal.getDespesas().getLimiteDeGasto1T());
			break;
		case "2":
			mensagemRetorno = "Limite de gasto 2º Turno R$: " + String.format("%.2f", candidatoPrincipal.getDespesas().getLimiteDeGasto2T());
			break;
		case "3":
			mensagemRetorno = "Fundo partidário R$: " + String.format("%.2f", candidatoPrincipal.getDespesas().getFundosPartidarios());
			break;
		case "4":
			mensagemRetorno = "Fundo Especial R$: " +String.format("%.2f", candidatoPrincipal.getDespesas().getFundoEspecial());
			break;
		}
		return mensagemRetorno;

	}
	
			
	
	public static String getMensagemEstadoById(String idMensagem) {
		String mensagemRetorno = "";
		switch (idMensagem) {
		case "1":
			mensagemRetorno = MENSAGEM_NORTE;
			break;
		case "2":
			mensagemRetorno = MENSAGEM_NORDESTE;
			break;
		case "3":
			mensagemRetorno = MENSAGEM_CENTRO_OESTE;
			break;
		case "4":
			mensagemRetorno = MENSAGEM_SUDESTE;
			break;
		case "5":
			mensagemRetorno = MENSAGEM_SUL;
			break;
		}
		return mensagemRetorno;
	}
	
	public static String getEstadoCandidato(String idRegiao, String codigoEstado) {
		String mensagemRetorno = "";
		switch (idRegiao) {
		case "1":
			Map<String, String> mapNorte = ImmutableMap.of("1","AC","2","AM","3","AP","4","PA","5","RO","6","RR","7","TO");
			mensagemRetorno = mapNorte.get(codigoEstado);
			break;
		case "2":
			Map<String, String> mapNordeste = ImmutableMap.of("1","AL","2","BA","3","CE","4","MA","5","PB","6","PE","7","PI","8","RN","9","SE");
			mensagemRetorno = mapNordeste.get(codigoEstado);			
			break;
		case "3":
			Map<String, String> mapCentroOeste = ImmutableMap.of("1","DF","2","GO","3","MS","4","MT");
			mensagemRetorno = mapCentroOeste.get(codigoEstado);
			break;
		case "4":
			Map<String, String> mapSudeste = ImmutableMap.of("1","ES","2","MG","3","RJ","4","SP");
			mensagemRetorno = mapSudeste.get(codigoEstado);
			break;
		case "5":
			Map<String, String> mapSul = ImmutableMap.of("1","PR","2","RS","3","SC");
			mensagemRetorno = mapSul.get(codigoEstado);
			break;
		}
		return mensagemRetorno;
	}
	
	public static String getCargoCandidato(String codCargo) {
		String mensagemRetorno = "";
		switch (codCargo) {
		case "1":
			mensagemRetorno = "1";
			break;
		case "2":
			mensagemRetorno = "3";		
			break;
		case "3":
			mensagemRetorno = "5";
			break;
		case "4":
			mensagemRetorno = "6";
			break;
		case "5":
			mensagemRetorno = "7";
			break;
		}
		return mensagemRetorno;
	}
}
