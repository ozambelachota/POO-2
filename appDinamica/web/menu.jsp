<%-- 
    Document   : menu
    Created on : 7 nov. 2023, 16:10:47
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu de opciones</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="js/jquery-latest.pack.js"></script>
        <script src="js/funciones.js"></script>

    </head>
    <body>
        <h1>Bienvenido</h1>
        <%
            String usuario = "";
            HttpSession sesion = request.getSession();
            usuario = sesion.getAttribute("user")==null?"":sesion.getAttribute("user").toString();
        %>
        <!--
         <ul id="nav1">
            <li> <a href="registroAreas.jsp"> Registro de áreas </a> </li>
            <li> <a href="registroProductos.jsp"> Registro de productos </a></li>
            <li> <a href="registroUsuario.jsp"> Registro de usuarios</a> </li>
        </ul> 
        -->

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <a class="navbar-brand" href="#"><%=usuario%></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul id="nav" class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="registroProductos.jsp">Registro de Productos <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="registroUsuario.jsp">Registro de Usuarios <span class="sr-only">(current)</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="registroAreas.jsp">Registro de áreas <span class="sr-only">(current)</span></a>
                    </li>
                </ul>

            </div>
        </nav>  


        <div id="show">



        </div>


    </body>
</html>
