package br.com.projeto.business;

import java.util.Calendar;

import br.com.projeto.modelo.Atendente;
import br.com.projeto.modelo.Consulta;
import br.com.projeto.modelo.Paciente;
import br.com.projeto.modelo.Usuario;
import br.com.projeto.utils.Constantes;


public class AgendarConsulta {
	
	
	public String agendarConsulta(Atendente a, Paciente p, Usuario usuario, Calendar data, Boolean retorno) throws Exception {
		
		try {
			Consulta consulta = new Consulta();
			consulta.setAtendente(a);
			consulta.setPaciente(p);
			consulta.setDataConsulta(data);
			consulta.setUsuario(usuario);
			consulta.setRetorno(retorno);
			
			ConsultaDaoFacade salvarConsulta = new ConsultaDaoFacade();
			salvarConsulta.save(consulta);
			
			return Constantes.MSG_AGENDAMENTO_SUCESSO;
				
		}catch (Exception e) {
			
			return Constantes.MSG_AGENDAMENTO_ERRO;
		}
	}
	

}
