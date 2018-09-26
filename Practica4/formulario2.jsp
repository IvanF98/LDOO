<%-- 
    Document   : formulario2
    Created on : 19/09/2018, 07:04:02 PM
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
        <% 
            String nombre = request.getParameter("txt1");
            String apellidos = request.getParameter("txt2");
            String nacimiento = request.getParameter("txt3");
            String email = request.getParameter("txt4");
            String password = request.getParameter("txt5");
          
           out.println("Nombre:" + nombre);
           out.println("<br>");
           out.println("Apellido:" + apellidos);
           out.println("<br>");
           out.println("Fecha de Nacimiento: " + nacimiento);
           out.println("<br>");
           out.println("Email: " + email);
           out.println("<br>");
           out.println("Password: " + password );
         %>
         
         
    </body>
</html>
