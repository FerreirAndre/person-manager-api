package com.FerreirAndre.personapi.controller;

import com.FerreirAndre.personapi.dto.request.PersonDTO;
import com.FerreirAndre.personapi.entity.Person;
import com.FerreirAndre.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonController {
        private final PersonService _personService;

        @Autowired
        public PersonController(PersonService _personService) {
                this._personService = _personService;
        }

        @CrossOrigin(origins = "http://localhost:3000")
        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public Long createPerson(@RequestBody @Valid PersonDTO personDto) {
                _personService.createPerson(personDto);
                return personDto.getId();
        }

        @CrossOrigin(origins = "http://localhost:3000")
        @GetMapping
        public List<Person> getAllPerson() {
                return _personService.getAllPerson();
        }
}
