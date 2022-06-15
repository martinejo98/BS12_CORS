package com.example.BS12_CORS.feign;

import com.example.BS12_CORS.profesor.infraestructure.controller.ProfesorController;
import com.example.BS12_CORS.profesor.infraestructure.dto.output.ProfesorOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements IFeignServer{

    @Autowired
    ProfesorController profesorController;

    @Override
    public ResponseEntity<ProfesorOutputDTO> getProfesorFeign(String id) {
        return ResponseEntity.ok(profesorController.getProfesor(id));
    }
}
