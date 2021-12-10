package com.canvia.service;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
import org.jvnet.hk2.annotations.Service;

import com.canvia.util.Util;

@Service
public class FileServiceImpl implements IFileService {
	
	
	String[] cabecera = { "codAlumno", "dni", "nombre", "telefono", "correo", "fecIngreso" };

	/*@Override
	public void registrar(Alumno alumno) throws Exception {
		Util util = new Util();

		String codAlumno = String.valueOf(alumno.getCodAlumno());
		String dni = alumno.getDni();
		String nombre = alumno.getNombre();
		String telefono = alumno.getTelefono();
		String correo = alumno.getCorreo();
		String fechIngreso = util.dateToString(alumno.getFecIngreso());

		String[] datos = { codAlumno, dni, nombre, telefono, correo, fechIngreso };
		util.registrarCsv("./alumno.csv", cabecera, datos);

	}

	@Override
	public void actualizar(int codAlumno, Alumno alumno) throws Exception {
		eliminar(codAlumno);
		registrar(alumno);
	}

	@Override
	public void eliminar(int codAlumno) {
		Util util = new Util();
		CSVParser alumnos = util.leerCsv("./alumno.csv");
		
		List<Map<String, String>> alumnosFilter = StreamSupport.stream(alumnos.spliterator(), true)
				.filter(c -> Integer.valueOf(c.get("codAlumno")) != codAlumno).map(csvRecord -> csvRecord.toMap()
						.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue())))
				.collect(Collectors.toList());

		File archivo = new File("./alumno.csv");
		archivo.delete();
		
		alumnosFilter.forEach(item -> {
			String[] datos = { item.get("codAlumno"), item.get("dni"), item.get("nombre"), item.get("telefono"),
					item.get("correo"), item.get("fecIngreso") };
			util.registrarCsv("./alumno.csv", cabecera, datos);
		});

	}

	@Override
	public Alumno obtenerAlumno(int codAlumno) {
		Util util = new Util();
		Alumno alumno = new Alumno();

		CSVParser alumnos = util.leerCsv("./alumno.csv");
		for (CSVRecord csvRecord : alumnos) {
			String codigo = csvRecord.get("codAlumno");
			if (Integer.valueOf(codigo) == codAlumno) {
				alumno.setCodAlumno(Integer.valueOf(codigo));
				alumno.setDni(csvRecord.get("dni"));
				alumno.setNombre(csvRecord.get("nombre"));
				alumno.setTelefono(csvRecord.get("telefono"));
				alumno.setCorreo(csvRecord.get("correo"));
				alumno.setFecIngreso(util.stringToDate(csvRecord.get("fecIngreso")));
			}

		}

		return alumno;
	}*/

}
