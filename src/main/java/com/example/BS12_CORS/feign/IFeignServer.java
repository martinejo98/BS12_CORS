package com.example.BS12_CORS.feign;

import com.example.BS12_CORS.profesor.infraestructure.dto.output.ProfesorOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "simpleFeign", url="http://localhost:8081")
public interface IFeignServer{

    @GetMapping("/profesor/getProfesor/{id}")
    public ResponseEntity<ProfesorOutputDTO> getProfesorFeign(@PathVariable String id);
}
