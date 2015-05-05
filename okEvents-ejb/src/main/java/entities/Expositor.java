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
public class Expositor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExpositor;
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String institucionOrigen;
    private String pais;
    private String grado;
    
    private String resenaBibliografica;
    
    @OneToMany(mappedBy = "idExpositor")
    private Collection<Evento> eventoCollection;

    public Long getIdExpositor() {
        return idExpositor;
    }

    public void setIdExpositor(Long idExpositor) {
        this.idExpositor = idExpositor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getResenaBibliografica() {
        return resenaBibliografica;
    }

    public void setResenaBibliografica(String resenaBibliografica) {
        this.resenaBibliografica = resenaBibliografica;
    }

    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    public String getInstitucionOrigen() {
        return institucionOrigen;
    }

    public void setInstitucionOrigen(String institucionOrigen) {
        this.institucionOrigen = institucionOrigen;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idExpositor != null ? idExpositor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expositor)) {
            return false;
        }
        Expositor other = (Expositor) object;
        if ((this.idExpositor == null && other.idExpositor != null) || (this.idExpositor != null && !this.idExpositor.equals(other.idExpositor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
}
