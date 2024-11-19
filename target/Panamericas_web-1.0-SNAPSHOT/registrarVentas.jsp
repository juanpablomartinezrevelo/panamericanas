<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Registrar Ventas</h5>
<p>Este es el apartado para registrar a los diferentes Ventas del sistema</p>
<form class="user" action="SvVentas" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="producto"
                   placeholder="Producto" name="producto">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="precio"
                   placeholder="Precio $" name="precio">
        </div>
        
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="Material"
                   placeholder="Material"  name="material">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="descripcion" placeholder="Descripción" name="descripcion">
        </div>
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="cantidadVendida" placeholder="Cantidad Vendida" name="cantidadVendida">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="encargado" placeholder="Encargado de la Venta" name="encargadoVenta">
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