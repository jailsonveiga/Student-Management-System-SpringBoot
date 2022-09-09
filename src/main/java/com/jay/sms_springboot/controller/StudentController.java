package com.jay.sms_springboot.controller;

import com.jay.sms_springboot.model.Student;
import com.jay.sms_springboot.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
   private StudentRepository studentRepository;

    @PostMapping ("/register")
    public ResponseEntity<Student> registerStudent(@RequestBody Student newStudent){
        Student savedStudent = studentRepository.save(newStudent);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
}
