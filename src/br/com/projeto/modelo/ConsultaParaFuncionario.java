package br.com.projeto.modelo;

public class ConsultaParaFuncionario implements DescontoConsultaStrategy{
	
	
	
	public double calcula(ValorConsulta valorConsulta) {
		 return valorConsulta.getValor() * 0.5;
		
	}

}
