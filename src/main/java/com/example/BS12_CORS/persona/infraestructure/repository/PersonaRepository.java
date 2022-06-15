package com.example.BS12_CORS.persona.infraestructure.repository;

import com.example.BS12_CORS.persona.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String> {
}
