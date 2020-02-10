package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class tid {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Skriva ett antal sekunder så räknar jag ut hur många timar och minuter: ");
        int sekunder = number.nextInt();

        //Jag delar sekunderna med 3600 för att räkna ut hur många timmar är de.
        int hour = sekunder/3600;

        //För att få resten av (Sekunderna delar med 3600) använder jag mod.
        int hour1 = sekunder%3600;

        //För att räkna min delar jag resten med 60
        int min = hour1/60;

      /*Sist men inte minst räknar jag resten av resten,
        då tar jag resten mod 60 istället av 3600 för att
        räkna sekunderna.
       */
        int sek = hour1%60;

        System.out.println(hour + " Hour" + " \n" + min + " Min"+"\n" + sek + " Sek");
        number.close();
    }
}
