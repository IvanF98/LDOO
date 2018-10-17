<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>

    <body>
        <form action="controller.htm" method="POST">
        <p>Nombre</p>
        <input type="text" name="txt1">
        <p>Primer Apellido</p>
        <input type="text" name="txt2">
        <p>Segundo Apellido</p>
        <input type="text" name="txt3">
        <p>Fecha de Nacimiento</p>
        <input type="date" name="txt4">
        <p>Email</p>
        <input type="email" name="txt5">
        <p>Password</p>
        <input type="password" name="txt6">
        <br><br><input type="submit" name="boton">
        </form>
    </body>
</html>
