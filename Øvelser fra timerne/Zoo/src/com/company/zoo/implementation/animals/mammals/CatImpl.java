package com.company.zoo.implementation.animals.mammals;

import com.company.zoo.model.animals.mammals.Cat;

public class CatImpl implements Cat {
    @Override
    public String feed() {
        return "the cat eats a mouse";
    }

    @Override
    public String makeSound() {
        return "the cat say: meow!";
    }
}
