package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class NastStorsta {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num;
        System.out.print("Skriv 10 heltal: ");

        //MIN_VALUE användas för att kunna hantera de negativa talen.
        int large = Integer.MIN_VALUE;
        int nastaStorsta = 0;
        for (int i = 0; i <= 9; i++) {
            num = number.nextInt();
            if (num > large) {
                nastaStorsta = large;
                large = num;
            } else if (num > nastaStorsta) {
                nastaStorsta = num;
            }
        }
        System.out.println("Nästa största: " + nastaStorsta);
        number.close();
    }
}
