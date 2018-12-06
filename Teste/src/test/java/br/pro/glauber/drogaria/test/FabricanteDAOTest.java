package br.pro.glauber.drogaria.test;

import br.pro.glauber.drogaria.dao.FabricanteDAO;
import br.pro.glauber.drogaria.domain.Fabricante;

public class FabricanteDAOTest {
	
	public void salvar() {
		
		Fabricante f1 = new Fabricante();
		f1.setNome("DescricaoB");
		
		Fabricante f2 = new Fabricante();
		f2.setNome("DescricaoA");
		
		FabricanteDAO dao = new FabricanteDAO();
		dao.salvar(f2);
		dao.salvar(f1);
	}

}
