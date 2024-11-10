package com.microservice.course.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "courses")
public class Course {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Course() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Course(Long id, String name, String teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
    }

    private String name;
    private String teacher;
}
