package com.sergio.prueba.dto;

import java.io.Serializable;
import org.hibernate.validator.constraints.NotEmpty;

public class UsuariosDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "O nome deve ser preenchido")
	private String nombre;
	private String dni;
	
	public UsuariosDto() {
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
}
