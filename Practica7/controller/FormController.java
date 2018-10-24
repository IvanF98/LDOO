
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/controller.htm")
public class FormController extends HttpServlet{
    
    String name;
    String password;
    String uname;
    
    @RequestMapping(method = RequestMethod.GET)
    public String Recibir(@RequestParam("txt1") String nombre, @RequestParam("txt2") String papellido, @RequestParam("txt3") String sapellido, @RequestParam("txt4") String fecha, @RequestParam("txt5") String mail, @RequestParam("txt6") String pass, Model model){
                
        if (nombre.trim().equals("") && papellido.trim().equals("") && sapellido.trim().equals("") && fecha.trim().equals("") && mail.trim().equals("") && pass.trim().equals("")){
            String a = "No llenaste los campos";
            model.addAttribute("Error", a);
            return "Error";
        }else{
            
            model m1 = new model(nombre, papellido, sapellido, fecha, mail, pass);
            model.addAttribute("modelo1", m1);
            
            name = nombre;
            password = pass;
            
            return "Login";
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String Login(@RequestParam("txt1") String uname, @RequestParam("txt6") String upass, Model model, HttpServletRequest request, HttpServletResponse response){
        
        if((name.equals(uname)) && (password.equals(upass))){
            javax.servlet.http.HttpSession sesion = request.getSession();
            sesion.setAttribute("uname", uname);
            Cookie cookie = new Cookie ("uname", uname);
            cookie.setMaxAge(60*60);
            response.addCookie(cookie);
            return "Bienvenido";
        }else{
            return "Rechazado";
        }
    }
    
    @WebServlet(name = "cookie", urlPatterns = "/Bienvenido")
    public class DeleteCookieServlet extends HttpServlet {

        /**
         *
         * @param request
         * @param response
         * @throws ServletException
         * @throws IOException
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            Cookie cookie = new Cookie("uname", uname);
            cookie.setMaxAge(0);
            response.addCookie(cookie);
        }
    }
}
