package com.hamp.service;

import com.hamp.model.Persona;

public interface IPersonaService extends CRUD<Persona>{

	Integer getUserIdByEmail(String correo) throws Exception;
	
}
