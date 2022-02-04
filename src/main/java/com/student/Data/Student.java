package com.student.Data;


import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity

public class Student {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private int id;


    @Column(nullable = false, name = "first_name")
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(unique = true, nullable = false, name = "gmail")
    private String email;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "age", nullable = false)
    private int age;


}
