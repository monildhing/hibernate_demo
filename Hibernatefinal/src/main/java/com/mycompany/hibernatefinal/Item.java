
package com.mycompany.hibernatefinal;


import java.sql.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author monil
 */
@Entity
@Table(name = "item")
public class Item {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    private String name;
    private String description;
    private int intitalprice;
    private int reserveprice;
    private Date startdate;
    private Date enddate;
    
    @OneToMany(mappedBy = "item",cascade=CascadeType.ALL)
    private List<Bid> bid;
    
    @OneToMany(mappedBy = "item" ,cascade=CascadeType.ALL)
    private List<Comment> comment;
    @ManyToOne(cascade=CascadeType.ALL)
    private Category category;

    public Item() {
    }

    public Item(String name, String description, int intitalprice, int reserveprice, Date startdate, Date enddate) {
        this.name = name;
        this.description = description;
        this.intitalprice = intitalprice;
        this.reserveprice = reserveprice;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Item(String name, String description, int intitalprice, int reserveprice, Date startdate, Date enddate, List<Bid> bid, List<Comment> comment, Category category) {
        this.name = name;
        this.description = description;
        this.intitalprice = intitalprice;
        this.reserveprice = reserveprice;
        this.startdate = startdate;
        this.enddate = enddate;
        this.bid = bid;
        this.comment = comment;
        this.category = category;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIntitalprice() {
        return intitalprice;
    }

    public void setIntitalprice(int intitalprice) {
        this.intitalprice = intitalprice;
    }

    public int getReserveprice() {
        return reserveprice;
    }

    public void setReserveprice(int reserveprice) {
        this.reserveprice = reserveprice;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
            


}
