
<%@page import="Logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Edición de Usuario</h5>
<p>Este es el apartado para modificar un usuario del sistema</p>

<%Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>
<form class="user" action="SvEditUsuarios" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="nombreUsu"
                   name="nombreUsu" placeholder="Nombre Usuario" value="<%=usu.getNombreUsuario()%>">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="password" class="form-control form-control-user" id="contraseña" name="contrasenia"
                   placeholder="Contraseña" value="<%=usu.getContraseña()%>">
        </div>
    
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" name="rol"
                   id="rol" placeholder="Rol" value="<%=usu.getRol()%>">
   
    </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar Modificación
    </button>
    <hr>
    
</form>

<%@include file="components/bodyFinal.jsp" %>
