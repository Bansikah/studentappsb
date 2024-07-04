package org.bansikah.studentappbackend.service;

import org.bansikah.studentappbackend.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
