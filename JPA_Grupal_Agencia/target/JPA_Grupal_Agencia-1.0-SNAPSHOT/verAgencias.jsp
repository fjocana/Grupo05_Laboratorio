<%-- 
    Document   : verAgencias
    Created on : 25/08/2023, 19:24:54
    Author     : EUNICE-ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Agencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="components/header.jsp" %>

    <%@include file="components/body1.jsp" %>
    
    <h1>Lista de Agencias</h1>
    
    <%@include file="components/body2.jsp" %>   
    
    <a href="index.jsp" class="btn btn-secondary btn-user btn-block" ><i class="fas fa-home"></i> Home </a>
    <br>

    <div class="container-fluid">
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr style="background-color: #3294FE; color: white;">
                            <th><strong>DESCRIPCION</strong></th>
                            <th><strong>DIRECCION</strong></th>
                            <th><strong>TELEFONO</strong></th>
                            <th><strong>HORA APERTURA</strong></th>
                            <th><strong>HORA CIERRE</strong></th>
                            <th><strong>ACCIONES</strong></th>
                        </tr>
                    </thead>

                    <% List<Agencia> listaAgencias = (List) request.getSession().getAttribute("listaAgencias"); %>
                    <tbody>
                        <% for (Agencia age : listaAgencias) { %>
                        <tr>
                            <td><%= age.getDescripcion() %></td>
                            <td><%= age.getDireccion() %></td>
                            <td><%= age.getTelefono() %></td>
                            <td><%= age.getHorainicio() %></td>
                            <td><%= age.getHorafin() %></td>
                            <td class="d-flex align-items-center">
                                <form name="editar" action="EditarServlet" method="GET" class="mr-1">
                                    <button type="submit" class="btn btn-success"><i class="fas fa-pencil-alt"></i> Editar</button>
                                    <input type="hidden" name="id" value="<%= age.getId() %>">
                                </form>

                                <form name="detalles" action="DetallesServlet" method="GET" class="mr-1">
                                    <button type="submit" class="btn btn-warning"><i class="fas fa-eye"></i> Detalles</button>
                                    <input type="hidden" name="id" value="<%= age.getId() %>">
                                </form>

                                <form name="eliminar" action="EliminarServlet" method="POST">
                                    <button type="submit" class="btn btn-danger"><i class="fas fa-trash"></i> Eliminar</button>
                                    <input type="hidden" name="id" value="<%= age.getId() %>">
                                </form>
                            </td>
                        </tr>
                        <% } %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

          
    <%@include file="components/body3.jsp" %>

</html>
