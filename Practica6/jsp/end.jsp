

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Tu Formulario</h1>
        <p>Nombre: ${requestScope.modelo1.nombre}</p>
        <p>Primer Apellido: ${requestScope.modelo1.primerapellido}</p>
        <p>Segundo Apellido: ${requestScope.modelo1.segundoapellido}</p>
        <p>Fecha: ${requestScope.modelo1.fecha}</p>
        <p>Mail: ${requestScope.modelo1.email}</p>
        <p>Password: ${requestScope.modelo1.pass}</p>
    </body>
</html>
