package com.sergio.prueba.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sergio.prueba.dto.UsuariosDto;

@Component
public class ValidatorForm implements Validator{
	
	public boolean supports(Class clazz) {
        return UsuariosDto.class.equals(clazz);
    }


	public void validarNombre(UsuariosDto usuariosDto){

	}


	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","Field name is required.");
	}



}
