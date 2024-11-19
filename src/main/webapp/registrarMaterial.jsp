<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h5>Registrar Material</h5>
<p>Este es el apartado para registrar a los diferentes Materiales en el sistema</p>
<form class="user" action="SvMaterial" method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="Material"
                   placeholder="Material" name="material">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="CantidadMaterial"
                   placeholder="cantidad de Material a registrar" name="cantidadMaterial">
        </div>
    
        
    </div>
    <button type="submit" class="btn btn-primary btn-user btn-block">
        Registra Material
    </button>
    <hr>
    
</form>
<%@include file="components/bodyFinal.jsp" %>
