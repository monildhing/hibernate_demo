/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpahibernate;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "helloworld")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Helloworld.findAll", query = "SELECT h FROM Helloworld h")
    , @NamedQuery(name = "Helloworld.findById", query = "SELECT h FROM Helloworld h WHERE h.id = :id")
    , @NamedQuery(name = "Helloworld.findByMessage", query = "SELECT h FROM Helloworld h WHERE h.message = :message")})
public class Helloworld implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "message")
    private String message;

    public Helloworld() {
    }

    public Helloworld(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Helloworld)) {
            return false;
        }
        Helloworld other = (Helloworld) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.jpahibernate.Helloworld[ id=" + id + " ]";
    }
    
}
