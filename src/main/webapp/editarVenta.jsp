<%-- 
    Document   : editarVenta
    Created on : 18/11/2024, 3:03:03 p. m.
    Author     : 123456789
--%>

<%@page import="Logica.Ventas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Edición Ventas</h5>
<p>Este es el apartado para modificar una Venta registrado en el sistema</p>

<%Ventas venta = (Ventas)request.getSession().getAttribute("ventaEditar");%>
<form class="user" action="SvEditVenta" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="producto"
                   placeholder="Producto" name="producto" value="<%=venta.getProducto()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="precio"
                   placeholder="Precio $" name="precio" value="<%=venta.getPrecio()%>">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Material"
                   placeholder="Material"  name="material" value="<%=venta.getMaterialProducto()%>">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="descripcion" placeholder="Descripción" name="descripcion" value="<%=venta.getDescripcion()%>">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="cantidadVendida" placeholder="Cantidad Vendida" name="cantidadVendida" value="<%=venta.getCantidadVendida()%>">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="encargado" placeholder="Encargado de la Venta" name="encargadoVenta" value="<%=venta.getEncargadoVenta()%>">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="date" class="form-control form-control-user"
                   id="encargado" placeholder="Fecha de la Venta" name="fechaVenta">
        </div>
        
        
    </div>
    <button type="submit" class="btn btn-primary btn-user btn-block">
        Registra Ventas
    </button>
    <hr>
    
</form>
<%@include file="components/bodyFinal.jsp" %>
