package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class RaknaNummer {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Skriv en siffra: ");
        int tal = number.nextInt();

        //summan är lika med den gamla tal.
        int sum = tal;

        //while loop ska stoppa om tal är lika med 0.
        while (tal != 0) {
            System.out.print("Skriv en siffra: ");
            tal = number.nextInt();
            sum = sum + tal;
        }
        System.out.println("Summan är: " + sum);
        number.close();
    }
}

