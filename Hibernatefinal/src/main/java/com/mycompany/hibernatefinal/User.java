package com.mycompany.hibernatefinal;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "user")
public class User {

    

    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String email;
    private int ranking;
    private boolean admin;
    @OneToMany(mappedBy = "user",cascade=CascadeType.ALL)
    private List<Bid> bid;
    @OneToMany(mappedBy = "user" ,cascade=CascadeType.ALL)
    private List<Comment> comment;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Address> address;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Billingdetails> billingdetails;
    @OneToOne(mappedBy = "user" ,cascade=CascadeType.ALL)
    private Shipment shipment;

    public User() {
    }

    public User(String fname, String lname, String username, String password, String email, int ranking, boolean admin) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
    }

    public User(String fname, String lname, String username, String password, String email, int ranking, boolean admin, List<Bid> bid, List<Comment> comment, List<Address> address, List<Billingdetails> billingdetails, Shipment shipment) {
        this.fname = fname;
        this.lname = lname;
        this.username = username;
        this.password = password;
        this.email = email;
        this.ranking = ranking;
        this.admin = admin;
        this.bid = bid;
        this.comment = comment;
        this.address = address;
        this.billingdetails = billingdetails;
        this.shipment = shipment;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<Bid> getBid() {
        return bid;
    }

    public void setBid(List<Bid> bid) {
        this.bid = bid;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Billingdetails> getBillingdetails() {
        return billingdetails;
    }

    public void setBillingdetails(List<Billingdetails> billingdetails) {
        this.billingdetails = billingdetails;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }
    

}
