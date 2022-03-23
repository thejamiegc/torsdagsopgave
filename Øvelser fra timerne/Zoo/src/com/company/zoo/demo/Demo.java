package com.company.zoo.demo;

import com.company.zoo.implementation.animals.birds.GullImpl;
import com.company.zoo.implementation.animals.birds.PenguinImpl;
import com.company.zoo.implementation.animals.mammals.CatImpl;
import com.company.zoo.implementation.animals.mammals.DogImpl;
import com.company.zoo.model.animals.Animal;
import com.company.zoo.model.animals.Bird;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new GullImpl());
        animals.add(new DogImpl());
        animals.add(new PenguinImpl());
        animals.add(new CatImpl());
        for(Animal a : animals){
            System.out.println(a.feed());
            System.out.println(a.makeSound());
            if(a instanceof Bird){
                System.out.println(((Bird) a).cleanFeathers());
            }
        }

    }

}
