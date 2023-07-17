package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {

        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println(monthNumber + " -> Winter");
            case 3, 4, 5 -> System.out.println(monthNumber + " -> Spring");
            case 6, 7, 8 -> System.out.println(monthNumber + " -> Summer");
            case 9, 10, 11 -> System.out.println(monthNumber + " -> Autumn");
            default -> System.out.println(monthNumber + " -> Wrong month number");
        }
    }

}
