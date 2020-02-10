package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class EnkelTriangel {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Skriv ett positivt tal: ");
        int num = number.nextInt();
        int space = 1;

        if (num <= 0) {
            System.out.println("Du måste skriva ett positivt tal. (store än noll)");
        } else {
            // While loop ska repetera tills n1 ska lika med 0.
            while (num != 0) {

            /*skriva ut stjärna, första rad ska lika med tal
            sen börjar minska med ett tills ska lika med 1.
             */
                for (int i = num; i >= 1; i--) {
                    System.out.print("*");
                }
                System.out.println("");

            /*
            skriva ut space, första rad ska lika med n2 som är lika med 1.
            sen börjar öka med ett tills while loos ska stopp.
             */
                for (int i = space; i >= 1; i--) {
                    System.out.print(" ");
                }
                space++;
                num--;
            }
        }
        number.close();
    }
}

