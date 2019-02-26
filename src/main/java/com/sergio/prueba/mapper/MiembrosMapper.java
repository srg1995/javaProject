package com.sergio.prueba.mapper;

import java.util.List;

import com.sergio.prueba.dto.DatosDto;

public interface MiembrosMapper {

	public List<DatosDto> getAllNombres();

	/*public DatosDto getNombre(int idprueba);

	public void deleteNombre(int idprueba);
	
	public void modNombre(DatosDto art);*/
	
	public void nuevoNombre(DatosDto art);
	
	
}
