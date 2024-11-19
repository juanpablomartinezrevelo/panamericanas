<%-- 
    Document   : editarAlmacenista
    Created on : 17/11/2024, 4:37:15 p. m.
    Author     : 123456789
--%>

<%@page import="Logica.Almacenista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Edición de Almacenista</h5>
<p>Este es el apartado para modificar un Almacenista del sistema</p>

<%Almacenista almacenista = (Almacenista)request.getSession().getAttribute("almacenistaEditar");%>
<form class="user" action="SvEditAlmacenista" method="POST">
    <div class="form-group col">
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="cedula"
                   placeholder="Cedula" name="cedula" value="<%=almacenista.getCedula()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre" name="nombre" value="<%=almacenista.getNombre()%>">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="apellido" placeholder="Apellido" name="apellido" value="<%=almacenista.getApellido()%>">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="correoElectronico" placeholder="CorreoElectronico" name="correoElectronica" value="<%=almacenista.getCorreoElectronico()%>">
        </div>
        
         <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="celular" placeholder="Celular" name="celular" value="<%=almacenista.getCelular()%>">
        </div>
    

   
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificación
    </button>
    <hr>
    
</form>

<%@include file="components/bodyFinal.jsp" %>
