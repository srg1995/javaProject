package com.sergio.prueba.web;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.sergio.prueba.dto.DatosDto;

public class validatorForm implements Validator{
	
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object datos, Errors errors) {
		// TODO Auto-generated method stub
		validarNombre(datos);
	}

	public void validarNombre(Object object){
		DatosDto datos = (DatosDto)object;
		Pattern patron = Pattern.compile("[a-zA-Z]{5,10}");	
		Matcher mat = patron.matcher(datos.getNombre());
	}

}
