package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class tal {
    public static void main(String[] args) {
        Scanner numers = new Scanner(System.in);
        System.out.println("Ge me tre tal");
        int x1 = numers.nextInt();
        int x2 = numers.nextInt();
        int x3 = numers.nextInt();

        /*
        Eftersom jag ska sortera 3 tal,
        Enligt "kombinatoriks" finns 6 sätt att sortera.
         */
        if (x1 <= x2 && x2 <= x3){
            System.out.println("Ordning är: " + x1 + "\t" + x2 + "\t" + x3);
        }
        else if (x1 <= x3 && x3 <= x2){
            System.out.println("Ordning är: " + x1 + "\t" + x3 + "\t" + x2);
        }
        else if (x2 <= x1 && x1 <= x3){
            System.out.println("Ordning är: " + x2 + "\t" + x1 + "\t" + x3);
        }
        else if (x2 <= x3 && x3 <= x1){
            System.out.println("Ordning är: " + x2 + "\t" + x3 + "\t" + x1);
        }
         else if (x3 <= x2 && x2 <= x1){
            System.out.println("Ordning är: " + x3 + "\t" + x2 + "\t" + x1);
        }
        else if (x3 <= x1 && x1 <= x2){
            System.out.println("Ordning är: " + x3 + "\t" + x1 + "\t" + x2);
        }
numers.close();
    }

}
