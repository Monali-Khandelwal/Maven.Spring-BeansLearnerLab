package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People <Student>{


    public Students(List<Students> personList) {
        super(personList);
    }

    @Override
    public Iterator<Student> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return spliterator();
    }

//    @Override
//    public String toString() {
//        return "Students{" +
//                "personList=" + personList +
//                '}';
//    }
}
