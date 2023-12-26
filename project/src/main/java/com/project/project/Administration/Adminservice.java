package com.project.project.Administration;
import com.project.project.Professor.Professor;
import com.project.project.student.Studentrepository;
import com.project.project.student.Student;
import com.project.project.Professor.Professorrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Adminservice {
    @Autowired
    private Studentrepository Studentrepository ;
    @Autowired
    private Professorrepository professorRepository;

    public Student creatstudent(Student student) {
        Student newstudent = new Student();
        newstudent.setName(student.getName());
        newstudent.setEmail(student.getEmail());
        newstudent.setPassword(student.getPassword());

        return Studentrepository.save(newstudent);


    }

    public Professor creatprof(Professor professor) {
        Professor newProfessor = new Professor();
        newProfessor.setName(professor.getName());
        newProfessor.setEmail(professor.getEmail());
        newProfessor.setPassword(professor.getPassword());

        return professorRepository.save(newProfessor);
    }
}
