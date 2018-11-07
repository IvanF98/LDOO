/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author L-98
 */
public class Registrarse {
        
        String user;
        String password;
        
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user = request.getParameter("txt1");
        password = request.getParameter("txt2");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("username", user);
        sesion.setAttribute("password", password);
        response.sendRedirect("Login.jsp");
    
        }
}    
