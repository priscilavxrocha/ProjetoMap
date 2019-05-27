package br.com.projeto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atendente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	protected String tipo;
	protected String especialidade;
	protected String nome;
	protected String codUnico;
	
	public Atendente() {}
	
	public Atendente(String tipo, String nome, String especialidade, String codUnico){
		this.setTipo(tipo);
		this.setCodUnico(codUnico);
		this.setEspecialidade(especialidade);
		this.setNome(nome);
	}
	
	public String imprimeAtendente() {
		return "Atendente(a): "+ this.getNome() + "\n Cód: "+this.getCodUnico()+"\n Especialidade: "+this.getEspecialidade();
	}
	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodUnico() {
		return codUnico;
	}

	public void setCodUnico(String codUnico) {
		this.codUnico = codUnico;
	}

	public Long getId() {
		return Id;
	}
	
	public void setId(Long id) {
		Id = id;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}

