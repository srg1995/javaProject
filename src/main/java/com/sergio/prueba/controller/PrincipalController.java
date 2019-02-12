package com.sergio.prueba.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {

    @RequestMapping(value = "/hola")
    public ModelAndView hola() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("titulo", "Tutoriales Spring MVC :: HelloController");
        mv.addObject("mensaje", "saludo desde el metodo: <br /> "
                + "<code>public ModelAndView hola() {...}</code>");
        
        mv.setViewName("hello");
        return mv;
    }

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        model.addAttribute("titulo", "Tutoriales Spring MVC :: HelloController");
        model.addAttribute("mensaje", "saludo desde el metodo: <br /> "
                + "<code>public String hello(Model) {...}</code>");

        return "hello";
    }
}