<%-- 
    Document   : altaUsuarios
    Created on : 8 feb 2024, 19:57:08
    Author     : Carlos
--%>

<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>
<h1>Edición de Usuarios</h1>
<p>Este es el apartado para modificar un usuario del sistema.</p>

<!-- Si dá error de compatibilidad hacer un casteo --> 
<% Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar"); %>

<form class="user" method="POST" action="SvEditUsuarios">  

    <div class="form-group col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="nombreUsu"
               placeholder="Nombre Usuario" value="<%= usu.getNombreUsuario() %>">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="password" class="form-control form-control-user" name="contrasenia"
               placeholder="Contraseña" value="<%= usu.getContrasenia() %>">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="rol"
               placeholder="Rol" value="<%= usu.getRol() %>">
    </div>
    
    
        <div class="form-group col-sm-4 mb-3">
            <button type="submit" class="btn btn-primary btn-user btn-block">Guardar Modificación</button>
         </div>

</form>

<%@include file="components/bodyFinal.jsp" %>
