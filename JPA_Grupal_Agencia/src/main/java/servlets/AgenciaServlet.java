/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Agencia;
import logica.Controladora;

/**
 *
 * @author EUNICE-ASUS
 */
@WebServlet(name = "AgenciaServlet", urlPatterns = {"/AgenciaServlet"})
public class AgenciaServlet extends HttpServlet {

    Controladora control= new Controladora();
    
  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
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
        
        List<Agencia>listaAgencias = new ArrayList<Agencia>();
        listaAgencias=control.getAgencias();
        
        HttpSession misession=request.getSession();
        misession.setAttribute("listaAgencias",listaAgencias);
        response.sendRedirect("verAgencias.jsp");
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
 
        String descripcion=request.getParameter("descripcion");
        String direccion=request.getParameter("direccion");
        String telefono=request.getParameter("telefono");
        String horainicio=request.getParameter("horainicio");
        String horafin=request.getParameter("horafin");
        String foto=request.getParameter("foto");
        
        
      
        
        control.crearAgencia(descripcion,direccion,telefono,horainicio,horafin,foto);
        
        
        
        response.sendRedirect("index.jsp");
        
        
        
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
