/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author MacBookPro
 */
@Entity
public class TipoEvento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTipoEvento;
    
    private String nombreTipo;
  
    @OneToMany(mappedBy = "idTipoEvento")
    private Collection<SubTipo> subtipoCollection;

    public Long getIdTipoEvento() {
        return idTipoEvento;
    }

    public void setIdTipoEvento(Long idTipoEvento) {
        this.idTipoEvento = idTipoEvento;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public Collection<SubTipo> getSubtipoCollection() {
        return subtipoCollection;
    }

    public void setSubtipoCollection(Collection<SubTipo> subtipoCollection) {
        this.subtipoCollection = subtipoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoEvento != null ? idTipoEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idTipoEvento fields are not set
        if (!(object instanceof TipoEvento)) {
            return false;
        }
        TipoEvento other = (TipoEvento) object;
        if ((this.idTipoEvento == null && other.idTipoEvento != null) || (this.idTipoEvento != null && !this.idTipoEvento.equals(other.idTipoEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreTipo;
    }
    
}
