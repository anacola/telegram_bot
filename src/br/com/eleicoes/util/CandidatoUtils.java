package br.com.eleicoes.util;

import java.text.Normalizer;
import java.util.List;
import java.util.stream.Collectors;

import br.com.eleicoes.model.Candidato;

/**
 * Classe CandidatoUtils.
 */
public class CandidatoUtils {

	/**
	 * Filtrar candidato.
	 *
	 * @param listaCandidatos de List<Candidato>
	 * @param nomeCandidato de String
	 * @return List<Candidato>
	 */
	public static List<Candidato> filtrarCandidato(List<Candidato> listaCandidatos, String nomeCandidato) {
		return listaCandidatos.stream().filter(candidato -> removeAcentos(candidato.getNomeUrna().toLowerCase())
				.contains(removeAcentos(nomeCandidato.toLowerCase()))).collect(Collectors.toList());
	}

	/**
	 * Remove acentos.
	 *
	 * @param string de String
	 * @return String
	 */
	public static String removeAcentos(String string) {
		if (string != null) {
			string = Normalizer.normalize(string, Normalizer.Form.NFD);
			string = string.replaceAll("[^\\p{ASCII}]", "");
		}
		return string;
	}
}
