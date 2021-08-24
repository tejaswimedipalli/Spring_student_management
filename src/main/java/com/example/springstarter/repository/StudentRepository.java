package com.example.springstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springstarter.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
