package Lectures.week1.training1.chapter_52;

import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args) {
        //Ordinal ,compareTo, values

        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal : " + monday.ordinal());
        System.out.println("ordinal : " + sunday.ordinal());
        System.out.println("ordinal : " + thursday.ordinal());

        System.out.println("compareTo : " + monday.compareTo(sunday));
        System.out.println("compareTo : " + monday.compareTo(thursday));

        Day[] days = Day.values();
        System.out.println("days : " + Arrays.toString(days));
    }
}
