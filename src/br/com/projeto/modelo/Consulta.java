package br.com.projeto.modelo;

import java.util.Calendar;

public class Consulta {

	private Long id;
	private Atendente atendente;
	private Paciente paciente;
	private Calendar dataConsulta;
	private Usuario usuario;
	private Boolean retorno;

	public Consulta() {}
	
	public Consulta(Atendente atendente, Paciente paciente, Calendar dataConsulta, Usuario usuario, Boolean retorno) {
		super();
		this.atendente = atendente;
		this.paciente = paciente;
		this.dataConsulta = dataConsulta;
		this.usuario = usuario;
		this.retorno = retorno;
	}
	
	private String retornoString(Boolean retorno) {
		if(retorno == true) {
			return "Sim";
			
		}return "Não";
	}
	
	public String imprimeConsulta() {
		String ret = retornoString(retorno);
		return "Atendente: "+atendente.getNome()+"\nCategoria: "+atendente.getTipo()+"\nPaciente: "+paciente.getNome()+"\nData: "+dataConsulta.getTime()+
				"\nRetorno: "+ret+"\nAgendamento feito por: "+usuario.getNome();
	}

	
	
	public Long getId() {
		return id;
	}

	public Atendente getAtendente() {
		return atendente;
	}

	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Calendar getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Calendar dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getRetorno() {
		return retorno;
	}

	public void setRetorno(Boolean retorno) {
		this.retorno = retorno;
	}



}
