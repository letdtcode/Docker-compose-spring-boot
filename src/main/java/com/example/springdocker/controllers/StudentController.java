package com.example.springdocker.controllers;

import com.example.springdocker.models.Student;
import com.example.springdocker.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World dcm ao vcl aduma ahaha";
    }

    @PostMapping("/insertStudent")
    public String insertStudent(@RequestParam String name,@RequestParam Integer birthYear) {
        try {
            Student student=new Student(name,birthYear);
            studentRepository.save(student);
            return "Insert successfully !";
        }catch (Exception e) {
            return "Insert student failed ! Error !"+e.toString();
        }
    }

    @GetMapping("/showAll")
    public Iterable<Student> showAllStudents() {
        return studentRepository.findAll();
    }
}
