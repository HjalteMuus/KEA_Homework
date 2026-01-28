package com.example.jpastudent.config;

import com.example.jpastudent.model.Student;
import com.example.jpastudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
public class InitData implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student();
        s1.setName("Hjalte");
        s1.setBornDate(LocalDate.of(1997, 12, 8));
        s1.setBornTime(LocalTime.of(1, 30, 20));
        Student s2 = new Student();
        s2.setName("Aske");
        s2.setBornDate(LocalDate.of(1999, 6, 15));
        s2.setBornTime(LocalTime.of(12, 30, 20));

        studentRepository.save(s1);
        studentRepository.save(s1);
        studentRepository.save(s2);
    }
}
