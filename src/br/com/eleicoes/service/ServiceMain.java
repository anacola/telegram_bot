package br.com.eleicoes.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServiceMain {
	
	private String caminho = "https://divulgacandcontas.tse.jus.br";
	
	protected HttpResponse<String> executeService(String path, String cacheKey) throws IOException, InterruptedException {
		
		String uri = caminho + path;
		
		HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().headers(
				"authority", "divulgacandcontas.tse.jus.br",
				"method", "GET", 
				"Content-Type", "application/json;charset=UTF-8", 
				"path", path,
				"accept-encoding", "json",
				"user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/106.0.0.0 Safari/537.36")
				.build();
		
		/*
		 * if (CacheMain.verificaInformacaoCacheada(cacheKey)) {
		 * System.out.println("Esta Cacheado"); response = (String)
		 * CacheMain.obterInformacaoCacheada(cacheKey); } else {
		 * System.out.println("Nao esta Cacheado"); response = client.send(request,
		 * HttpResponse.BodyHandlers.ofString()).body().toString();
		 * CacheMain.cachearInformacao(cacheKey, response); }
		 */
		
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		return response;
	}
	
}
