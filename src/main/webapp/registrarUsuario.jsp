
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Registrar Usuario</h5>
<p>Este es el apartado para registrar a los diferentes usuarios del sistema</p>
<form class="user" action="SvUsuario" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombreUsu"
                   name="nombreUsu" placeholder="Nombre Usuario">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contraseña" name="contrasenia"
                   placeholder="Contraseña">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" name="rol"
                   id="rol" placeholder="Rol">
   
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Registra Usuario
    </button>
    <hr>
    
</form>

<%@include file="components/bodyFinal.jsp" %>