package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class FarligtArbete {
    public static void main(String[] args) {
        Scanner salary = new Scanner(System.in);
        System.out.print("Hur mycket vill du tjäna? ");
        double lon = salary.nextDouble();
        double ore = 0.01;
        int dager = 0;

        /*
        while loop ska stoppa om öre är lika med lön, eller den kan vara store än lön.
         */
        while (ore <= lon) {
            ore = ore * 2;
            dager++;
        }
        if (dager > 0 && dager <= 30) {
            System.out.println("Du har pengarna om " + dager + " dagar.");
        } else {
            // Uppgiften säger att man kan inte överleva att arbeta mer än 30 dager
            System.out.println("Du arbetar mer än 30 dager.");
        }
        salary.close();
    }
}

