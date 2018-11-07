/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;

/**
 *
 * @author L-98
 */

@Controller
public class Login {
    
     String user;
    String password;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        user = request.getParameter("usuario1");
        password = request.getParameter("password1");
        HttpSession sesion = request.getSession();
        String ssusser = (String) sesion.getAttribute("username");
        String sspass = (String) sesion.getAttribute("password");
        Cookie cousser = new Cookie ("USUARIO" ,user);
        Cookie copass = new Cookie ("CLAVE", password);
        
        response.addCookie(cousser);
        response.addCookie(copass);
        
        if(ssusser.equals(null) && sspass.equals(null)){
           
            response.sendRedirect("Registrarse");
        }else if(ssusser.equals(null) && sspass.equals(null)){
                response.sendRedirect("error");
            }else if(ssusser.equals(user) && sspass.equals(password)){
                response.sendRedirect("Bienvenido");
        }else{
                response.sendRedirect("error");
            }
        
    }
}
