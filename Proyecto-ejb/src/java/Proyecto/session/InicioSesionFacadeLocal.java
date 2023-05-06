/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto.session;

import Proyecto.entity.InicioSesion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author julia
 */
@Local
public interface InicioSesionFacadeLocal {

    void create(InicioSesion inicioSesion);

    void edit(InicioSesion inicioSesion);

    void remove(InicioSesion inicioSesion);

    InicioSesion find(Object id);

    List<InicioSesion> findAll();

    List<InicioSesion> findRange(int[] range);

    int count();
    
   void IniciarSesion(int cedula_inicio);
   
   List<InicioSesion> getregistrar(String parameter);
    
}
