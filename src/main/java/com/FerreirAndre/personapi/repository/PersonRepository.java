package com.FerreirAndre.personapi.repository;

import com.FerreirAndre.personapi.dto.request.PersonDTO;
import com.FerreirAndre.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
