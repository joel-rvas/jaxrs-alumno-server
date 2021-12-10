package com.canvia.service;

import com.canvia.entity.AlumnoBean;
import com.canvia.jpa.Repository.EntityManagerInitializer;
import com.canvia.jpa.model.TblAlumno;
import jakarta.inject.Inject;
import jakarta.persistence.TypedQuery;
import org.jvnet.hk2.annotations.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AlumnoServiceImpl implements IAlumnoService {

    private static final Logger logger = Logger.getLogger(AlumnoServiceImpl.class.getName());

    @Inject
    protected EntityManagerInitializer em;

    @Override
    public void registrar(AlumnoBean alumno) throws Exception {
        logger.info("call registrar");
        em.getEntityManager().getTransaction().begin();
        TblAlumno tblAlumno = new TblAlumno();
        tblAlumno.setDni(alumno.getDni());
        tblAlumno.setNombre(alumno.getNombre());
        tblAlumno.setApellido(alumno.getApellido());
        tblAlumno.setCelular(alumno.getCelular());
        tblAlumno.setIndEstado(alumno.getIndEstado());
        em.getEntityManager().persist(tblAlumno);
        em.getEntityManager().getTransaction().commit();
    }

    @Override
    public void actualizar(AlumnoBean alumno) throws Exception {
        logger.info("call actualizar");
        em.getEntityManager().getTransaction().begin();
        TblAlumno tblAlumno = new TblAlumno();
        tblAlumno.setDni(alumno.getDni());
        tblAlumno.setNombre(alumno.getNombre());
        tblAlumno.setApellido(alumno.getApellido());
        tblAlumno.setCelular(alumno.getCelular());
        tblAlumno.setIndEstado(alumno.getIndEstado());
        em.getEntityManager().merge(tblAlumno);
        em.getEntityManager().getTransaction().commit();
    }

    @Override
    public void eliminar(String dni) {
        logger.info("call eliminar");
        em.getEntityManager().getTransaction().begin();
        TblAlumno alumno = em.getEntityManager().find(TblAlumno.class, dni);
        em.getEntityManager().remove(alumno);
        em.getEntityManager().getTransaction().commit();
    }

    @Override
    public List<TblAlumno> obtenerAlumnos() {
        logger.info("call obtenerAlumnos");
        TypedQuery<TblAlumno> query = em.getEntityManager().createQuery("select t from TblAlumno t", TblAlumno.class);
        return query.getResultList();
    }

    @Override
    public TblAlumno obtenerAlumno(String dni) {
        logger.info("call obtenerAlumno");
        return em.getEntityManager().find(TblAlumno.class, dni);
    }

}
