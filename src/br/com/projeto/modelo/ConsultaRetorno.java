package br.com.projeto.modelo;

public class ConsultaRetorno implements DescontoConsultaStrategy {
	
	public double calcula(ValorConsulta valorConsulta) {
		 return valorConsulta.getValor() * 0;
		
	}

}
