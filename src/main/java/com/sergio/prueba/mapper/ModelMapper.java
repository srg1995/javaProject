package com.sergio.prueba.mapper;

public class ModelMapper {
	ModelMapper modelMapper = new ModelMapper();
	// user here is a prepopulated User instance
	//UserDTO userDTO = modelMapper.map(user, UserDTO.class);
	
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
