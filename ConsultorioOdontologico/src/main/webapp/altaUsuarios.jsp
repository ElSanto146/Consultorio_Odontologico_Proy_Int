<%-- 
    Document   : altaUsuarios
    Created on : 8 feb 2024, 19:57:08
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>
<h1>Alta Usuarios</h1>
<p>Este es el apartado para dar de alta a los diferentes usuarios del sistema.</p>

<form class="user" method="POST" action="SvUsuarios">

    <div class="form-group col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="nombreUsu"
               placeholder="Nombre Usuario">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="password" class="form-control form-control-user" name="contrasenia"
               placeholder="Contraseña">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="rol"
               placeholder="Rol">
    </div>
    
    
        <div class="form-group col-sm-4 mb-3">
            <button type="submit" class="btn btn-primary btn-user btn-block">Crear Usuario</button>
         </div>

</form>

<%@include file="components/bodyFinal.jsp" %>
