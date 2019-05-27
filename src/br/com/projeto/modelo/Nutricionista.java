package br.com.projeto.modelo;


public class Nutricionista extends Atendente {
	
	public Nutricionista (String tipo, String especialidade, String codUnico, String nome){
		this.setCodUnico(codUnico);
		this.setEspecialidade(especialidade);
		this.setNome(nome);
		this.setTipo(tipo);
	}

	public String imprimeAtendente() {
		return "Nutricionista(a): "+ this.getNome() + "\n CRN: "+this.getCodUnico()+"\n Especialidade: "+this.getEspecialidade();
	}

}
