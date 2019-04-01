package com.sergio.prueba.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sergio.prueba.dto.UsuariosDto;

public interface UsuariosMapper {

	/**
	 * 
	 * @return lista de usuarios
	 */
	public List<UsuariosDto> getAllUsuarios();
	
	/**
	 * inserta nuevo usuarios
	 * @param usuarios
	 */
	public void nuevoUsuario(UsuariosDto usuarios);
	
	/**
	 * modifica un usuarios existente
	 * @param usuarios
	 */
	public void modificarUsuario(@Param("nombre") String nombre,@Param("dni") String dni,@Param("nombreAntiguo") String nombreAntiguo);
	
	/**
	 * elimina un usuarios existente
	 * @param nombre
	 */
	public void eliminarUsuario(String nombre);
	
	/**
	 * busca un usuarios
	 */
	public UsuariosDto buscarUsuario(String nombre);
	
	
}
