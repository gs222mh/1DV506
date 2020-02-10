package GS222MH_LABB2;
/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;

public class allaUdda {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];

        // Fylla arrayen med random.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100) + 1;
        }
        System.out.print("Hela arrayen: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("udda tal i arrayen: ");

        // if-sats kollar på varje plats i arrayen, om resten av talet delar med 2 är lika med 1. Skriva ut detta tal.
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 1) {
                System.out.print(arr[i] + " ");

            }
        }
    }
}



