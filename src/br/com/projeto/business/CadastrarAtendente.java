package br.com.projeto.business;

import br.com.projeto.modelo.Atendente;
import br.com.projeto.modelo.AtendenteFactory;

public class CadastrarAtendente {

	public static Atendente cadastraAtendente(String tipo, String especialidade, String codUnico, String nome){
		
		//instacia a fabrica
		AtendenteFactory af = new AtendenteFactory();
		
		//cria objeto Atendente através da fábrica
		Atendente atendente = af.getTipo(tipo, especialidade, codUnico, nome);
		
		return atendente;
	}
	
}
