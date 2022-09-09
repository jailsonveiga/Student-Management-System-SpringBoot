package com.jay.sms_springboot.repositories;

import com.jay.sms_springboot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository is a generic interface that takes two parameters
 * 1. Entity class
 * 2. Primary key type
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
