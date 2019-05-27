package br.com.projeto.modelo;


public class Medico extends Atendente {
	
	public Medico() {}

	public Medico(String tipo, String especialidade, String codUnico, String nome){
		this.setCodUnico(codUnico);
		this.setEspecialidade(especialidade);
		this.setNome(nome);
		this.setTipo(tipo);
	}

	@Override
	public String imprimeAtendente() {
		return "Médico(a): "+ this.getNome() + "\n CRM: "+this.getCodUnico()+"\n Especialidade: "+this.getEspecialidade();
	}

}
