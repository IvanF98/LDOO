<%-- 
    Document   : cookie
    Created on : Nov 7, 2018, 4:07:20 PM
    Author     : L-98
--%>

<%@page import="javax.servlet.http.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookie</title>
    </head>
    <body>
        <%
            Cookie[] cookie;
            cookie = request.getCookies();
            
            for(int i=0;i<cookie.length;i++){
                out.println("<p><b> Nombre: </b> "+cookie[i+1].getName()+"</p>");
                out.println("<p><b> Valor: </b> "+cookie[i+1].getValue()+"</p>");
                out.println("<hr>");
            }
        %>
    </body>
</html>