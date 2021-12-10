package com.canvia.service;

import com.canvia.entity.AlumnoBean;
import com.canvia.jpa.model.TblAlumno;
import org.jvnet.hk2.annotations.Contract;

import java.util.List;

@Contract
public interface IAlumnoService {

	void registrar(AlumnoBean alumno) throws Exception;

	void actualizar(AlumnoBean alumno) throws Exception;

	void eliminar(String codAlumno);

	List<TblAlumno> obtenerAlumnos();

	TblAlumno obtenerAlumno(String dni);
}
