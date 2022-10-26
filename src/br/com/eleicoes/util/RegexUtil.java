package br.com.eleicoes.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe RegexUtil.
 */
public class RegexUtil {
	
	/**
	 * Valida resposta.
	 *
	 * @param regex de String
	 * @param resposta de String
	 * @return true, if successful
	 */
	public static boolean validaResposta(String regex, String resposta) {
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(resposta);
	    boolean retorno = matcher.find(); 
	    return retorno;
	}
}
