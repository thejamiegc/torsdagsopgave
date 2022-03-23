package com.company.zoo.implementation.animals.birds;

import com.company.zoo.model.animals.birds.Penguin;

public class PenguinImpl implements Penguin {
    @Override
    public String feed() {
        return "The punguin eats a herring!";
    }

    @Override
    public String makeSound() {
        return "The penguin remains silent!";
    }

    @Override
    public String cleanFeathers() {
        return "the Penguin cleans its feathers by taking a swim";
    }
}
