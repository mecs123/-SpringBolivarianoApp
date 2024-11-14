package com.microservice.student.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
@Schema(description = "Student entity")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Unique identifier of the student", example = "1")
    private Long id;

    @Schema(description = "First name of the student", example = "John")
    private String name;

    @Column(name = "last_name")
    @Schema(description = "Last name of the student", example = "Doe")
    private String lastName;

    @Schema(description = "Email address of the student", example = "john.doe@example.com")
    private String email;

    @Column(name = "course_id")
    @Schema(description = "Course ID associated with the student", example = "101")
    private Long courseId;
}
