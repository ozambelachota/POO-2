<%-- 
    Document   : listUser
    Created on : 17 nov. 2023, 14:56:16
    Author     : HAROLD
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DAO.UserDAO"%>
<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% String url="http://localhost:8080/MVC-17-11-2023-poo2/"; %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>list users</title>
        <link rel="stylesheet" href="../bootstrap/bootstrap.min.css"   />
    </head>
    <body>
        <div class="container">
        <h1>list users</h1>
        <div> <a href="<%=url%>UserController?accion=add" class="btn btn-primary">agregar</a></div>
        
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>codigo</th>
                    <th>users</th>
                    <th>modificar</th>
                    <th>eliminar</th>
                </tr>
            </thead>
            <tbody>
                <% 
                UserDAO userD= new UserDAO();
                List<User> ulist = userD.listar();
                for(User u: ulist){
                %>
                <tr>
                    <td><%=u.getIdUser() %></td>
                    <td><%=u.getUserName() %></td>
                    <td>
                        <a href="<%=url%>UserController?accion=edit&id=<%=u.getIdUser() %>" class="btn btn-secondary">modificar</a>
                    </td>
                    <td>
                        <a href="<%=url%>UserController?accion=delete&id_delete=<%=u.getIdUser() %>" onclick="return confirm('¿esta seguro de eliminar?');" class="btn btn-danger" >eliminar</a>
                    </td>
                </tr>
                <%}%>
            </tbody>
        </table>       
        </div>
     
    </body>
</html>
