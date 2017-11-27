package com.hamp.service;

import java.util.List;

import com.hamp.model.Habilidad;

public interface IHabilidadService extends CRUD<Habilidad> {
	
	List<Habilidad> getHabilidadByPersonaId(Integer id);
}
