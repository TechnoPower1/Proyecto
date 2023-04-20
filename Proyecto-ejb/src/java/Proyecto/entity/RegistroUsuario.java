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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author julia
 */
@Entity
@Table(name = "REGISTRO_USUARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegistroUsuario.getAll", query = "SELECT r FROM RegistroUsuario r"),
    @NamedQuery(name = "RegistroUsuario.findByCedula", query = "SELECT r FROM RegistroUsuario r WHERE r.cedula = :cedula"),
    @NamedQuery(name = "RegistroUsuario.findByNombre", query = "SELECT r FROM RegistroUsuario r WHERE r.nombre = :nombre"),
    @NamedQuery(name = "RegistroUsuario.findByApellido", query = "SELECT r FROM RegistroUsuario r WHERE r.apellido = :apellido"),
    @NamedQuery(name = "RegistroUsuario.findByCorreo", query = "SELECT r FROM RegistroUsuario r WHERE r.correo = :correo"),
    @NamedQuery(name = "RegistroUsuario.findByCiudad", query = "SELECT r FROM RegistroUsuario r WHERE r.ciudad = :ciudad"),
    @NamedQuery(name = "RegistroUsuario.findByContrase\u00f1a", query = "SELECT r FROM RegistroUsuario r WHERE r.contrase\u00f1a = :contrase\u00f1a")})
public class RegistroUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    public static void registrarUsuario(RegistroUsuario registroUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CEDULA")
    private Integer cedula;
    @Size(max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 20)
    @Column(name = "APELLIDO")
    private String apellido;
    @Size(max = 50)
    @Column(name = "CORREO")
    private String correo;
    @Size(max = 20)
    @Column(name = "CIUDAD")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "CONTRASENA")
    private String contraseña;

    public RegistroUsuario() {
    }

    public RegistroUsuario(Integer cedula, String nombre, String apellido, String correo, String ciudad, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.ciudad = ciudad;
        this.contraseña = contraseña;
    }

    

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedula != null ? cedula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegistroUsuario)) {
            return false;
        }
        RegistroUsuario other = (RegistroUsuario) object;
        if ((this.cedula == null && other.cedula != null) || (this.cedula != null && !this.cedula.equals(other.cedula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Proyecto.entity.RegistroUsuario[ cedula=" + cedula + " ]";
    }
    
}
