<%-- 
    Document   : detalle
    Created on : 25/08/2023, 13:57:47
    Author     : EUNICE-ASUS
--%>

<%@page import="logica.Agencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%@include file="components/header.jsp" %>

    <%@include file="components/body1.jsp" %>

    <% Agencia age =(Agencia) request.getSession().getAttribute("editarAgencia");%>     
    <h1>Detalle Agencia: <%=age.getDescripcion()%></h1>

    <%@include file="components/body2.jsp" %>
   
    <div class="row">
        <div class="col-md-6 form-group mb-3"> 
            <a href="index.jsp" class="btn btn-secondary btn-user btn-block" ><i class="fas fa-home"></i> Home </a>
        </div>
        <div class="col-md-6 form-group mb-3"> 
            <a href="verAgencias.jsp" class="btn btn-danger btn-user btn-block"> <i class="fas fa-arrow-left"></i> Regresar </a>
        </div>
    </div>
    <form class="agencia" method="POST" action="EditarServlet">
        <div class="row">
            <div class="col-md-12 form-group mb-3">
                <strong> DESCRIPCION</strong>
                <input type="text" class="form-control form-control-user" id="descripcion"  value="<%=age.getDescripcion()%>"  name="descripcion" disabled>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6 form-group mb-3">
                <strong> DIRECCION</strong>
                <input type="text" class="form-control form-control-user" id="direccion"   value="<%=age.getDireccion() %>" name="direccion" disabled>
            </div>

            <div class="col-md-6 form-group mb-3">
                <strong> TELEFONO</strong>
                <input type="text" class="form-control form-control-user" id="telefono" value="<%=age.getTelefono() %>" name="telefono" disabled>
            </div> 
        </div>

        <div class="row">
            <div class="col-md-6 form-group mb-3">
                <strong> HORA DE APERTURA</strong>
                <input type="time" class="form-control form-control-user" id="horainicio"   value="<%=age.getHorainicio() %>" name="horainicio" disabled>
            </div> 

            <div class="col-md-6 form-group mb-3">
                <strong> HORA DE CIERRE</strong>
                <input type="time" class="form-control form-control-user" id="horafin"   value="<%=age.getHorafin() %>" name="horafin" disabled>
            </div>
        </div>

        <div class="row">
            <div class="col-md-12 form-group mb-3">
                <strong> FOTO</strong><br>
                <img src="./IMG/<%=age.getFoto()%>" class="img-fluid "  width="300" height="200">
            </div>
        </div>

    </form>
    
    <%@include file="components/body3.jsp" %>
</html>
