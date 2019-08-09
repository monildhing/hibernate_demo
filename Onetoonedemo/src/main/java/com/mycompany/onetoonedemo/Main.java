
package com.mycompany.onetoonedemo;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author monil
 */
public class Main {
       public static void main(String[] args) {
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Education.class).addAnnotatedClass(Address.class);
       org.hibernate.SessionFactory sf = con.buildSessionFactory();
       
       Session session = sf.openSession();
   
       
       Transaction tx = session.beginTransaction();
       Address add=new Address("abcde", "street2"," state", "country");
      
       Education edu=new Education( "dtype", "ddesp", "School", 2017);
       
       Student stu=new Student(1, "fname", "mname", "lname", 99999999, "email", add, edu);
              
       session.save(stu);
       
       tx.commit();
       

  }
}
