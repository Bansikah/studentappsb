package org.bansikah.studentappbackend.controller;

import org.bansikah.studentappbackend.model.Student;
import org.bansikah.studentappbackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;


    //@CrossOrigin(origins = "*", allowedHeaders = "/*")
    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";
    }


    //@CrossOrigin(origins = "*", allowedHeaders = "/*")
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}
