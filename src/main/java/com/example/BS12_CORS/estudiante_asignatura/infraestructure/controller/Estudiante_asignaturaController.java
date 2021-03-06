package com.example.BS12_CORS.estudiante_asignatura.infraestructure.controller;


import com.example.BS12_CORS.estudiante_asignatura.application.Estudiante_asignaturaService;
import com.example.BS12_CORS.estudiante_asignatura.infraestructure.dto.input.Estudiante_asignaturaInputDTO;
import com.example.BS12_CORS.estudiante_asignatura.infraestructure.dto.output.Estudiante_asignaturaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/asignatura")
public class Estudiante_asignaturaController {

    @Autowired
    Estudiante_asignaturaService estudiante_asignaturaService;

    @PostMapping("/addAsignatura")
    public Estudiante_asignaturaOutputDTO addAsignatura(@RequestBody @Valid Estudiante_asignaturaInputDTO estudiante_asignaturaInputDTO){
        return estudiante_asignaturaService.addAsignatura(estudiante_asignaturaInputDTO);
    }

    @GetMapping("/getEstudianteAsignatura/{id}")
    public List<Estudiante_asignaturaOutputDTO> getEstudianteAsignatura(@PathVariable String id){
        return estudiante_asignaturaService.getEstudianteAsignatura(id);
    }

    @PutMapping("/update/{id}")
    public void updateAsignatura(@RequestBody Estudiante_asignaturaInputDTO estudiante_asignaturaInputDTO, @PathVariable String id){
        estudiante_asignaturaService.updateAsignatura(id, estudiante_asignaturaInputDTO);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAsignatura(@PathVariable String id){
        estudiante_asignaturaService.deleteAsignatura(id);
        return "Estudiante eliminado";
    }
}