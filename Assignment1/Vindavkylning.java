package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */


import java.util.Scanner;

public class Vindavkylning {
    public static void main(String[] args) {
        Scanner tempratur = new Scanner(System.in);
        System.out.println("What is the tempreture in Celsius?");
        double C = tempratur.nextDouble();

        Scanner vind = new Scanner(System.in);
        System.out.println("What is the Wind speed");
        double v = vind.nextDouble();

        //byta från m/s till km/h.
        double V = v*3.6;


        double Vpow = Math.pow(V, 0.16);
        double TWC = 13.12 + 0.6215*C - 11.37*Vpow + 0.3965*C*Vpow;

        // Jag skrev denna rad för att få bara ett decimal tal efter comma.
        String två_decimala_tal = String.format ("%.1f", TWC);

        System.out.println(två_decimala_tal);
        tempratur.close();
    }
}
