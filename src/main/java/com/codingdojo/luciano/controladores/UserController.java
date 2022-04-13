package com.codingdojo.luciano.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	// definición de clase e importaciones aquí...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Alambre de cobre";
        double price = 5.25;
        String description = "Tiras de metal, otra ilustración de nanosegundos.";
        String vendor = "Tienda de la esquina Pequeñas Cosas";
    
    	// ¡Tu código aquí! Agrega valores al modelo de vista que se representará
        
        model.addAttribute("nombre", name);
        model.addAttribute("item", itemName);
        model.addAttribute("precio", price);
        model.addAttribute("descripcion", description);
        model.addAttribute("proveedor", vendor);
    
        return "index.jsp";
    }
    //...
    
	
}
