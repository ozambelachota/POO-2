<%-- 
    Document   : listUsuario
    Created on : 14 nov. 2023, 14:28:46
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/d2b4e855de.js" 
        crossorigin="anonymous"></script>

    </head>
    <body>

        <% 
        String v2 = request.getParameter("v2").toString();
        %> 
        <h1><%=v2%></h1>
        <h1>Lista de Usuarios</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Nº</th>
                    <th>Username</th>
                    <th>Area</th>
                    <th>Fullname</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>jperez</td>
                    <td>Soporte Técnico</td>
                    <td>Juan Pérez</td>
                    <td> <a href="#"> <i class="fas fa-solid fa-pen fa-1x"> </i> </a> </td>
                    <td> <a href="#" onClick="return confirm('¿Está seguro que desea eliminar el usuario?');"> <i class="fas fa-solid fa-trash fa-1x"> </i> </a> </td>
                </tr>
                
                <tr>
                    <td>2</td>
                    <td>rtorres</td>
                    <td>Desarrollo Software</td>
                    <td>Raul Torres</td>
                    <td> <a href="#"> <i class="fas fa-solid fa-pen fa-1x"> </i> </a> </td>
                    <td> <a href="#"> <i class="fas fa-solid fa-trash fa-1x"> </i> </a> </td>
                </tr>
                

            </tbody>
        </table>


    </body>
</html>
