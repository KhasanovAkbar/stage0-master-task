package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {

        if (x == 0 || y == 0) System.out.println("Zero");
        else if (x > 0 && y > 0) System.out.println("First");
        else if (x < 0 && y > 0) System.out.println("Second");
        else if (x < 0) System.out.println("Third");
        else System.out.println("Four");
    }

}

