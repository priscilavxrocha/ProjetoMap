package br.com.projeto.modelo;


public class Dentista extends Atendente {
	
	public Dentista(String tipo, String especialidade, String codUnico, String nome){
		this.setCodUnico(codUnico);
		this.setEspecialidade(especialidade);
		this.setNome(nome);
		this.setTipo(tipo);
	}

	public String imprimeAtendente() {
		return "Dentista: "+ this.getNome() + "\n CRO: "+this.getCodUnico()+"\n Especialidade: "+this.getEspecialidade();
	}

}
