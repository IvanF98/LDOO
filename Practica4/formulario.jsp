<%-- 
    Document   : formulario
    Created on : 19/09/2018, 06:50:16 PM
    Author     : LSTI204_B5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Laboratorio4</title>
    </head>
    <body>
        <form action="formulario2.jsp">
        <h3>Nombre:</h3>
            <input type='text' name="txt1">
        <h3>Apellidos:</h3>
            <input type='text' name='txt2'>
        <h3>Fecha de nacimiento</h3>
            <input type='date' name='txt3'>
        <h3>Email: </h3>
            <input type='email' name='txt4'>
        <h3>Contraseña: </h3>
            <input type='password' name='txt5'><br>
            <input type="submit" value="enviar" name="btn">  
        </form>
    </body>
</html>
