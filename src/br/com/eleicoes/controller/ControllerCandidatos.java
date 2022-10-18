package br.com.eleicoes.controller;

public class ControllerCandidatos {
	
	public static void controlStep(int step, String respostaUsuario) {
		switch (step) {
		case 1:
			StepUm.executar(respostaUsuario);
			break;
		case 2:
			StepDois.executar(respostaUsuario);
			break;
		case 3:
			StepTres.executar(respostaUsuario);
	
		default:
			break;
		}
	}

}
