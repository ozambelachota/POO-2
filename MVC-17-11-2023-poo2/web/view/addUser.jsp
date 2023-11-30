
<%-- 
    Document   : addUser
    Created on : 17 nov. 2023, 14:55:46
    Author     : HAROLD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String url="http://localhost:8080/MVC-17-11-2023-poo2/"; %>
    <head>
        <link rel="stylesheet" href="../bootstrap/bootstrap.min.css"  />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>user new</h1>
        <form action="<%=url%>UserController?accion=saveadd"  class="form ">
            Username: <br>
            <input class="input" type="text" name="usuario" /> <br>
            Password: <br>
            <input type="password" name="password"/>
            <br>
            <input type="submit" name="accion" value="saveadd" />
        </form>

    </body>
</html>
