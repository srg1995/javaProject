package com.sergio.pueba.service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sergio.prueba.mapper.MiembrosMapper;

public class MiembrosService {


		@Autowired
		private MiembrosMapper miembrosMapper;

		public MiembrosMapper getMiembrosmapper() {
			return miembrosMapper;
		}
		
		public boolean isMiembro(String nombre) {
			if(null == miembrosMapper.buscarMiembro(nombre)) {
				return false;
			}else{				
				return true;
			}
		}

		public void setMiembrosMapper(MiembrosMapper miembrosMapper) {
			this.miembrosMapper = miembrosMapper;
		}
		
		
		
	}

