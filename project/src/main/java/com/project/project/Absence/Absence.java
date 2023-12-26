package com.project.project.Absence;

import com.project.project.Administration.Administration;
import com.project.project.Professor.Professor;
import com.project.project.student.Student;
import jakarta.persistence.*;

@Entity
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long absenceId;

    private String date;

    private boolean justification;

    private String image;

    private String session;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Professor professor;

    @ManyToOne
    @JoinColumn(name = "administration_id")
    private Administration administration;

    // Getters and setters
}
