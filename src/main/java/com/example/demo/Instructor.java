package com.example.demo;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        //Learner [] arraylearner = new Learner[];
        for(Learner l : learners){
            double numberOfHoursPerLearner = numberOfHours / learners.length;
            l.learn(numberOfHoursPerLearner);
        }
    }
}
