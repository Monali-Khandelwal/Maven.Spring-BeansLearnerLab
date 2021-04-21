package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Classroom {
    Students students;
    Instructors instructors;

    @Autowired
    public Classroom(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture (Teacher teacher, double numberOfHours){
        for(Student s : students){
            teacher.teach(s,numberOfHours/students.size());
        }
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
