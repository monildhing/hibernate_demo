
package com.mycompany.hibernate;




import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author monil
 */
public class Main {
    
     public static void main(String[] args) {
        
    
       Configuration con = new Configuration().configure().addAnnotatedClass(Helloworld.class);
       org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       
       Helloworld hm=new Helloworld(5, "11abc");
       session.save(hm);
       tx.commit();
       
     }
}
