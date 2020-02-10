package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class SafeDateMain {
    public static void main(String[] args) {
        DateFormat date = new DateFormat();
        Scanner DATE = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Give me a year: ");
                int year = DATE.nextInt();
                date.setYear(year);
                if(year == 0){
                    System.out.println("Bye, bye!");
                    System.exit(0);
                }
                System.out.print("Give me a month: ");
                int month = DATE.nextInt();
                date.setMonth(month);
                System.out.print("Give me a day: ");
                int day = DATE.nextInt();
                date.setDay(day);
                System.out.println("The date is: " + date.getDate(true));
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }

    }
}
