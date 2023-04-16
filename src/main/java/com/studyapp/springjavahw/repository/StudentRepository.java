package com.studyapp.springjavahw.repository;

import com.studyapp.springjavahw.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
