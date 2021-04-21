package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Instructors extends People<Instructor>{

    public Instructors(List<Students> personList) {
        super(personList);
    }

    public int numOfInstructors(){
        int counter =0;
        for(Instructor inst : super.findAll()){
            counter++;
        }
        return counter;
    }

    @Override
    public Iterator<Instructor> iterator() {
        return super.findAll().iterator();
    }

    @Override
    public void forEach(Consumer<? super Instructor> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Instructor> spliterator() {
        return super.spliterator();
    }

//    @Override
//    public String toString() {
//        return "Instructors{" +
//                "personList=" + personList +
//                '}';
//    }
}
