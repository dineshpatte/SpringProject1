package com.example.demo.student;
import com.example.demo.student.StudentRepository;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @GetMapping
        public List<Student> getStudents(){

                 return    studentRepository.findAll();



        };

    @PostMapping
        public void registerStudent(@RequestBody Student student){
        studentRepository.save(student);
    }
}
