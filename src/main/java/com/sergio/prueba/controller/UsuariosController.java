package com.sergio.prueba.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sergio.prueba.dto.UsuariosDto;
import com.sergio.prueba.web.ValidatorForm;
import com.sergio.pueba.service.UsuariosService;


@Controller
@RequestMapping(value = "/")
public class UsuariosController {

	String PAG_FORMULARIO = "formulario";
	
	@Autowired
	private UsuariosService usuariosService;
	

	
	/**
	 * mostrar todos los usuarios de la bbdd
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/listado")
	public String mostrarListado(Model m){ 
		ArrayList lista = (ArrayList)usuariosService.getUsuariosmapper().getAllUsuarios();
		m.addAttribute("lista",lista);
		return "listado";
	}
	
	/**
	 * Mostrar un usuario individual
	 * 
	 * @param usuarioDto
	 * @param m
	 * @param errors
	 * @return
	 */
	@RequestMapping(value = "/listadoUsuario")
	public String mostrarUsuario(@ModelAttribute UsuariosDto usuarioDto, Model m, Errors errors){ 
 		ValidationUtils.invokeValidator(new ValidatorForm(), usuarioDto, errors);
		if(!errors.hasErrors()) {
			if(usuariosService.getUsuario(usuarioDto.getNombre()) != null){				
				m.addAttribute("usuario",usuariosService.getUsuario(usuarioDto.getNombre()));
			}else {
				m.addAttribute("error","no existe este usuario");
			}
		}else {
			m.addAttribute("error","no sigue los parametros");
		}
		m.addAttribute("usuarioDto",usuarioDto);
		
		return "buscarUsuario";
	}
	
	/**
	 * Insertar usuarios en la bbdd
	 * @param usuarios
	 * @param m
	 * @param errors
	 * @return
	 */
	@RequestMapping(value = "/insertarUsuario")
	public String insertaUsuario(@ModelAttribute UsuariosDto usuarios, Model m,Errors errors){ 
		ValidationUtils.invokeValidator(new ValidatorForm(), usuarios, errors);
		if(errors.hasErrors()) {
			m.addAttribute("usuariosForm",usuarios);
			m.addAttribute("nombre",usuarios.getNombre());
			String error = "errores en la validacion";
			m.addAttribute("error", error);
			return "insertarUsuario";
		}else {
			usuariosService.getUsuariosmapper().nuevoUsuario(usuarios);
			m.addAttribute("nombre", usuarios.getNombre());
			return "welcome";	
		}
	}

	/**
	 * eliminar usuarios de la bbdd
	 * @param usuarios
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/eliminarUsuario")
	public String eliminarUsuario(@ModelAttribute UsuariosDto usuarios, Model m){
	//falta si vacio el input 
		if( usuarios.getNombre() != null){
 			if(usuariosService.isUsuario(usuarios.getNombre())){				
				usuariosService.getUsuariosmapper().eliminarUsuario(usuarios.getNombre());
				return "exito";				
			}
			else {
				m.addAttribute("usuariosForm",usuarios);
				String error = "este usuario no existe";
				m.addAttribute("error", error);
				return "eliminarUsuario";
			}
		}
		else {
			m.addAttribute("usuariosForm",usuarios);
			String vacio = "rellene el campo";
			m.addAttribute("campoVacio", vacio);
			return "eliminarUsuario";
		}

	}
	
	/**
	 * modificar el usuario de la bbdd
	 * @param usuarios
	 * @param usuario
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/modificarUsuario",method = RequestMethod.GET)
	public String modificarUsuario(@ModelAttribute UsuariosDto usuarios,@RequestParam("usuario") String usuario, Model m){
		System.out.println(usuario);
		//System.out.println(request.getParameter("nombre"));
		//m.addAttribute("error",request.getParameter("nombre"));
		return "insertarUsuario";

	}
	
	
}
