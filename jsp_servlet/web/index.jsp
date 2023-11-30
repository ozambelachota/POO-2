<%-- 
    Document   : index
    Created on : 7 nov. 2023, 14:51:37
    Author     : HAROLD
--%>

<%-- 
    Document   : principal
    Created on : 28-ago-2023, 1:19:16
    Author     : richard
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <h1>ingreso al sistema</h1>
       
        
         <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="NewServlet" method="post">
                        <div class="form-group">
                            <label >Usuario </label>
                            <input type="text" class="form-control" name="user" placeholder="usuario">
                        </div>
                        <div class="form-group">
                            <label >Contraseña: </label>
                            <input type="text" class="form-control" name="password" placeholder="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Envar</button>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                        <%
                            String nombre=request.getParameter("nombreDelHumano");
                            String edad=request.getParameter("edadDelHumano");
                            if((nombre=="" && nombre!=null) && (edad=="" && edad!=null)){
                                int edadNumero=Integer.parseInt(edad);
                                String mensajeEdad="";
                                if(edadNumero>=1 && edadNumero<=18){
                                    mensajeEdad="eres un humano inexperto";
                                }
                                if(edadNumero>18 && edadNumero<=30){
                                    mensajeEdad="eres un humano joven e inexperto";
                                }
                                if(edadNumero>30){
                                    mensajeEdad="eres un humano viejo";
                                }
                                String saludarAlHumano="Hola "+nombre+" a tus "+edad+" años "+mensajeEdad;
                                out.print(saludarAlHumano);
                            }
                            else{
                                out.print("Humano estupido, te pedi que colocaras tu nombre y tu edad");
                            }

                          
                        %>
                    </div>
                </div>

            </div>
        </div>
    </body>
</html>
