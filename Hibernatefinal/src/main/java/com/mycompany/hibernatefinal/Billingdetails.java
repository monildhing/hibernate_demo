
package com.mycompany.hibernatefinal;

import java.util.List;
import javax.persistence.CascadeType;
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
@Table(name = "billingdetails")
public class Billingdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    private String ownername;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Creditcard> creditcard;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Bankaccount> bankaccount;

    public Billingdetails() {
    }

    public Billingdetails(String ownername, List<Creditcard> creditcard, List<Bankaccount> bankaccount) {
        this.ownername = ownername;
        this.creditcard = creditcard;
        this.bankaccount = bankaccount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    public List<Creditcard> getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(List<Creditcard> creditcard) {
        this.creditcard = creditcard;
    }

    public List<Bankaccount> getBankaccount() {
        return bankaccount;
    }

    public void setBankaccount(List<Bankaccount> bankaccount) {
        this.bankaccount = bankaccount;
    }
    
}
