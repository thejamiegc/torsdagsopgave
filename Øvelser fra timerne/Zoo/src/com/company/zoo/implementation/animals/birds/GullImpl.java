package com.company.zoo.implementation.animals.birds;

import com.company.zoo.model.animals.birds.Gull;

public class GullImpl implements Gull {

    @Override
    public String feed() {
        return "The gull eats french fries with pleasue!";
    }

    @Override
    public String makeSound() {
        return "The gull says: Caw!";
    }

    @Override
    public String cleanFeathers() {
        return "the Gull sits and cleans its feathers";
    }
}
