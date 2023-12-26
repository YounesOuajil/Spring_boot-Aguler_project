package com.project.project.Administration;

import com.project.project.Absence.Absence;
import com.project.project.Grade.Grade;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Administration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adminId;

    private String name;

    private String email;

    private String password;

    @OneToMany(mappedBy = "administration")
    private List<Absence> absences;

    @OneToMany(mappedBy = "administration")
    private List<Grade> grades;

    public Administration() {
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Absence> getAbsences() {
        return absences;
    }

    public void setAbsences(List<Absence> absences) {
        this.absences = absences;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
