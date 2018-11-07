<%-- 
    Document   : Bievenido
    Created on : Nov 7, 2018, 3:57:08 PM
    Author     : L-98
--%>

<%@page import="Modelo.Usuario"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <%
        HttpSession sesion = request.getSession();
        String usuario,contrasena;
        usuario = sesion.getAttribute("username").toString();
        contrasena = sesion.getAttribute("password").toString();
        Usuario u = new Usuario(usuario,contrasena);
    %> 
    <body>
        <h1>Bienvenido</h1>
        <br><br>Nombre: <%=u.getUsuario()%>
        <br>Contraseña: <%=u.getPassword()%>
        <form action="Salir.jsp">
            <input type="submit" name="Salir"/>
        </form>
        <br>
        <a href="Cookie.jsp">
            <input type="submit" value="cookie" name="Ver cookie"/>
        </a>
        <br>
    </body>
</html>