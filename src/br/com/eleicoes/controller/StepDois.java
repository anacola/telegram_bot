package br.com.eleicoes.controller;

import java.util.Arrays;
import java.util.List;

import br.com.eleicoes.enums.RegioesEnum;

public class StepDois {
	
	/*
	 * String validaStepUm (int codTipoCandidato) { if (codTipoCandidato == 1) {
	 * return listaCandidatosPresidente;
	 * 
	 * }
	 * 
	 * }
	 */
	
	public static void executar(String respostaUsuario) {
		List<RegioesEnum> list = Arrays.asList(RegioesEnum.values());
		
		for (RegioesEnum regioesEnum : list) {
			System.out.println(regioesEnum.getRegiao());
			
		}
	
	}
	
}
