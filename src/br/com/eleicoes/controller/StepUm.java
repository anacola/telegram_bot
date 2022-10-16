package br.com.eleicoes.controller;

import java.util.Arrays;
import java.util.List;
import br.com.eleicoes.enums.*;

public class StepUm {
	public static void executar(String respostaUsuario) {
		List<TiposCandidatosEnum> list = Arrays.asList(TiposCandidatosEnum.values());
		
		for (TiposCandidatosEnum tiposCandidatosEnum : list) {
			System.out.println(tiposCandidatosEnum.getDescricao());
			
		}
	
	}

}
