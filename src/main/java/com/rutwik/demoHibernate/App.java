package com.rutwik.demoHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Laptop lp = new Laptop();
		lp.setLid(205);
		lp.setLname("Asus");
		
//		HumanName hn = new HumanName();
//		hn.setFname("Diksha");
//		hn.setMname("Navnath");
//		hn.setLname("Patil");
//
//		Human h1 = new Human();
//		h1.setHid(13);
//		h1.setHname(hn);
//		h1.setHage(23);
//		h1.getLaptop().add(lp);
//		
//		lp.getHuman().add(h1);

		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(Human.class).addAnnotatedClass(Laptop.class);

			ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties())
					.buildServiceRegistry();

			SessionFactory sf = con.buildSessionFactory(reg);

			Session session = sf.openSession();

			Transaction tx = session.beginTransaction();

			session.save(lp);
//			session.save(h1);
			

//			h1 = (Human) session.get(Human.class, 11);

			tx.commit();

//			System.out.println(h1);

		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getCause().printStackTrace();
			ex.getCause().getCause().printStackTrace();
		}

	}
}
