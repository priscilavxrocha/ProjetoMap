package br.com.projeto.modelo;

public class AtendenteFactory {
	
	public AtendenteFactory() {}

	public Atendente getTipo(String tipo, String esp, String codUnico, String nome){
		
		if (tipo.equals("medico")) {
			return new Medico(tipo, esp, codUnico, nome);
		
		}else if (tipo.equals("dentista")) {
			return new Dentista(tipo, esp, codUnico, nome);
		
		}else if (tipo.equals("nutricionista")) {
			return new Nutricionista(tipo, esp, codUnico, nome);
		
		}else { 
			return null;
		}
	
	}
}	
