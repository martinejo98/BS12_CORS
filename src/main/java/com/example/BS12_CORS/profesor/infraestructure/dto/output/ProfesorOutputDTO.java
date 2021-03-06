package com.example.BS12_CORS.profesor.infraestructure.dto.output;

import com.example.BS12_CORS.profesor.domain.Profesor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProfesorOutputDTO {

    private String id_profesor;
    private String id_persona;
    private String coments;
    private String branch;

    public ProfesorOutputDTO(Profesor profesor){
        setId_profesor(profesor.getId_profesor());
        setId_persona(profesor.getPersona().getId_persona());
        setComents(profesor.getComents());
        setBranch(profesor.getBranch());
    }
}

