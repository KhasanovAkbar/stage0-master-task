package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            int daysInMonth;
            if (month == 2 && isLeapYear(year)) {
                daysInMonth = 29;
            } else {
                daysInMonth = getDaysInMonth(month);
            }

            System.out.println(daysInMonth);
        }

    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    private static int getDaysInMonth(int month) {
        int[] daysPerMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysPerMonth[month - 1];
    }
}

