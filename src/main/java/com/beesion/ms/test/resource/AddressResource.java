package com.beesion.ms.test.resource;

import com.beesion.ms.model.Address;

import com.beesion.ms.test.repository.AddressRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/addresses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class AddressResource {

    @Inject
    AddressRepository addressRepository;

    @GET
    public List<Address> list() {
        return addressRepository.listAll();
    }

    @POST
    public Address create(Address address) {
        addressRepository.persist(address);
        return address;
    }
}
