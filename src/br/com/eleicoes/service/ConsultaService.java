package br.com.eleicoes.service;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ConsultaService extends ServiceMain {
	
	public HttpResponse<String> consultarCandidato(String estadoCandidato, int tipoCandidato, String codigoPartido, String codigoUrna, long idCandidato)
			throws IOException, InterruptedException {
		
		String path = String.format(
				"/divulga/rest/v1/prestador/consulta/2040602022/2022/%s/%s/%s/%s/%s", 
					estadoCandidato, tipoCandidato, codigoPartido, codigoUrna, idCandidato);
		
		return super.executeService(path, "ConsultaCandidato");
	}
}
