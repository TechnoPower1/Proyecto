/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.session;

import Proyecto.entity.RegistroUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author julia
 */
@Local
public interface RegistroUsuarioFacadeLocal {

    void create(RegistroUsuario registroUsuario);

    void edit(RegistroUsuario registroUsuario);

    void remove(RegistroUsuario registroUsuario);

    RegistroUsuario find(Object id);

    List<RegistroUsuario> findAll();

    List<RegistroUsuario> findRange(int[] range);

    int count();

    

    void RegistrarUsuario(RegistroUsuario registroUsuario);
    
    List<RegistroUsuario> getregistrar(String parameter);
    
}
