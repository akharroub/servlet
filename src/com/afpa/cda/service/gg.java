package com.afpa.cda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afpa.cda.dao.PersonneRepository;
import com.afpa.cda.dto.PersonneDto;

@Service
public class gg implements IPersonneService {

	@Autowired
	private PersonneRepository personneRepository;
	
	@Override
	public List<PersonneDto> chercherToutesLesPersonnes() {
		return this.personneRepository
			.findAll()
			.stream()
			.map(e->new PersonneDto(e.getId(), e.getName(),e.getPrenom(),e.getMetier(),e.getAdresse()))
			.collect(Collectors.toList());
	}

}