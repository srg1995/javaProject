package com.sergio.prueba.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sergio.prueba.dto.UsuariosDto;
import com.sergio.prueba.mapper.UsuariosMapper;

public class UsuariosService {


		@Autowired
		private UsuariosMapper usuariosMapper;


		/**
		 * si existe un usuario
		 * 
		 * @param nombre
		 * @return 
		 */
		public boolean isUsuario(String nombre) {
			if(null == usuariosMapper.buscarUsuario(nombre)) {
				return false;
			}else{				
				return true;
			}
		}
		
		/**
		 * mostrar usuario
		 * 
		 * */
		public UsuariosDto getUsuario(String usuario){
			if(null != usuariosMapper.buscarUsuario(usuario)) {
				return usuariosMapper.buscarUsuario(usuario);
			}else {
				return null;
			}
		}

		/**
		 * getter
		 * 
		 * @return
		 */
		public UsuariosMapper getUsuariosmapper() {
			return usuariosMapper;
		}
		
		/**
		 * setter
		 * 
		 * @param usuariosMapper
		 */
		public void setUsuariosMapper(UsuariosMapper usuariosMapper) {
			this.usuariosMapper = usuariosMapper;
		}
		
		
		
	}

