package org.example.service;

import org.example.model.Driver;
import org.example.repository.DriverRepository;

public class DriverService {
    private static final Driver EMPTY_DRIVER = new Driver();

    private final DriverRepository studentRepository;

    public DriverService(DriverRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Driver find(String id) {
        return studentRepository.findById(id)
                .orElse(EMPTY_DRIVER);
    }

    public Iterable<Driver> findAll() {
        return studentRepository.findAll();
    }

    public Driver save(Driver student) {
        return studentRepository.save(student);
    }

    public void delete(String id) {
        studentRepository.deleteById(id);
    }
}
