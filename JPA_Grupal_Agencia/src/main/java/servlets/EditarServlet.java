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
import javax.servlet.http.HttpSession;
import logica.Agencia;
import logica.Controladora;

/**
 *
 * @author EUNICE-ASUS
 */
@WebServlet(name = "EditarServlet", urlPatterns = {"/EditarServlet"})
public class EditarServlet extends HttpServlet {
 
    Controladora control = new Controladora();
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        int id=Integer.parseInt(request.getParameter("id"));
        Agencia age = control.traerAgencia(id);
        
        HttpSession misession = request.getSession();
        misession.setAttribute("editarAgencia", age);
        response.sendRedirect("edit.jsp");
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String descripcion = request.getParameter("descripcion");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String horainicio = request.getParameter("horainicio");
        String horafin = request.getParameter("horafin");
        String foto = request.getParameter("foto");
        
        Agencia age=(Agencia)request.getSession().getAttribute("editarAgencia");
        
        age.setDescripcion(descripcion);
        age.setDireccion(direccion);
        age.setDireccion(direccion);
        age.setTelefono(telefono);
        age.setHorainicio(horainicio);
        age.setHorafin(horafin);
        age.getFoto();
        
        control.editarAgencia(age);
        
        response.sendRedirect("AgenciaServlet");
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
