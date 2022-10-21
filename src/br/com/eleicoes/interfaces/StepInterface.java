package br.com.eleicoes.interfaces;

import java.util.List;
import br.com.eleicoes.model.InformacoesUmUsuario;

public interface StepInterface {
	
	List<String> executa (String respostaUsuario, InformacoesUmUsuario informacoesUsuario);
	
}
