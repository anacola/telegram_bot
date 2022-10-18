package br.com.eleicoes.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.eleicoes.model.Candidato;
import br.com.eleicoes.model.CandidatoPrincipal;
import br.com.eleicoes.model.EleicaoPrincipal;

public class CandidatoService {
	
	public static List<Candidato> listarCandidatos(String paisOuEstado, String codigoTipoCandidato) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> entity = getHttpEntity();
        String url = "https://divulgacandcontas.tse.jus.br/divulga/rest/v1/candidatura/listar/2022/{paisOuEstado}/2040602022/{codigoTipoCandidato}/candidatos";
        Map<String, String> params = new HashMap<String, String>();
        params.put("paisOuEstado", paisOuEstado);
        params.put("codigoTipoCandidato", codigoTipoCandidato);
        
        ResponseEntity<EleicaoPrincipal> response = restTemplate.exchange(url, HttpMethod.GET,entity,EleicaoPrincipal.class,params);
        return response.getBody().getCandidatos();
	}
	
	public static CandidatoPrincipal detalhesCandidato(String paisOuEstado, String codigoTipoCandidato, String nrPartido, String nrCandidato, String idCandidato) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> entity = getHttpEntity();
		String url = "https://divulgacandcontas.tse.jus.br/divulga/rest/v1/prestador/consulta/2040602022/2022/{paisOuEstado}/{codigoTipoCandidato}/{nrPartido}/{nrCandidato}/{idCandidato}";
        Map<String, String> params = new HashMap<String, String>();
        params.put("paisOuEstado", paisOuEstado);
        params.put("codigoTipoCandidato", codigoTipoCandidato);
        params.put("nrPartido", nrPartido);
        params.put("nrCandidato", nrCandidato);
        params.put("idCandidato", idCandidato);
		
        ResponseEntity<CandidatoPrincipal> response = restTemplate.exchange(url, HttpMethod.GET,entity,CandidatoPrincipal.class,params);
        return response.getBody();
		
	}
	
	private static HttpEntity<String> getHttpEntity() {
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        return entity;
	}
}
