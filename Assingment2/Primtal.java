package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Primtal {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv en siffra: ");
            int primTal = num.nextInt();
            if (primTal < 0) {
                break;
            } else {
                primtal(primTal);
            }
        }
        num.close();
    }

    public static void primtal(int x) {
        int mod = 1;
        boolean svar = true;
        while (mod != 10) {
            int answer = x % mod;
            if (answer == 0) {
                svar = false;
                break;
            }
            mod++;
        }
        /*
        Här skriver jag de första 4 primtalen.
         */
        if (x == 2 || x == 3 || x == 5 || x == 7 || svar) {
            System.out.println("Det är ett primtal.");
        } else {
            System.out.println("Det är inte ett primtal.");
        }
    }
}
