package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration("StudentConfig")
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents(){
        Student monali = new Student(1, "Monali");
        Student lena = new Student (2,"Lena");
        Student mike = new Student(3,"Mike");
        Student justin = new Student(4,"Justin");
        Student kelly = new Student(5,"Kelly");
        Student hazel = new Student(6,"Hazel");
        Student theresa = new Student(7,"Theresa");
        Student abe = new Student(8,"Abe");
        Student ashley = new Student(9,"Ashley");
        Student xiong = new Student(10,"Xiong");
        Student chris = new Student(11,"Chris");
        Student ryan = new Student(12,"Ryan");
        Student greg = new Student(13,"Greg");
        return new Students(monali,lena,mike,justin,kelly,hazel,theresa,abe,ashley,xiong,chris,ryan,greg);
    }



}
