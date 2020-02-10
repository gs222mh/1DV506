package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Diamanter {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        // använda boolean för att repetera koden medan boolean är true.
        boolean repeat = true;
        while (repeat) {
            System.out.print("Skriv ett positivt tal: ");
            int rad = number.nextInt();

            if (rad > 0) {
                repeat = true;
            } else {
                repeat = false;
            }

        /*
        [(rad * 2) - 1)] är för att räkna udda tal. Exempelvis är rad =3. >> (3 * 2) - 1 = 5.
        I tredje rad finns 5 stjärna.
         */
            for (int i = 1; i <= ((rad * 2) - 1); i = i + 2) {
                for (int k = 0; k < ((rad - 1) - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

            //göra bara motsatsen
            for (int i = ((rad * 2) - 3); i >= 1; i = i - 2) {
                for (int k = 0; k < ((rad - 1) - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        number.close();
    }
}


