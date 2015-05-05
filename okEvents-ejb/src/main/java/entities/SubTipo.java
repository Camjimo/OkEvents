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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author MacBookPro
 */
@Entity
public class SubTipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSubTipo;
    
    private String nombreSubTipo;

    @ManyToOne
    private TipoEvento idTipoEvento;
    
    @OneToMany(mappedBy = "idSubTipo")
    private Collection<Evento> eventoCollection;

    public Long getIdSubTipo() {
        return idSubTipo;
    }

    public void setIdSubTipo(Long idSubTipo) {
        this.idSubTipo = idSubTipo;
    }

    public String getNombreSubTipo() {
        return nombreSubTipo;
    }

    public void setNombreSubTipo(String nombreSubTipo) {
        this.nombreSubTipo = nombreSubTipo;
    }

    public TipoEvento getIdTipoEvento() {
        return idTipoEvento;
    }

    public void setIdTipoEvento(TipoEvento idTipoEvento) {
        this.idTipoEvento = idTipoEvento;
    }

    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSubTipo != null ? idSubTipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idSubTipo fields are not set
        if (!(object instanceof SubTipo)) {
            return false;
        }
        SubTipo other = (SubTipo) object;
        if ((this.idSubTipo == null && other.idSubTipo != null) || (this.idSubTipo != null && !this.idSubTipo.equals(other.idSubTipo))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return idTipoEvento.toString() + " " + nombreSubTipo;
    }
    
}
