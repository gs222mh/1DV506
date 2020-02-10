package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class DoctorWho {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Vilket år?");
        int x = year.nextInt();

        // if året mellan 1963 och 1989
        if (x >= 1963 && x <=1989){
            System.out.println("Det var originalserien.");
        }

        // if året mellan 1990 och 2020
        else if (x >=1990 && x <= 2020){

            System.out.println("Det var/är moderna serien.");
        }

        else if (x >=2021){

            System.out.println("Det vet vi inte, men vi kan hoppas!");
        }
        else {
            System.out.println("Du måste vilkje ett år från 1963.");
        }
        year.close();
    }
}
