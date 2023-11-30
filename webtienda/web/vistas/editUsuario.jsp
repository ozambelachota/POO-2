<%-- 
    Document   : edit
    Created on : 29 ago. 2023, 14:21:21
    Author     : Richard Bardales
--%>

<%@page import="Modelo.Usuario"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% String url="http://localhost:8080/webtienda/"; %>
        
        <%
            UsuarioDAO dao = new UsuarioDAO();
            int id =Integer.parseInt((String) request.getAttribute("idUsuario"));
            Usuario u = (Usuario)dao.get(id);
        %>
        <form action="<%=url%>UsuarioController?accion=saveedit" method="post">
        <h1>Agregar Usuario</h1>
        Username <br>
        <input type="text" name="username" value="<%= u.getUsername()%>"><br>
        Password <br>
        <input type="password" name="pass" value="<%= u.getPass()%>"><br>
        <input type="hidden" name="txtid" value="<%= u.getIdUsuario()%>"><br>
        <input type="submit" name="accion" value="actualizar"><br>
        </form>
    </body>
</html>
