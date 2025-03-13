package com.FerreirAndre.personapi.service;

import com.FerreirAndre.personapi.dto.request.PersonDTO;
import com.FerreirAndre.personapi.entity.Person;
import com.FerreirAndre.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
        private final PersonRepository _personRepository;

        @Autowired
        public PersonService(PersonRepository personRepository) {
                this._personRepository = personRepository;
        }

        public void createPerson(PersonDTO personDto) {
                Person personToSave = Person
                        .builder()
                        .build();
                _personRepository.save(personToSave);
        }

        public List<Person> getAllPerson() {
                return _personRepository.findAll();
        }
}
