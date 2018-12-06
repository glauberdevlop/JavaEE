package br.pro.glauber.drogaria.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.pro.glauber.drogaria.domain.Fabricante;
import br.pro.glauber.drogaria.util.HibernateUtil;

public class FabricanteDAO {

	public void salvar(Fabricante fabricante) {
		Session sessao = HibernateUtil.getfabricaDeSessoes().openSession();
		Transaction trasacao = null;
		try {
			trasacao = sessao.beginTransaction();
			sessao.save(fabricante);
			trasacao.commit();
		} catch (Exception ex) {
			if (trasacao != null) {
				trasacao.rollback();
			}

		} finally {
			sessao.close();
		}

	}
}
