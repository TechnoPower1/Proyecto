/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerServlet;

import Proyecto.entity.InicioSesion;
import Proyecto.session.InicioSesionFacadeLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author julia
 */
@WebServlet (name = "InicioSesionServlet", urlPatterns = {"/InicioSesionServlet"})
public class InicioSesionServlet extends HttpServlet {

    @EJB
    private InicioSesionFacadeLocal inicioSesionFacade;

    

   

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        String cedulaStr = request.getParameter("cedula");
        int cedula = cedulaStr.equals("") ? 0 : Integer.parseInt(cedulaStr);
        String contraseña = request.getParameter("contraseña");
     //   int yearLevel=yearLevelStr.equals("") ? 0 : Integer.parseInt(yearLevelStr);
    // try (PrintWriter out = response.getWriter()) {
     InicioSesion inicioSesion = new InicioSesion (cedula, contraseña);
     
     if (action.equalsIgnoreCase("Iniciar sesion")){
         inicioSesionFacade.IniciarSesion(cedula);
     } else {
         System.out.println("hola bebe");
     }
     
     inicioSesionFacade.find(inicioSesion);
     response.setContentType("text/html;charset=UTF-8");
     
     request.setAttribute("inicioSesion", inicioSesion);
     //request.setAttribute("registrar", registroUsuarioFacade.getregistrar());
     request.getRequestDispatcher("IniciarSesion.jsp").forward (request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
