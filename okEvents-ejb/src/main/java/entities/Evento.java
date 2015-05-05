/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;

/**
 *
 * @author MacBookPro
 */
@Entity
public class Evento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEvento;

    @Column(nullable = false)
    @Size(min=3)
    private String titulo;
    
    @Column(nullable = true)
    private String resumen;
    
    @Column(nullable = true)
    private String unidadAcademicaMayor;
    
    @Column(nullable = true)
    private String unidadAcademicaMenor;
    
    @Column(nullable = true)
    private String lugar;
    
    @Column(nullable = true)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaHora;
    //ID TIPO EVENTO
    
    @Column(nullable = true)
    private String institucionOrigen;
    
    @Column(nullable = true)
    private String proyectoVinculado;
    
    @Column(nullable = true)
    private String publicoObjetivo;
    
    @Column(nullable = true)
    private int numAsistentes;
    
    @Column(nullable = true)
    private String region;
    
    @Column(nullable = true)
    private String comuna;
    
    @Column(nullable = true)
    private String financiamiento;
    
    @Column(nullable = true)
    private boolean RSU;
    
    @Column(nullable = true)
    private int codigo;
    
    //NOMBRE PROYECTO ???
    @Column(nullable = true)
    private String nombreProyecto;
    
    @Column(nullable = true)
    private String entidadReceptora;
    
    @Column(nullable = true)
    private String estado = "Propuesto";
    
    //Nombre expositor
    @ManyToOne
    private Expositor idExpositor;
    
    //Nombre Tipo y Subtipo
    @ManyToOne
    private SubTipo idSubTipo;
    
    @OneToMany(mappedBy = "idEvento")
    private Collection<Inscripcion> inscripcionCollection;
    
    //Reseña bibliografia

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getUnidadAcademicaMayor() {
        return unidadAcademicaMayor;
    }

    public void setUnidadAcademicaMayor(String unidadAcademicaMayor) {
        this.unidadAcademicaMayor = unidadAcademicaMayor;
    }

    public String getUnidadAcademicaMenor() {
        return unidadAcademicaMenor;
    }

    public void setUnidadAcademicaMenor(String unidadAcademicaMenor) {
        this.unidadAcademicaMenor = unidadAcademicaMenor;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getInstitucionOrigen() {
        return institucionOrigen;
    }

    public void setInstitucionOrigen(String institucionOrigen) {
        this.institucionOrigen = institucionOrigen;
    }

    public String getProyectoVinculado() {
        return proyectoVinculado;
    }

    public void setProyectoVinculado(String proyectoVinculado) {
        this.proyectoVinculado = proyectoVinculado;
    }

    public String getPublicoObjetivo() {
        return publicoObjetivo;
    }

    public void setPublicoObjetivo(String publicoObjetivo) {
        this.publicoObjetivo = publicoObjetivo;
    }

    public int getNumAsistentes() {
        return numAsistentes;
    }

    public void setNumAsistentes(int numAsistentes) {
        this.numAsistentes = numAsistentes;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }

    public boolean isRSU() {
        return RSU;
    }

    public void setRSU(boolean RSU) {
        this.RSU = RSU;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getEntidadReceptora() {
        return entidadReceptora;
    }

    public void setEntidadReceptora(String entidadReceptora) {
        this.entidadReceptora = entidadReceptora;
    }

    public Expositor getIdExpositor() {
        return idExpositor;
    }

    public void setIdExpositor(Expositor idExpositor) {
        this.idExpositor = idExpositor;
    }

    public SubTipo getIdSubTipo() {
        return idSubTipo;
    }

    public void setIdSubTipo(SubTipo idSubTipo) {
        this.idSubTipo = idSubTipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Collection<Inscripcion> getInscripcionCollection() {
        return inscripcionCollection;
    }

    public void setInscripcionCollection(Collection<Inscripcion> inscripcionCollection) {
        this.inscripcionCollection = inscripcionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEvento != null ? idEvento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.idEvento == null && other.idEvento != null) || (this.idEvento != null && !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
