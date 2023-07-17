package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int reverse = 0;
        while (number != 0) {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
