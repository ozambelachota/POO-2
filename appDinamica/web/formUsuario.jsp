<%-- 
    Document   : formUsuario
    Created on : 14 nov. 2023, 14:28:29
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/d2b4e855de.js" 
        crossorigin="anonymous"></script>
    </head>
    <body>
        <h1>Formulario de Usuario</h1>

        <div class="row">
            <div class="col-6">
                <label> Username </label>
                <input type="text" class="form-control" name="txtUsuario">
            </div>
            <div class="col-6">
                <label> Area </label>
                <select name="sArea" class="form-control">
                    <option value="1">
                        Recursos Humanos
                    </option>
                    <option value="2">
                        Soporte Técnico
                    </option>
                    <option value="3">
                        Desarrollo de Software
                    </option>                    
                </select>

            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label> Fullname</label>
                <input type="text" class="form-control" name="txtfullname">
            </div>
            <div class="col-6">
                <br>
                <button class="btn btn-primary"> Guardar</button>
                <button class="btn btn-danger"> Limpiar</button>
            </div>
        </div>

    </body>
</html>
