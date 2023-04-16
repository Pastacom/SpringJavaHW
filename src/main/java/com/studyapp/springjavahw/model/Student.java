package com.studyapp.springjavahw.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(schema = "students_schema", name = "students")
public class Student {
    @Id
    @Column(name = "id")
    private Long studentId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name = "group_s")
    private String studentGroup;
}
