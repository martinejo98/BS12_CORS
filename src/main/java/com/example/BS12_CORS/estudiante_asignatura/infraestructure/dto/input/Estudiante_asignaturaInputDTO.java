package com.example.BS12_CORS.estudiante_asignatura.infraestructure.dto.input;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class Estudiante_asignaturaInputDTO {

    private List<String> student;
    private String asignatura;
    private String comment;
    private Date initial_date;
    private Date finish_date;

}
