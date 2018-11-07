<%-- 
    Document   : Salir
    Created on : Nov 7, 2018, 4:02:03 PM
    Author     : L-98
--%>

<%
        HttpSession sesion = request.getSession(false);
        session.invalidate();
        
        response.sendRedirect("Login.jsp");
%>
