package com.rutwik.demoHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Human h1 = new Human();
       h1.setHid(101);
       h1.setHname("Amar");
       h1.setHage(21);
       
       Configuration con = new Configuration();
       
       SessionFactory sf = con.buildSessionFactory();
       
//       Session session = sf.openSession();
//       session.save(h1);
    }
}
