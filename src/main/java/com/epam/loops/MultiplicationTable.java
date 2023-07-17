package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        System.out.println("Enter positive number");
        if (numberTableToPrint > 0) {

            for (int i = 0; i < 10; i++) {
                System.out.println(numberTableToPrint + " x " + (i + 1) + " = " + (i + 1) * numberTableToPrint);
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
