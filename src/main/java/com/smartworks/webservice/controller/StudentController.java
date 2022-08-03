package com.smartworks.webservice.controller;


import com.smartworks.webservice.model.Student;
import com.smartworks.webservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin

public class StudentController {

   @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }


    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student is added";

    }





}
