package com.sergio.prueba.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sergio.prueba.dto.UsuariosDto;

@Component
public class ValidatorForm implements Validator{
	
	

	public boolean supports(Class<?> paramClass) {
        return UsuariosDto.class.equals(paramClass);
    }
 
    public void validate(Object obj, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", "valid.name");
    }


}
