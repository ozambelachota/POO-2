<%-- 
    Document   : index
    Created on : 7 nov. 2023, 14:52:37
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap/bootstrap.min.css" type="text/css">
        <script src="bootstrap/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <h1>Ingreso al Sistema</h1>

        <div class="container"> 
            <div class="row">
                <div class="col">
                    <form action="mainServlet" method="post">
                        <div class="form-group">
                            <label>Usuario </label>
                            <input type="text" class="form-control" name="username">                            
                        </div>
                        <div class="form-group">
                            <label> Contraseña </label>
                            <input type="password" class="form-control" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary"> Enviar </button>
                    </form>
                    <div class="row">

                        <%
                            HttpSession s = request.getSession();
                            String mensaje = s.getAttribute("mensaje") != null ? s.getAttribute("mensaje").toString() : "";
                            out.print(mensaje);
                        %>

                    </div>
                </div>
            </div>

        </div>

                     


    </body>
</html>
