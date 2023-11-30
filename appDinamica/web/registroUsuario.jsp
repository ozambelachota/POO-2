<%-- 
    Document   : registroUsuario
    Created on : 10 nov. 2023, 15:18:33
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuarios</h1>
        <jsp:include page="formUsuario.jsp" />
        <jsp:include page="listUsuario.jsp">
            <jsp:param name="v2" value="bcd"/>
        </jsp:include>
    </body>
</html>
