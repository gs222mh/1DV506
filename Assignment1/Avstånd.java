package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Avstånd {
    public static void main(String[] args) {

            // Både och x och y värdet har samma Scanner (number).
            Scanner number = new Scanner(System.in);
            System.out.print("x1: ");
            int x1 = number.nextInt();
            System.out.print("x2: ");
            int x2 = number.nextInt();

            System.out.print("y1: ");
            int y1 = number.nextInt();
            System.out.print("y2: ");
            int y2 = number.nextInt();

            double D = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));


            // Jag skrev denna rad för att få bara tre decimala tal efter comma.
            /*
            Jag kollade up i internet och hittade denna sökning som handlade om
            "java decimal String format" https://stackoverflow.com/questions/433958/java-decimal-string-format
             */
            String tre_decimala_tal = String.format ("%.3f", D);

            System.out.println(tre_decimala_tal);

            number.close();
        }
    }


