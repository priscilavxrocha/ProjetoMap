package br.com.projeto.business;


import br.com.projeto.modelo.Paciente;
import br.com.projeto.utils.Constantes;

public class CadastrarPaciente {
	
	public String cadastraPaciente(String nome, String cpf, String telefone, String email) throws Exception {
		
		try {
			Paciente paciente = new Paciente();
			paciente.setCpf(cpf);
			paciente.setNome(nome);
			paciente.setEmail(email);
			paciente.setTelefone(telefone);
			
//			PacienteBusiness salvarPaciente = new PacienteBusiness();
//			salvarPaciente.save(paciente);
			
			return Constantes.MSG_CAD_PACIENTE_SUCESSO;
		
		}catch (Exception e) {
			return Constantes.MSG_CAD_PACIENTE_ERRO;
		}
	}

}
