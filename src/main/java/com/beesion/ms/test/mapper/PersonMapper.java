package com.beesion.ms.test.mapper;

import com.beesion.ms.model.Person;
import com.beesion.ms.test.dto.PersonDto;

public class PersonMapper {

    public static Person toEntity(PersonDto dto) {
        Person person = new Person();
        person.setName(dto.getName());
        return person;
    }

    public static PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.setName(person.getName());
        return dto;
    }
}
