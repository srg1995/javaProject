package com.sergio.prueba.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sergio.prueba.dto.DatosDto;
import com.sergio.prueba.web.ValidatorForm;
import com.sergio.pueba.service.MiembrosService;






@Controller
public class HomeController {

	String PAG_FORMULARIO = "formulario";
	@Autowired
	private MiembrosService miembrosService;

	
	@RequestMapping(value = "/formulario", method = RequestMethod.GET)
	public String formulario(@ModelAttribute DatosDto datos, Model m){
		//objetos vista y modelo
	//	m.addAttribute("nombre", datos);
		//m.addAttribute("datos",datos);
		List nombres= (List)miembrosService.getMiembrosmapper().getAllNombres();
		m.addAttribute("nombres",nombres);
		return "Formulario";
	}
	
	/*@GetMapping("/formulario")
	public List getAllNombres() {
		return (List)miembrosService.getMiembrosmapper().getAllNombres();		
	}*/
	
	@RequestMapping(value = "/apellido", method = RequestMethod.POST)
	public String welcome(@ModelAttribute DatosDto datos, Model m,Errors errors,HttpServletRequest request, HttpServletResponse response, BindingResult bindingResult){ 
		

		
		errors = new BeanPropertyBindingResult(datos, "datos");
		ValidationUtils.invokeValidator(new ValidatorForm(), datos, errors);
		
		if(errors.hasErrors()) {

			System.out.println("entro");
			//m.addAttribute("nombre", datos.getNombre());
			m.addAttribute("datos",datos);
			m.addAttribute("nombre",datos.getNombre());
	
			return "Formulario";
		}else {
			
			System.out.println("fuera");
			m.addAttribute("nombre", datos.getNombre());
			return "welcome";
			
		}
	}
}
