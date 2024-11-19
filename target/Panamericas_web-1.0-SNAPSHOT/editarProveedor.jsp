<%-- 
    Document   : editarProveedor
    Created on : 17/11/2024, 8:41:39 p. m.
    Author     : 123456789
--%>

<%@page import="Logica.Proveedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Edición de Proveedor</h5>
<p>Este es el apartado para modificar un Proveedor del sistema</p>

<%Proveedor proveedor = (Proveedor)request.getSession().getAttribute("proveedorEditar");%>
<form class="user" action="SvEditProveedor" method="POST">
    <div class="form-group col">
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="cedula"
                   placeholder="Cedula" name="cedula" value="<%=proveedor.getCedula()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre" name="nombre" value="<%=proveedor.getNombre()%>">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="apellido" placeholder="Apellido" name="apellido" value="<%=proveedor.getApellido()%>">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="correoElectronico" placeholder="CorreoElectronico" name="correoElectronica" value="<%=proveedor.getCorreoElectronico()%>">
        </div>
        
         <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="celular" placeholder="Celular" name="celular" value="<%=proveedor.getCelular()%>">
        </div>
    

        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="empresa" placeholder="Empresa" name="empresa" value="<%=proveedor.getEmpresa()%>">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="direccion" placeholder="Dirección" name="direccion" value="<%=proveedor.getDireccion()%>">
        </div>
   
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificación
    </button>
    <hr>
    
</form>

<%@include file="components/bodyFinal.jsp" %>
