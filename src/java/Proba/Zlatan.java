/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proba;

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
 * @author ZLATAN
 */
@Entity
@Table(name = "ZLATAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Zlatan.findAll", query = "SELECT z FROM Zlatan z")
    , @NamedQuery(name = "Zlatan.findById", query = "SELECT z FROM Zlatan z WHERE z.id = :id")
    , @NamedQuery(name = "Zlatan.findByIme", query = "SELECT z FROM Zlatan z WHERE z.ime = :ime")
    , @NamedQuery(name = "Zlatan.findByPrezime", query = "SELECT z FROM Zlatan z WHERE z.prezime = :prezime")})
public class Zlatan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Size(max = 50)
    @Column(name = "IME")
    private String ime;
    @Size(max = 50)
    @Column(name = "PREZIME")
    private String prezime;

    public Zlatan() {
    }

    public Zlatan(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
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
        if (!(object instanceof Zlatan)) {
            return false;
        }
        Zlatan other = (Zlatan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proba.Zlatan[ id=" + id + " ]";
    }
    
}
