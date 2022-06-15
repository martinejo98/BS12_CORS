package com.example.BS12_CORS.estudiante_asignatura.infraestructure.dto.output;

import com.example.BS12_CORS.estudiante.domain.Estudiante;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class Estudiante_asignaturaOutputDTO {

    private String id_study;
    private List<String> id_student;
    private String asignatura;
    private String comment;
    private Date initial_date;
    private Date finish_date;

    public void returnIdEstudiante(List <Estudiante> lista){
        this.id_student=lista.stream().map(Estudiante::getId_student).collect(Collectors.toList());
    }
}
