package com.studyapp.springjavahw.controller;

import com.studyapp.springjavahw.model.Student;
import com.studyapp.springjavahw.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/class")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping(path="/getAll")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping(path="/chooseStudent")
    public Optional<Student> getUser() {
        return studentService.chooseStudent();
    }

    @PostMapping(path="/addStudent")
    public void addStudent(@RequestParam String name, @RequestParam String surname,
                           @RequestParam String group, @RequestParam Boolean attended)
    {studentService.AddStudent(name, surname, attended, group);}

    @PutMapping(path="/setGrade")
    public void setGrade(@RequestParam String name, @RequestParam String surname,
                         @RequestParam String group, @RequestParam Integer grade)
    {studentService.SetGrade(name, surname, group, grade);}

    @DeleteMapping(path = "/deleteStudent")
    public void deleteStudent(@RequestParam String name, @RequestParam String surname,
                              @RequestParam String group)
    {studentService.DeleteStudent(name, surname, group);}
}
