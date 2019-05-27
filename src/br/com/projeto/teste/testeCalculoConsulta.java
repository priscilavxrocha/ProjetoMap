package br.com.projeto.teste;

import br.com.projeto.modelo.CalculadorValorConsulta;
import br.com.projeto.modelo.ConsultaPacientePlano;
import br.com.projeto.modelo.ConsultaParaFuncionario;
import br.com.projeto.modelo.ConsultaRetorno;
import br.com.projeto.modelo.DescontoConsultaStrategy;
import br.com.projeto.modelo.ValorConsulta;

public class testeCalculoConsulta {

	
	
	public static void main(String[] args) {
		
		//valor da consulta para funcionario
		DescontoConsultaStrategy funcionario = new ConsultaParaFuncionario();
		
		//valor da consulta de retorno
		DescontoConsultaStrategy retorno = new ConsultaRetorno();
		
		//valor da consulta para pacientes usu�rios de plano de sa�de( planos n�o aceitos na cl�nica)
		DescontoConsultaStrategy pacienteComPlano = new ConsultaPacientePlano();
		
		ValorConsulta valor = new ValorConsulta(300.0);
		
		CalculadorValorConsulta calculador = new CalculadorValorConsulta();
		
		//calculando valor da consulta para funcion�rio da empresa
		calculador.realizaCalculoConsulta(valor, funcionario);
		
		//calculando valor da consulta de retorno
		calculador.realizaCalculoConsulta(valor, retorno);
		
		//calculando valor da consulta para paciente com plano de sa�de
		calculador.realizaCalculoConsulta(valor, pacienteComPlano);
		
		
	}
}
