package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    // Home Page: Display Form and Table
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", service.getAllStudents());
        model.addAttribute("student", new Student());
        return "index";
    }

    // POST /api/students: Handle form submission
    @PostMapping("/api/students")
    public String registerStudent(@ModelAttribute("student") Student student) {
        try {
            service.saveStudent(student);
        } catch (Exception e) {
            return "redirect:/?error=EmailExists";
        }
        return "redirect:/";
    }
}