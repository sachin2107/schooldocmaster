package com.school.docmaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.school.docmaster.model.Student;

@Repository
public interface UserRepository extends JpaRepository<Student, Integer>{

}
