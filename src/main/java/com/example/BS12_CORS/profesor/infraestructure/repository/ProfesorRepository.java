package com.example.BS12_CORS.profesor.infraestructure.repository;

import com.example.BS12_CORS.profesor.domain.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, String> {
}
