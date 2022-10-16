package br.com.eleicoes.service;

import java.io.IOException;
import java.net.http.HttpResponse;

public class ListagemService extends ServiceMain {		

	public HttpResponse<String> listarCandidatos(String estadoCandidatos, int tipoCandidatos)
			throws IOException, InterruptedException {
		
		String path = String.format(
				"/divulga/rest/v1/candidatura/listar/2022/%s/2040602022/%s/candidatos", 
					estadoCandidatos, tipoCandidatos);
		
		return super.executeService(path, "ListagemCandidatos");
	}
}
