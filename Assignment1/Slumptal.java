package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;

public class Slumptal {
    public static void main(String[] args) {

        //import random.
        Random number = new Random();

        //5 variabler som har vätdet från 0 till 100
        int R = number.nextInt(100);
        int R1 = number.nextInt(100);
        int R2 = number.nextInt(100);
        int R3 = number.nextInt(100);
        int R4 = number.nextInt(100);

        System.out.println(R);
        System.out.println(R1);
        System.out.println(R2);
        System.out.println(R3);
        System.out.println(R4);

        int result = R+R1+R2+R3+R4;
        System.out.println("Summan är: " + result);

    }
}
