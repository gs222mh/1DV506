package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner F = new Scanner(System.in);
        System.out.println("What is the tempreture in Fahrenheit?");
        double f = F.nextDouble();
        // Från den filen som ligger i Lapp1.pdf, räknar jag ut c.
        double c = ((f-32)*5)/9;
        System.out.println(c);
        F.close();
    }
}
