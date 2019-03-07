package com.sergio.prueba.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sergio.prueba.dto.DatosDto;
import com.sergio.prueba.web.ValidatorForm;
import com.sergio.pueba.service.MiembrosService;






@Controller
public class HomeController {

	String PAG_FORMULARIO = "formulario";
	
	@Autowired
	private MiembrosService miembrosService;
	
	
	@RequestMapping(value = "/principal")
	public String cargaInicial(){
		return "index";
	}

	@RequestMapping(value = "/listado")
	public String mostrarListado(Model m){ 
		ArrayList lista = (ArrayList)miembrosService.getMiembrosmapper().getAllNombres();
		m.addAttribute("lista",lista);
		return "listado";
	}
	
	@RequestMapping(value = "/listadoUsuario")
	public String mostrarUsuario(Model m){ 
		ArrayList lista = (ArrayList)miembrosService.getMiembrosmapper().getAllNombres();
		m.addAttribute("lista",lista);
		return "listado";
	}
	
	@RequestMapping(value = "/insertarUsuario")
	public String insertaUsuario(@ModelAttribute DatosDto datos, Model m,Errors errors){ 
		ValidationUtils.invokeValidator(new ValidatorForm(), datos, errors);
		if(errors.hasErrors()) {
			m.addAttribute("datosForm",datos);
			m.addAttribute("nombre",datos.getNombre());
			String error = "errores en la validacion";
			m.addAttribute("error", error);
			return "formulario";
		}else {
			miembrosService.getMiembrosmapper().nuevoMiembro(datos);
			m.addAttribute("nombre", datos.getNombre());
			return "welcome";	
		}
	}
	/*@RequestMapping(value = "/insertarUsuario", method = RequestMethod.POST)
	public String actualizarUsuario(@ModelAttribute DatosDto datos, Model m){ 
		return "insertarUsuario";
	}
	*/
	@RequestMapping(value = "/eliminarUsuario")
	public String eliminarUsuario(@ModelAttribute DatosDto datos, Model m){
		System.out.println("dsdadasd");
		String campoV = "";
		if( datos.getNombre() != null || campoV.equals(datos.getNombre())){
			System.out.println("ola"+datos.getNombre()+"ola");
 			if(miembrosService.isMiembro(datos.getNombre())){				
				miembrosService.getMiembrosmapper().eliminarMiembro(datos.getNombre());
				
				return "exito";				
			}
			else {
				m.addAttribute("datosForm",datos);
				String error = "este usuario no existe";
				m.addAttribute("error", error);
				return "eliminarUsuario";
			}
		}
		else {
			m.addAttribute("datosForm",datos);
			String vacio = "rellene el campo";
			m.addAttribute("campoVacio", vacio);
			return "eliminarUsuario";
		}

	}
}
