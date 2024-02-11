<%-- 
    Document   : altaUsuarios
    Created on : 8 feb 2024, 19:57:08
    Author     : Carlos
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="components/header.jsp" %>
<%@include file="components/bodyPrimeraParte.jsp" %>


      <!-- Page Heading -->
                    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
                     <!--<p>A continuación podrá visualizr la lista completa dnas usuarios</p>-->
                    <div class="card shadow mb-4">
                        <div class="card-header py-3">
                            <h6 class="m-0 font-weight-bold text-primary">Listado de Usuarios</h6>
                        </div>
                        <div class="card-body">
                            <div class="table-responsive">
                                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>Id</th>
                                            <th>Nombre Usuario</th>  
                                            <th>Rol</th>
                                            <th style="width: 210px">Acción</th>
                                        </tr>
                                    </thead>
                                    
                                    <%
                                        List<Usuario>listaUsuarios=(List)request.getSession().getAttribute("listaUsuarios");                                    
                                    %>                                   
                                    
                                    <tbody>
                                        <%for(Usuario usu : listaUsuarios) {%>                                               
                                            
                                        <tr>
                                            <td><%=usu.getId_usuario()%></td>
                                            <td><%=usu.getNombreUsuario()%></td>
                                            <td><%=usu.getRol()%></td>
                                        </tr> 
                                       <% }%>
                                    </tbody> 
                                </table>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.container-fluid -->

            </div>
            <!-- End of Main Content -->


<%@include file="components/bodyFinal.jsp" %>