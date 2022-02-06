package com.student.service;

import com.student.Data.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

List<Student> getAllStudents();

Optional<Student> getStudentById(int id);

void saveNewStudent(Student student);

Student updateStudentById(Student student);

void deleteStudentById(int id);
}
