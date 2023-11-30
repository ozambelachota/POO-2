<%-- 
    Document   : editUser
    Created on : 17 nov. 2023, 14:56:03
    Author     : HAROLD
--%>

<%@page import="org.apache.tomcat.util.buf.UDecoder"%>
<%@page import="model.User"%>
<%@page import="DAO.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <% String url="http://localhost:8080/MVC-17-11-2023-poo2/"; %>
        <title>JSP Page</title>
    </head>
    <body>
        <% UserDAO userD = new UserDAO();
        int id = Integer.parseInt((String) request.getAttribute("idUser"));
        User user =(User) userD.get(id);
        %>
        <h1>edit user</h1>
        <form action="<%=url%>UserController?accion=saveedit">
            Username: <br>
            <input type="text" name="username" value="<%=user.getUserName() %>" /> <br>
            Password: <br>
            <input type="password" name="password" value="<%=user.getPassword() %>"/>
            <br>
            <input name="id_edit" value="<%=id%>" />       
            <br />
            <input type="submit" name="accion" value="saveedit" />
        </form>
            <a href="<%=url%>UserController?accion=list">volver</a>
    </body>
</html>
