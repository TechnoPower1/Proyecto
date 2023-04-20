/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.session;

import Proyecto.entity.RegistroUsuario;
import static Proyecto.entity.RegistroUsuario_.nombre;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author julia
 */
@Stateless
public class RegistroUsuarioFacade extends AbstractFacade<RegistroUsuario> implements RegistroUsuarioFacadeLocal {

    @PersistenceContext(unitName = "ProyectoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistroUsuarioFacade() {
        super(RegistroUsuario.class);
    }

    @Override
    public List<RegistroUsuario> getregistrar(String parameter) {
       //return em.createNamedQuery("RegistroUsuario.getAll").getResultList();;
       return null;
    }

    @Override
    public void RegistrarUsuario(RegistroUsuario registroUsuario) {
        em.persist(registroUsuario);
    }
    
    
}
