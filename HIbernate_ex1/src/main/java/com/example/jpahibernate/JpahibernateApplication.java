package com.example.jpahibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpahibernateApplication {
         private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
            .createEntityManagerFactory("JavaHelps");
	public static void main(String[] args) {

                create(1, "Mon"); 
                create(2, "Noil"); 
                create(3, "Charlie");
                ENTITY_MANAGER_FACTORY.close();
	}
        
         public static void create(int id, String name) {
       
        EntityManager manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        EntityTransaction transaction = null;

        try {
            
            transaction = manager.getTransaction();
           
            transaction.begin();

            
            Helloworld stu = new Helloworld();
            stu.setId(id);
            stu.setMessage(name);
            

            
            manager.persist(stu);

            
            transaction.commit();
        } catch (Exception ex) {
           
            if (transaction != null) {
                transaction.rollback();
            }
           
        } finally {
          
            manager.close();
        }
    }

}
