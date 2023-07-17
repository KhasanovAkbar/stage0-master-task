package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength ; i++) {
            for (int j = cathetusLength; j > 0; j--) {
                if (i - j < 0)
                    System.out.print(" ");
                else System.out.print(j);
            }
            for (int j = 2; j <= cathetusLength ; j++) {
                if (i - j >= 0)
                    System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
