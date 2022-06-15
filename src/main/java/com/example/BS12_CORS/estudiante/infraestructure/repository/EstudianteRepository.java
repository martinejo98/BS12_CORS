package com.example.BS12_CORS.estudiante.infraestructure.repository;

import com.example.BS12_CORS.estudiante.domain.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, String> {

}