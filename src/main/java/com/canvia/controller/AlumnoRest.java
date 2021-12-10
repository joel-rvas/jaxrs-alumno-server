package com.canvia.controller;

import com.canvia.entity.AlumnoBean;
import com.canvia.jpa.model.TblAlumno;
import com.canvia.service.IAlumnoService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/alumno")
public class AlumnoRest {

    @Inject
    private IAlumnoService alumnoService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TblAlumno> obtenerAlumno() {
        return alumnoService.obtenerAlumnos();
    }

    @GET
    @Path("/{dni}")
    @Produces(MediaType.APPLICATION_JSON)
    public TblAlumno obtenerAlumno(@PathParam("dni") String dni) {
        return alumnoService.obtenerAlumno(dni);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void registrar(AlumnoBean alumno) throws Exception {
        alumnoService.registrar(alumno);
    }

    @PUT
    @Path("/{dni}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizar(@PathParam("dni") String dni, AlumnoBean alumno) throws Exception {
        alumno.setDni(dni);
        alumnoService.actualizar(alumno);
    }

    @DELETE
    @Path("/{dni}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void deleteAlumno(@PathParam("dni") String dni) {
        alumnoService.eliminar(dni);
    }

}