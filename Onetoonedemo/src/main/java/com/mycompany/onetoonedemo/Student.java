package com.mycompany.onetoonedemo;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;


/**
 *
 * @author monil
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    @Column(name = "fname")
    private String fname;
    @Column(name = "mname")
    private String mname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "phone")
    private int phone;
    @Column(name = "email")
    @Email
    private String email;
    @OneToOne(cascade=CascadeType.ALL)
    
    private Address address;
    @OneToOne(cascade=CascadeType.ALL)
   
    private Education education;

    public Student() {
    }

    public Student(int ID, String fname, String mname, String lname, int phone, String email, Address address, Education education) {
        this.ID = ID;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.education = education;
    }

    
    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Education getEducatiion() {
        return education;
    }

    public void setEducatiion(Education educatiion) {
        this.education = educatiion;
    }

}
