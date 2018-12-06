package br.pro.glauber.drogaria.main;

import org.hibernate.Session;

import br.pro.glauber.drogaria.util.HibernateUtil;

public class HibernateUtilTeste {
    
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getfabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getfabricaDeSessoes().close();
	}
}
