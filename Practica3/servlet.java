/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author LSTI204_A1
 */
@WebServlet(name = "servlet", urlPatterns = {"/servlet"})
public class servlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>"); 
        out.println("<html>");
        out.println("<body>");
        out.println("<form method=\"post\" action=\"servlet\">");
        out.println("<p>Nombre:");
        out.println("<input type=\"text\" name=\"txt1\"><br><br>");
        out.println(" Primer Apellido :");
        out.println("<input type=\"text\" name=\"txt2\"><br><br>");
        out.println("Segundo Apellido :");
        out.println("<input type=\"text\" name=\"txt3\"><br><br>");
        out.println("Fecha de Nacimiento :");
        out.println("<input type=\"date\" name=\"txt4\"><br><br>");
        out.println("Correo Electronico");
        out.println("<input type=\"email\" name=\"txt5\"><br><br>");
        out.println("Password :");
        out.println("<input type=\"password\" name=\"txt6\"><br><br>");
        out.println("<input type=\"submit\" value=\"Enviar\" name=\"boton\">");
        out.println("</p>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            PrintWriter out = response.getWriter();
        
            String nombre = request.getParameter("txt1");
            String PrimerApellido = request.getParameter("txt2");
            String SegundoApellido = request.getParameter("txt3");
            String Fecha = request.getParameter("txt4");
            String email = request.getParameter("txt5");
            String password = request.getParameter("txt6");
            
            out.println("<html>");
            out.println("<body>");
            out.println("<head><title>Laboratorio3</title></head>");
            out.println("<p>");
            out.println("Nombre : " + nombre );
            out.println("<br>");
            out.println("Primer Apellido : " + PrimerApellido);
            out.println("<br>");
            out.println("Segundo Apellido : " + SegundoApellido);
            out.println("<br>");
            out.println("Fecha : " + Fecha);
            out.println("<br>");
            out.println("Correo Electronico : " + email);
            out.println("<br>");
            out.println("Password : " + password);
            out.println("</p>");
            out.println("</body>");
            out.println("</html>");
            
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
