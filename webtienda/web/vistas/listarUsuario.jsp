<%-- 
    Document   : listar
    Created on : 29 ago. 2023, 14:21:11
    Author     : Richard Bardales
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <h1>Listar Usuarios</h1>
        <a href="<%=url%>UsuarioController?accion=add"> Nuevo </a>
        <table border="1">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Usuario</th>
                    <th>Modificar</th>
                    <th>Eliminar</th>
                </tr>
            </thead>
            <%
                UsuarioDAO udao = new UsuarioDAO();
                List<Usuario> list = udao.listar();
                Iterator<Usuario> iter = list.iterator();
                Usuario user = null;
                while (iter.hasNext()) {
                    user = iter.next();

            %>
            <tbody>
                <tr>
                    <td><%= user.getIdUsuario()%></td>
                    <td><%= user.getUsername()%></td>
                    <td><a href="<%=url%>UsuarioController?accion=edit&id=<%= user.getIdUsuario()%>"> Modificar </a> </td>
                    <td> <a href="<%=url%>UsuarioController?accion=delete&id=<%= user.getIdUsuario()%>" onclick="return confirm('Desea eliminar el archivo');"> Eliminar </a> </td>
                </tr>                
            </tbody>
            <%}%>

        </table>

    </body>
</html>
