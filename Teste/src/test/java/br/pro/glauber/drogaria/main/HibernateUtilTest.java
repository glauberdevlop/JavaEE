package br.pro.glauber.drogaria.main;

import org.hibernate.Session;
import org.junit.Test;

import br.pro.glauber.drogaria.util.HibernateUtil;

public class HibernateUtilTest {

	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getfabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getfabricaDeSessoes().close();
	}

}
