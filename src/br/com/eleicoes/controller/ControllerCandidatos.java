package br.com.eleicoes.controller;

public class ControllerCandidatos {
	
	public static void controlStep(int step, String respostaUsuario) {
		switch (step) {
		case 1:
			StepUm.executar(respostaUsuario);
			break;

		default:
			break;
		}
	}

}
