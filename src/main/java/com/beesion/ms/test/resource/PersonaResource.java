package com.beesion.ms.test.resource;

import com.beesion.ms.test.dto.PersonDto;
import com.beesion.ms.test.mapper.PersonMapper;
import com.beesion.ms.test.service.IPersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonaResource {

	@Inject
	IPersonService personService;

	@POST
	public Response save(PersonDto dto) {
		personService.save(PersonMapper.toEntity(dto));
		return Response.ok("Elemento guardado").build();
	}
}
