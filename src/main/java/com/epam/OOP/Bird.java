package com.epam.OOP;

public class Bird extends Animal{

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    String getDescription() {
        return super.getDescription()+". Moreover, it has 2 wings and can fly.";
    }
}
