package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int sum = 0;
        while (number != 0) {
            int temp = number % 10;
            sum += temp;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
