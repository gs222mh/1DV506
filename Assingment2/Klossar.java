package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Klossar {
    public static void main(String[] args) {
        Scanner lego = new Scanner(System.in);
        System.out.print("Bredd: ");
        int x = lego.nextInt();
        System.out.print("Höjd: ");
        int y = lego.nextInt();
        if (x < 0) {
            System.out.println("Bredden måste vara storre än noll (Bredd > 0)");
            return;
        }
        bulding(x, y);
        lego.close();
    }

    public static void bulding(int x, int y) {

        /*
        En 2D array, vi bestämmer själva x och y-värdet.
        Jag delar raderna till 3 delar. Första rad och sista rad och resten
         */
        String[][] table = new String[y + 2][x + 2];
        for (int i = 0; i < table.length; i++) {
            String[] row = table[i];
            String[] forst = table[0];
            String[] sista = table[table.length - 1];
            for (int j = 0; j < row.length; j++) {

                // taket
                row[0] = "\u2503";
                forst[0] = "\u250F";
                sista[0] = "\u2517";

                // kanten
                row[j] = "\u25CF";
                forst[j] = "\u2501";
                sista[j] = "\u2501";

                // golvet
                row[row.length - 1] = "\u2503";
                forst[row.length - 1] = "\u2513";
                sista[row.length - 1] = "\u251B";
            }
        }
        skrivaUt(table);
    }

    public static void skrivaUt(String[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(" " + table[i][j]);
            }
            System.out.println(" ");
        }
    }
}

