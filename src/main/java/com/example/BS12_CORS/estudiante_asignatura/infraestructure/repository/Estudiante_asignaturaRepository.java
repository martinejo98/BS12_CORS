package com.example.BS12_CORS.estudiante_asignatura.infraestructure.repository;

import com.example.BS12_CORS.estudiante_asignatura.domain.Estudiante_asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Estudiante_asignaturaRepository extends JpaRepository<Estudiante_asignatura, String> {
}