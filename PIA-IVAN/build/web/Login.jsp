<%-- 
    Document   : Login
    Created on : Nov 6, 2018, 9:21:44 PM
    Author     : L-98
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
   <form action="controller.htm" method="POST">
        <p>Nombre</p>
        <input type="text" name="usuario1">
        <p>Password</p>
        <input type="password" name="password1">
        <br><br><input type="submit" name="boton">
        <br><br><a href="Registrarse.jsp">Registrarse</a>
        </form>
    </body>
</html>
