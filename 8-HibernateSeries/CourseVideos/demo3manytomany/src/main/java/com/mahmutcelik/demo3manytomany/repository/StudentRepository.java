package com.mahmutcelik.demo3manytomany.repository;

import com.mahmutcelik.demo3manytomany.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
//    @Query("select u from Student u JOIN Course c")
//    List<Student> getStudents();
}
