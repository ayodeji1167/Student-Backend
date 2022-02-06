package com.student.controller;

import com.student.Data.Student;
import com.student.service.StudentServicesImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentServicesImplementation studentServicesImplementation;


    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentServicesImplementation.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id){
        Optional<Student> studentOptional = studentServicesImplementation.getStudentById(id);
        if (studentOptional.isPresent()){
            return new ResponseEntity<>(studentOptional.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/students")
    public void addNewStudent(@RequestBody Student student){
        studentServicesImplementation.saveNewStudent(student);
    }

    @PutMapping("/students/{id}")
    public Student updateStudentById(@PathVariable int id, @RequestBody Student student){
        student.setId(id);
        return studentServicesImplementation.updateStudentById(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
        studentServicesImplementation.deleteStudentById(id);
    }

}
