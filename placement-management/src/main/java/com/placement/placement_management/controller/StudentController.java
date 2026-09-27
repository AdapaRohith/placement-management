package com.placement.placement_management.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.placement_management.entity.Student;
import com.placement.placement_management.service.IStudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class StudentController {

    private final IStudentService studentService;

    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping("/students")
    public Student searchStudentById(@RequestParam long id) {
        return studentService.searchStudentById(id);
    }
    @GetMapping("/students/hall-ticket")
    public Student searchStudentByHallTicket(@RequestParam long ticketNo) {
        return studentService.searchStudentByHallTicket(ticketNo);
    }
    @DeleteMapping("/students")
    public boolean deleteStudent(@RequestParam long id) {
        return studentService.deleteStudent(id);
    }
    
}