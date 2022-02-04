package com.student.service;

import com.student.Data.Student;
import com.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.getById(id);
    }

    public void saveNewStudent(Student student) {
        studentRepository.save(student);

    }

    public Student updateStudentById(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudentById(int id) {

    }
}
