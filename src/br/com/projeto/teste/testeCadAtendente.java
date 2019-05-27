package br.com.projeto.teste;

import br.com.projeto.business.AtendenteDaoFacade;
import br.com.projeto.business.CadastrarAtendente;
import br.com.projeto.modelo.Atendente;
import br.com.projeto.modelo.Medico;

public class testeCadAtendente{

	public static void main(String[] args) throws Exception {
		
		Atendente at1 = new Atendente();
		at1.setCodUnico("1234");
		at1.setEspecialidade("Geriatra");
		at1.setNome("Maria Clara");
		at1.setTipo("medico");
		
		Atendente at2 = new Medico("medico", "Oftamologista", "1953", "Francisca da Silva");
		
		
		CadastrarAtendente ca = new CadastrarAtendente();
		Atendente atendente = ca.cadastraAtendente("medico", "Oftamologista", "1953", "Francisca da Silva");
		

		AtendenteDaoFacade ab = new AtendenteDaoFacade();
		ab.save(atendente);
		ab.save(at2);
		
		System.out.println(atendente.imprimeAtendente());
		
	}

}
