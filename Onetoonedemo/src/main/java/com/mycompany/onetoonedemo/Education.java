
package com.mycompany.onetoonedemo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "education")
public class Education implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "dtype")
    private String dtype;
    @Column(name = "ddesp")
    private String ddesp;
    @Column(name = "school")
    private String School;
    @Column(name = "yeear")
    private int yeear;
    @OneToOne(mappedBy = "education",cascade=CascadeType.ALL)
    private Student student;

    public Education() {
    }
    
    
    public Education( String dtype, String ddesp, String School, int yeear) {
        this.ID = ID;
        this.dtype = dtype;
        this.ddesp = ddesp;
        this.School = School;
        this.yeear = yeear;
        
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getDdesp() {
        return ddesp;
    }

    public void setDdesp(String ddesp) {
        this.ddesp = ddesp;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String School) {
        this.School = School;
    }

    public int getYeear() {
        return yeear;
    }

    public void setYeear(int yeear) {
        this.yeear = yeear;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    
}
