package br.com.eleicoes.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {
	public static boolean validaResposta(String regex, String resposta) {
		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(resposta);
	    boolean retorno = matcher.find(); 
	    return retorno;
	}
}
