package com.modulo.tallerPracticoModulo.Controller;

import com.modulo.tallerPracticoModulo.Entidad.Alumnos;
import com.modulo.tallerPracticoModulo.Repository.AlumnosRepository;
import com.modulo.tallerPracticoModulo.Service.AlumnosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    AlumnosService alumnosService;

    @GetMapping
    public String ListarAlumnos(Model model) {
        model.addAttribute("alumnos", alumnosService.getAllAlumnos());
        return "alumnos/list";
    }

    @GetMapping("/new")
    public String newAlumno(Model model) {
        model.addAttribute("alumno", new Alumnos());
        return "alumnos/new";
    }

    @PostMapping("/save")
    public String saveAlumno(@ModelAttribute ("alumnos") Alumnos alumno) {
        alumnosService.saveAlumno(alumno);
        return "redirect:/alumnos";
    }

    @GetMapping("/update/{id}")
    public String updateAlumno(@PathVariable("id") Long id, @ModelAttribute ("alumnos") Alumnos alumno) {
        Alumnos existingAlumno = alumnosService.getAlumnoById(id);
        existingAlumno.setNombre(alumno.getNombre());
        existingAlumno.setApellido(alumno.getApellido());
        existingAlumno.setTelefono(alumno.getTelefono());
        existingAlumno.setDireccion(alumno.getDireccion());
        existingAlumno.setEmail(alumno.getEmail());
        alumnosService.saveAlumno(existingAlumno);
        return "redirect:/alumnos";
    }

    @GetMapping("/delete/{id}")
    public String deleteAlumno(@PathVariable("id") Long id) {
        alumnosService.deleteAlumnoById(id);
        return "redirect:/alumnos";
    }

}
