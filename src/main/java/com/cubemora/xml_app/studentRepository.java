package com.cubemora.xml_app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cubemora.xml_app.entity.students;

public interface studentRepository extends JpaRepository<students, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
} 
    

