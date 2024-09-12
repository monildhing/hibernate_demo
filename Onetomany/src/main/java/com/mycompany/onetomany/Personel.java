package com.mycompany.onetomany;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "personel")
public class Personel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "name")
    private String name;
    @Column(name = "qlvl")
    private QualificationLevel.Level qualificationLevel;
    @Column(name = "phone")
    private int phone;
   

    public Personel() {
    }

    public Personel(String name, QualificationLevel.Level qualificationLevel, int phone) {
        this.name = name;
        this.qualificationLevel = qualificationLevel;
        this.phone = phone;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualificationLevel.Level getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(QualificationLevel.Level qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    
}
