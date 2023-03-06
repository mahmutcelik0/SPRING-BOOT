package com.mahmutcelik.demo3manytomany.repository;

import com.mahmutcelik.demo3manytomany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
