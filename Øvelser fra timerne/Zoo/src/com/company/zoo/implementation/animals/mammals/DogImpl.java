package com.company.zoo.implementation.animals.mammals;

import com.company.zoo.model.animals.mammals.Dog;

public class DogImpl implements Dog {
    @Override
    public String feed() {
        return "the dog eats a bone!";
    }

    @Override
    public String makeSound() {
        return "the dog says: Barck!";
    }
}
