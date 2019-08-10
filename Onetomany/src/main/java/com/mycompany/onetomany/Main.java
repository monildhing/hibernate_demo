package com.mycompany.onetomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author monil
 */
public class Main {

    public static void main(String[] args) {
        int i;
        i = Integer.parseInt(args[0]);
        Function f = new Function();
        if (i == 1) {
            f.add();
        } else {
            f.delete();
        }
//        Configuration con = new Configuration().configure().addAnnotatedClass(Proposal.class).addAnnotatedClass(Personel.class).addAnnotatedClass(Attaachment.class).addAnnotatedClass(QualificationLevel.class);
//        org.hibernate.SessionFactory sf = con.buildSessionFactory();
//        
//        QualificationLevel.Level ql = QualificationLevel.Level.HIGH;
//        Attaachment att = new Attaachment("filename", "filesize", 12L, 1);
//        Attaachment att1 = new Attaachment("filename1", "filesize1", 15L, 2);
//        Personel per = new Personel("name", ql, 12131231);
//        Personel per1 = new Personel("acx", ql, 31231232);
//        List<Personel> lp = new ArrayList<>();
//        lp.add(per);
//        lp.add(per1);
//        List<Attaachment> la=new ArrayList<>();
//        la.add(att);
//        la.add(att1);
//
//        Proposal pro = new Proposal(12L, "title", "comment", lp, la);
//        Proposal prod = new Proposal();
//        prod.setID(1);
//        Session session = sf.openSession();
//
//        Transaction tx = session.beginTransaction();
//        session.delete(prod);

//          session.save(pro);
//
//        tx.commit();
    }
}

class Function {

    Configuration con = new Configuration().configure().addAnnotatedClass(Proposal.class).addAnnotatedClass(Personel.class).addAnnotatedClass(Attaachment.class).addAnnotatedClass(QualificationLevel.class);
    org.hibernate.SessionFactory sf = con.buildSessionFactory();

    public void add() {
        QualificationLevel.Level ql = QualificationLevel.Level.HIGH;
        Attaachment att = new Attaachment("filename13", "filesize13", 12L, 1);
        Attaachment att1 = new Attaachment("filename21", "filesize21", 15L, 2);
        Personel per = new Personel("name11", ql, 12131231);
        Personel per1 = new Personel("acx11", ql, 31231232);
        List<Personel> lp = new ArrayList<>();
        lp.add(per);
        lp.add(per1);
        List<Attaachment> la = new ArrayList<>();
        la.add(att);
        la.add(att1);

        Proposal pro = new Proposal(12L, "title112", "comment112", lp, la);
        
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.save(pro);

        tx.commit();
    }

    public void delete() {
        Proposal prod = new Proposal();
        prod.setID(1);
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();
        session.delete(prod);

        tx.commit();

    }
}
