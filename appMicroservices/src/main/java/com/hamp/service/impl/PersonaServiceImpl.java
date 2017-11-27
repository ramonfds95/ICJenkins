package com.hamp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamp.model.Persona;
import com.hamp.repository.IPersonaRepository;
import com.hamp.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepository repo;
	
	@Override
	public List<Persona> findAll() {
		return repo.findAll();
	}

	@Override
	public Persona create(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public Persona find(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public Persona update(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public Integer getUserIdByEmail(String correo) throws Exception{		
		return repo.getUserIdByEmail(correo);
	}

}
