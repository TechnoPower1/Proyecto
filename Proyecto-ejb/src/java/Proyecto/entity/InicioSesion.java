/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julia
 */
@Entity
@Table(name = "INICIO_SESION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InicioSesion.findAll", query = "SELECT i FROM InicioSesion i"),
    @NamedQuery(name = "InicioSesion.findByCedulaInicio", query = "SELECT i FROM InicioSesion i WHERE i.cedulaInicio = :cedulaInicio"),
    @NamedQuery(name = "InicioSesion.findByContrasena", query = "SELECT i FROM InicioSesion i WHERE i.contrasena = :contrasena")})
public class InicioSesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA_INICIO")
    private Integer cedulaInicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @JoinColumn(name = "CEDULA_INICIO", referencedColumnName = "CEDULA", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private RegistroUsuario registroUsuario;

    public InicioSesion() {
    }

    public InicioSesion(Integer cedulaInicio) {
        this.cedulaInicio = cedulaInicio;
    }

    public InicioSesion(Integer cedulaInicio, String contrasena) {
        this.cedulaInicio = cedulaInicio;
        this.contrasena = contrasena;
    }

    public Integer getCedulaInicio() {
        return cedulaInicio;
    }

    public void setCedulaInicio(Integer cedulaInicio) {
        this.cedulaInicio = cedulaInicio;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public RegistroUsuario getRegistroUsuario() {
        return registroUsuario;
    }

    public void setRegistroUsuario(RegistroUsuario registroUsuario) {
        this.registroUsuario = registroUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaInicio != null ? cedulaInicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InicioSesion)) {
            return false;
        }
        InicioSesion other = (InicioSesion) object;
        if ((this.cedulaInicio == null && other.cedulaInicio != null) || (this.cedulaInicio != null && !this.cedulaInicio.equals(other.cedulaInicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proyecto.entity.InicioSesion[ cedulaInicio=" + cedulaInicio + " ]";
    }
    
}
