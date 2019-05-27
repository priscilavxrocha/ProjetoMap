package br.com.projeto.modelo;

public class CalculadorValorConsulta {
	
	public void realizaCalculoConsulta(ValorConsulta valorConsulta, DescontoConsultaStrategy descontoConsulta) {
		
		double valor = descontoConsulta.calcula(valorConsulta);

        System.out.println("\nValor da consulta com desconto: R$ "+valor); 

      }

}
