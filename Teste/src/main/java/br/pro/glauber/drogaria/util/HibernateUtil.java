package br.pro.glauber.drogaria.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	
	private static SessionFactory fabricaDeSessoes = criarfabricaDeSessoes();
	
	public static SessionFactory getfabricaDeSessoes() {
		return fabricaDeSessoes;
	}
	
	private static SessionFactory criarfabricaDeSessoes() {
		try {
			Configuration configuration = new Configuration().configure();
			
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			
			SessionFactory fabrica = configuration.buildSessionFactory(registro);
			
			return fabrica;
		} catch (Throwable ex) {
			System.err.println("A fabrica de Sessoes não pode ser criada." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
