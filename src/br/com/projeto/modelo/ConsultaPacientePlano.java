package br.com.projeto.modelo;

public class ConsultaPacientePlano implements DescontoConsultaStrategy{
	
		
	public double calcula(ValorConsulta valorConsulta) {
		 return valorConsulta.getValor() * 0.7;
		
	}

}
