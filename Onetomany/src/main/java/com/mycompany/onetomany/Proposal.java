
package com.mycompany.onetomany;

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
@Table(name = "proposal")
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "docid")
    private Long docid;
    @Column(name = "title")
    private String title;
    @Column(name = "comment")
    private String comment;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Personel> personel;
    @OneToMany(cascade=CascadeType.ALL)
    private List<Attaachment> attaachment;

    public Proposal() {
    }

    public Proposal(Long docid, String title, String comment, List<Personel> personel, List<Attaachment> attaachment) {
        this.docid = docid;
        this.title = title;
        this.comment = comment;
        this.personel = personel;
        this.attaachment = attaachment;
    }

    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Long getDocid() {
        return docid;
    }

    public void setDocid(Long docid) {
        this.docid = docid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Personel> getPersonel() {
        return personel;
    }

    public void setPersonel(List<Personel> personel) {
        this.personel = personel;
    }

    public List<Attaachment> getAttaachment() {
        return attaachment;
    }

    public void setAttaachment(List<Attaachment> attaachment) {
        this.attaachment = attaachment;
    }

   
    
    
}
