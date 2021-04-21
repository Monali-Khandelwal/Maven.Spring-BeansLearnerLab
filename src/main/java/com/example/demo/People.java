package com.example.demo;

import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{
    List<PersonType> personList;

    public People(List<Students> personList){
        this.personList = personList;
    }

    public void add(PersonType p){
        personList.add(p);
    }

    public void remove (PersonType p){
        personList.remove(p);
    }

    public void size (){
        personList.size();
    }

    public void clear (){
        personList.clear();
    }

    public void addAll (Iterable <PersonType> personTypes){
        for(PersonType p : personTypes){
            personList.add(p);
        }
    }

    public PersonType findById(long id){
        for(PersonType p : personList){
            if(p.getId() == id){
                return p;
            }

        }
        return null;
    }

    public List <PersonType>findAll(){
        return personList;
    }
}
