package com.example.BS12_CORS.persona.infraestructure.dto.output;

import com.example.BS12_CORS.persona.domain.Persona;
import com.example.BS12_CORS.profesor.infraestructure.dto.output.ProfesorOutputDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonaOutputDTOProfesor extends PersonaOutputDTO{

    private ProfesorOutputDTO profesor;

    public PersonaOutputDTOProfesor (Persona persona){
        super(persona);
        setId_persona(persona.getId_persona());
    }
}
