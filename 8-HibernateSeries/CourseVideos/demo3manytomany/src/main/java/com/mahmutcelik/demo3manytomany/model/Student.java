package com.mahmutcelik.demo3manytomany.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "STUDENT")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "course_id")
    private Long courseId;
    @ManyToMany
    @JsonIgnore
    @JoinTable(
            name = "COURSE_LIKE",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

//    @ManyToOne
//    @JsonIgnore
//    @JoinColumn(insertable = false,updatable = false,name = "course_id")
//    private Course course;
}
