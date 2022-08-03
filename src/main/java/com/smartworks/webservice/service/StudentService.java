package com.smartworks.webservice.service;

import com.smartworks.webservice.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
