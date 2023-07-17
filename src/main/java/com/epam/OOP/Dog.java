package com.epam.OOP;

public class Dog extends Animal{

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    String getDescription() {
        return super.getDescription();
    }
}
