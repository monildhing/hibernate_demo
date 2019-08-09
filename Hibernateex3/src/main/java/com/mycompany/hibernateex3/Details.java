
package com.mycompany.hibernateex3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "details")
public class Details{
    
            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id")
            private int ID;
            @Column(name = "name")
            private String NAME;
            @Column(name = "email")
            private String EMAIL;
            @Column(name = "phone")
            private String PHONE;

    public Details() {
    }

    public Details(int ID, String NAME, String EMAIL, String PHONE) {
        this.ID = ID;
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.PHONE = PHONE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }
            
    
}

