package com.beesion.ms.test.service.impl;

import com.beesion.ms.test.dto.AddressDto;
import com.beesion.ms.test.repository.AddressRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class AddressService {
    @Inject
    AddressRepository repo;
    public AddressDto create(AddressDto dto) { /* conv + persist */
        return dto;
    }
    public List<AddressDto> listByPerson(Long personId) { /* query por person.id */
        return List.of();
    }
}
