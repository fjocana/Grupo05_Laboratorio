/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logica.Controladora;

/**
 *
 * @author EUNICE-ASUS
 */
@WebServlet(name = "EliminarServlet", urlPatterns = {"/EliminarServlet"})
public class EliminarServlet extends HttpServlet {
    
    Controladora control = new Controladora();
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int id=Integer.parseInt(request.getParameter("id"));
        control.borrarAgencia(id);
        response.sendRedirect("AgenciaServlet");
    }
 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
