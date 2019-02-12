package com.sergio.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sergio.prueba.dto.DatosDto;
import com.sergio.prueba.web.validatorForm;
 

@Controller
public class HomeController {

	String PAG_FORMULARIO = "formulario";

	
@RequestMapping(value = "/formulario", method = RequestMethod.GET)
public String formulario(@ModelAttribute DatosDto datos, Model m){
	//objetos vista y modelo
//	m.addAttribute("nombre", datos);
	m.addAttribute("categoryOptions",datos);
	m.addAttribute("nombre",datos.getNombre());
	return "Formulario";
}
	
	@RequestMapping(value = "/apellido", method = RequestMethod.POST)
	public String welcome(DatosDto datos, Model m){ 
		Object o = datos;
		Errors errors = new BeanPropertyBindingResult(datos, "datos");
		ValidationUtils.invokeValidator(new validatorForm(), o, errors);
		m.addAttribute("nombre", datos.getNombre());
		return "welcome";
	}
}
