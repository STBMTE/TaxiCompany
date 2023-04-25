package org.example.service;

import org.example.repository.DriverRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public DriverService studentService(DriverRepository studentRepository) {
        return new DriverService(studentRepository);
    }
}