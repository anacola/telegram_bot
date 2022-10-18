package br.com.eleicoes.util;

import java.text.Normalizer;
import java.util.List;
import java.util.stream.Collectors;

import br.com.eleicoes.model.Candidato;

public class CandidatoUtils {

	public static List<Candidato> filtrarCandidato(List<Candidato> listaCandidatos, String nomeCandidato) {
		return listaCandidatos.stream().filter(candidato -> removeAcentos(candidato.getNomeUrna().toLowerCase())
				.contains(removeAcentos(nomeCandidato.toLowerCase()))).collect(Collectors.toList());
	}

	public static String removeAcentos(String string) {
		if (string != null) {
			string = Normalizer.normalize(string, Normalizer.Form.NFD);
			string = string.replaceAll("[^\\p{ASCII}]", "");
		}
		return string;
	}
}
