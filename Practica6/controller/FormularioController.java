
package controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.model;
import org.springframework.stereotype.Controller;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.request;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/controller.htm")
public class FormularioController extends HttpServlet{
    
    String name;
    String password;
    
    @RequestMapping(method = RequestMethod.GET)
    public String Recibir(@RequestParam("txt1") String nombre, @RequestParam("txt2") String primerapellido, @RequestParam("txt3") String segundoapellido, @RequestParam("txt4") String fecha, @RequestParam("txt5") String email, @RequestParam("txt6") String pass, Model model){
                
        if (nombre.trim().equals("") && primerapellido.trim().equals("") && segundoapellido.trim().equals("") && fecha.trim().equals("") && email.trim().equals("") && pass.trim().equals("")){
            model.addAttribute("error");
            return "error";
        }else{
            
            model m1 = new model(nombre, primerapellido, segundoapellido, fecha, email, pass);
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
            return "aceptado";
        }else{
            return "rechazado";
        }   
    }
    
}
