package br.com.projeto.teste;

import java.util.Calendar;

import br.com.projeto.business.AgendarConsulta;
import br.com.projeto.business.CadastrarAtendente;
import br.com.projeto.modelo.Atendente;
import br.com.projeto.modelo.Paciente;
import br.com.projeto.modelo.Usuario;

public class testeAgendamentoConsulta {

	public static void main(String[] args) throws Exception {
		
		//CRIANDO ATENDENTE
		Atendente atendente = CadastrarAtendente.cadastraAtendente("Medico", "Fernando Araújo", "Oftamologista", "1245");
		
		//INSTACIANDO PACIENTE (subentende-se que foi aplicado o mesmo método usado pra cadastro de atendente nos demais objetos criados.)
		Paciente paciente = new Paciente("Priscilla", "123.456.789-10", "83 9988-7766", "priscilla@email.com");
		
		//INSTANCIANDO USUARIO
		Usuario usuario = new Usuario("funcionario1", "funcionario1@empresa", "12345");
		
		//RECEBEDO DATA E HORA
		Calendar data = Calendar.getInstance();
		data.set(2019, Calendar.JUNE, 10, 15, 30);
		
		//CHAMANDO CLASSE DE AGENDAMENTO DE CONSULTA
		AgendarConsulta ac = new AgendarConsulta();
		String retorno = ac.agendarConsulta(atendente, paciente, usuario, data, false);
		
		//RETORNO DO MÉTODO
		
		System.out.println(retorno);
		
	}

}
