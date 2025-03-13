package com.modulo.tallerPracticoModulo.Service;

import com.modulo.tallerPracticoModulo.Entidad.Alumnos;
import com.modulo.tallerPracticoModulo.Repository.AlumnosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnosService {

    @Autowired
    private AlumnosRepository alumnosRepository;

    public List<Alumnos> getAllAlumnos() {
        return alumnosRepository.findAll();
    }

    public void saveAlumno(Alumnos alumnos) {
        alumnosRepository.save(alumnos);
    }

    public Alumnos getAlumnoById(Long id) {
        return alumnosRepository.findById(id).orElse(null);
    }

    public void deleteAlumnoById(Long id) {
        alumnosRepository.deleteById(id);
    }

}
