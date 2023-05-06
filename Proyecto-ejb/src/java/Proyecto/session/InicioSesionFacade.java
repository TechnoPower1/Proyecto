/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.session;

import Proyecto.entity.InicioSesion;
import Proyecto.entity.RegistroUsuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author julia
 */
@Stateless
public class InicioSesionFacade extends AbstractFacade<InicioSesion> implements InicioSesionFacadeLocal {

    @PersistenceContext(unitName = "ProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InicioSesionFacade() {
        super(InicioSesion.class);
    }
    
    @Override
    public List<InicioSesion> getregistrar(String parameter) {
       //return em.createNamedQuery("RegistroUsuario.getAll").getResultList();;
       return null;
    }
    
     @Override
    public void IniciarSesion(int cedula_inicio) {
        em.find(InicioSesion.class, cedula_inicio);
    }
}
