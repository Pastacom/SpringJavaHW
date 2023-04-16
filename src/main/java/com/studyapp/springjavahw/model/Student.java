package com.studyapp.springjavahw.model;

import jakarta.persistence.*;

@Entity
@Table(schema = "students_schema", name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long studentId;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "attended")
    private Boolean attended;

    @Column(name = "grade")
    private Integer grade;

    @Column(name = "group_s")
    private String studentGroup;

    public Student(String firstname, String lastname, Boolean attended, String studentGroup) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.attended = attended;
        this.studentGroup = studentGroup;
    }

    public Student() {}

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Boolean getAttended() {
        return attended;
    }

    public void setAttended(Boolean attended) {
        this.attended = attended;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname + " " + studentGroup + " " + (attended?"+":"-") + " Оценка: " + grade;
    }
}
