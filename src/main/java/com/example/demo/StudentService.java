package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        // Business Logic: Prevent duplicate email
        if(repository.findByEmail(student.getEmail()).isPresent()) {
            throw new RuntimeException("Email already registered!");
        }
        return repository.save(student);
    }
}