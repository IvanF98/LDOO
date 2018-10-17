/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.HashMap;
import java.util.Map;
import model.model;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/controller.htm")
public class FormularioController {
    
    @RequestMapping(method = RequestMethod.POST)
    public String Recibir(@RequestParam("txt1") String nombre, @RequestParam("txt2") String primerapellido, @RequestParam("txt3") String segundoapellido, @RequestParam("txt4") String fecha, @RequestParam("txt5") String email, @RequestParam("txt6") String password, Model model){
        if (nombre.trim().equals("") && primerapellido.trim().equals("") && segundoapellido.trim().equals("") && fecha.trim().equals("") && email.trim().equals("") && password.trim().equals("")){
            model.addAttribute("error");
            return "error";
        }else{
            
            model m1 = new model(nombre, primerapellido, segundoapellido, fecha, email, password);
            model.addAttribute("modelo1", m1);
            
            return "FFinal";
    }
    }
    
}
