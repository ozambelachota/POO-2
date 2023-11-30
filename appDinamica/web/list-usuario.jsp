<%-- 
    Document   : list-usuario
    Created on : 14 nov. 2023, 14:29:28
    Author     : HAROLD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css"/>
        
        <script src="https://kit.fontawesome.com/d2b4e855de.js" crossorigin="anonymous"></script>

        <script src="bootstrap/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <h1>lista de usuarios</h1>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>N°</th>
                    <th>Username</th>
                    <th>Area</th>
                    <th>fullname</th>
                    <th>modificar</th>
                    <th>eliminar</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>jperez</td>
                    <td>soporte tecnico</td>
                    <td>Juan perez</td>
                    <td><a href="#" ><i class="fas fa-solid fa-pen fa-1x"></i></a></td>
                    <td><a href="#" onclick="return Confirm("esta seguro que desea eliminar el elemento")" ><i class="fas fa-solid fa-trash fa-1x"></i></a></td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>rtorres</td>
                    <td>soporte tecnico</td>
                    <td>rodrigo torres</td>
                    <td><a href="#" ><i class="fas fa-solid fa-pen fa-1x"></i></a></td>
                    <td><a href="#" ><i class="fas fa-solid fa-trash fa-1x"></i></a></td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>jmori</td>
                    <td>soporte tecnico</td>
                    <td>jose mori</td>
                    <td><a href="#" ><i class="fas fa-solid fa-pen fa-1x"></i></a></td>
                    <td><a href="#" ><i class="fas fa-solid fa-trash fa-1x"></i></a></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
