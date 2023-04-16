package com.studyapp.springjavahw.service;

import com.studyapp.springjavahw.model.Student;
import com.studyapp.springjavahw.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    private static final Random rng = new Random();

    public Optional<Student> chooseStudent() {
        List<Student> students = studentRepository.findAll();
        List<Student> notAnswered = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == null) {
                notAnswered.add(student);
            }
        }
        if (notAnswered.size() != 0) {
            return Optional.of(notAnswered.get(rng.nextInt(0, notAnswered.size())));
        } else {
            return Optional.empty();
        }
    }

    public void SetGrade(String name, String surname, String group, Integer grade) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (Objects.equals(student.getFirstname(), name) && Objects.equals(student.getLastname(), surname) && Objects.equals(student.getStudentGroup(), group)) {
                student.setGrade(grade);
                studentRepository.save(student);
            }
        }
    }

    public void AddStudent(String name, String surname, Boolean attended, String group) {
        studentRepository.save(new Student(name, surname, attended, group));
    }

    public void DeleteStudent(String name, String surname, String group) {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            if (Objects.equals(student.getFirstname(), name) && Objects.equals(student.getLastname(), surname) && Objects.equals(student.getStudentGroup(), group)) {
                studentRepository.deleteById(student.getStudentId());
            }
        }
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
