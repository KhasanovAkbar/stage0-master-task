package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        if (numberTableToPrint >= 0) {

            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + " x " + numberTableToPrint + " = " + (i + 1) * numberTableToPrint);
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
