package com.project.project.Administration;

import com.project.project.Professor.Professor;
import com.project.project.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private Adminservice Adminservice;
    @PostMapping("creatstudent/")
    public Student creat_student(@RequestBody Student student){
        return Adminservice.creatstudent(student);


    }



    @PostMapping("creatprofessor/")
    public Professor creatprof(@RequestBody Professor professor){
      return Adminservice.creatprof(professor);
    }
}
