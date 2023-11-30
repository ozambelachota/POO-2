<%-- 
    Document   : add
    Created on : 29 ago. 2023, 14:21:16
    Author     : Richard Bardales
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String url="http://localhost:8080/webtienda/"; %>
        <form action="<%=url%>UsuarioController?accion=saveadd" method="post">
        <h1>Agregar Usuario</h1>
        Username <br>
        <input type="text" name="username"><br>
        Password <br>
        <input type="password" name="pass" ><br>
        <input type="submit" name="accion" value="agregar"><br>
        </form>
    </body>
</html>
