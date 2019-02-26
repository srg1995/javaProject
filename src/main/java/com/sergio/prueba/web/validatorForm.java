package com.sergio.prueba.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sergio.prueba.dto.DatosDto;

@Component
public class ValidatorForm implements Validator{
	
	public boolean supports(Class clazz) {
        return DatosDto.class.equals(clazz);
    }


	public void validarNombre(DatosDto datosDto){

	}


	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "required.nombre","Field name is required.");
	}



}
