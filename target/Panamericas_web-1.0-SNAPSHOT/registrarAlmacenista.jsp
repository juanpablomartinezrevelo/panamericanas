<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Registrar Almacenista</h5>
<p>Este es el apartado para registrar a los diferentes Almacenista en el sistema</p>
<form class="user" action="SvAlmacenista" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="cedula"
                   placeholder="Cedula" name="cedula">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="nombre"
                   placeholder="Nombre" name="nombre">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="apellido" placeholder="Apellido" name="apellido">
        </div>
        
        <div class="col-sm-6 mb-3 ">
            <input type="email" class="form-control form-control-user"
                   id="correoElectronico" placeholder="CorreoElectronico" name="correoElectronica">
        </div>
        
         <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user"
                   id="celular" placeholder="Celular" name="celular">
        </div>
        
        
    </div>
    <button type="submit" class="btn btn-primary btn-user btn-block">
        Registra Almacenista
    </button>
    <hr>
    
</form>
<%@include file="components/bodyFinal.jsp" %>
