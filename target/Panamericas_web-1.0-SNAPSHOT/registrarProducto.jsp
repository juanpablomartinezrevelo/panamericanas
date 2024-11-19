<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Registrar Productos</h5>
<p>Este es el apartado para registrar a los diferentes podructos en el sistema</p>
<form class="user" action="SvProducto" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombreProduc" name="nombreProduc"
                   placeholder="Nombre del producto">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="materialProducto" name="materialProducto"
                   placeholder="Material del producto">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="descripcion" name="descripcion" placeholder="Descripción">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="cantidadRegistrada" name="cantidadRegistrada" placeholder="Cantidad de productos a registrar">
        </div>
        
        
    </div>
    <button type="submit" class="btn btn-primary btn-user btn-block">
        Registra Producto
    </button>
    <hr>
    
</form>
<%@include file="components/bodyFinal.jsp" %>