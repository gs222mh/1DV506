package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class VarannanSiffra {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Första siffran: ");
        int startVarde = number.nextInt();
        System.out.print("Andra siffran: ");
        int slutVarde = number.nextInt();
        number.close();

        /*
        Sätt i lika med den första tal (start tal). Sätt i mindre eller lika med
        den andra tal (slut tal). Kör i = i + 2 (VarannanSiffra).
         */
        for (int i = startVarde; i < slutVarde; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}

