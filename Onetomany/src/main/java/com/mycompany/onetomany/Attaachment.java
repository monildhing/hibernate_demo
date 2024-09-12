package com.mycompany.onetomany;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
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
@Table(name = "attachment")
public class Attaachment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int ID;
    @Column(name = "filename")
    private String filename;
    @Column(name = "filesize")
    private String filesize;
    @Column(name = "created")
    private Long created;
    @Column(name = "atype")
    private int attachtype;

    public Attaachment() {
    }

    public Attaachment( String filename, String filesize, Long created, int attachtype) {
        
        this.filename = filename;
        this.filesize = filesize;
        this.created = created;
        this.attachtype = attachtype;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public int getAttachtype() {
        return attachtype;
    }

    public void setAttachtype(int attachtype) {
        this.attachtype = attachtype;
    }

    
    
    
}
