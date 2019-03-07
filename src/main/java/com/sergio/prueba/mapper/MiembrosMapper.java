package com.sergio.prueba.mapper;

import java.util.List;

import com.sergio.prueba.dto.DatosDto;

public interface MiembrosMapper {

	public List<DatosDto> getAllNombres();

	/*public DatosDto getNombre(int idprueba);

	public void deleteNombre(int idprueba);
	
	public void modNombre(DatosDto art);*/
	
	public void nuevoMiembro(DatosDto datos);
	
	public void modificarMiembro(DatosDto datos);
	
	public void eliminarMiembro(String nombre);
	
	public DatosDto buscarMiembro(String nombre);
	
	
}
