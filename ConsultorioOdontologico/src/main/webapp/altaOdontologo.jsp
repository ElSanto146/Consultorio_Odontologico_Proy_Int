<%-- 
    Document   : altas
    Created on : 6 feb 2024, 20:49:11
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>

<h1>Alta Odontólogos</h1>
<p>Esto es una prueba</p>

<form class="user">

    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="dni"
               placeholder="DNI">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="nombre"
               placeholder="Nombre">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="apellido"
               placeholder="Apellido">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="telefono"
               placeholder="Teléfono">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="direccion"
               placeholder="Dirección">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="fechanac"
               placeholder="Fecha de nacimiento">
    </div>
    <div class="form-group col-sm-6 mb-3">
        <input type="email" class="form-control form-control-user" id="especialidad"
               placeholder="Especialidad">
    </div>
    
    <!-- Acá va a ir todo lo que respecta a horarios y usuarios -->
    
        <div class="form-group col-sm-4 mb-3">
            <a href="#" class="btn btn-primary btn-user btn-block">Crear Odontólogo</a>
         </div>
    
</form>

<%@include file="components/bodyFinal.jsp" %>
