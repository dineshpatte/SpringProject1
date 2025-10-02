package com.example.demo.student;
import com.example.demo.student.StudentRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner init(StudentRepository studentRepository) {
        return args -> {
            Student davis =   new Student(
                    "david",
                    "becks",
                    "becls@gmail.com",
                    18
            );

            Student david =   new Student(
                    "david12",
                    "becks22",
                    "beclsww@gmail.com",
                    18
            );

            studentRepository.saveAll(
                    List.of(davis, david)
            );
        };


    }
}
