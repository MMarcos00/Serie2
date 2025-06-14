package com.beesion.ms.test.service.impl;

import com.beesion.ms.model.Person;

import com.beesion.ms.test.repository.PersonRepository;
import com.beesion.ms.test.service.IPersonService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PersonService implements IPersonService {

	@Inject
	PersonRepository personRepository;

	@Override
	@Transactional
	public void save(Person person) {
		personRepository.persist(person);
	}
}
