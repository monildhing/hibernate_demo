
package com.mycompany.hibernateex3;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author monil
 */
public class Main {
    public static void main(String[] args) {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Details.class);
       org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Details hm=new Details(1,"noil","noil123@gmail.com","999999999");
       Details hm2=new Details(2,"mnoil","mnoil123@gmail.com","997999999");
      session.save(hm);
       session.save(hm2);
       tx.commit();
}
}
