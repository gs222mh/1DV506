package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class programeringspråk {
    public static void main(String[] args) {
        Scanner language = new Scanner(System.in);
        System.out.println("ge mig ett språk (Skriv såma bokstäv) ");
        String x1 = language.next();
        String x2 = language.next();
        String x3 = language.next();

        int result1;
        int result2;
        int result3;
        int result4;
        int result5;
        int result6;


        //här använder jag compareTo för att få ett svar med siffra.
        result1 = x1.compareTo(x2);
        result2 = x1.compareTo(x3);
        result3 = x2.compareTo(x1);
        result4 = x2.compareTo(x3);
        result5 = x3.compareTo(x1);
        result6 = x3.compareTo(x2);

        /*
        Samma som uppgift tal, jag har 3 ord ska de sortera i 6 sätt.
         */
        if (result1 < 0 && result4 < 0){
            System.out.println("Ordning är: " + x1 + "\t" + x2 + "\t" + x3);
        }
        else if (result2 < 0 && result6 < 0 ){
            System.out.println("Ordning är: " + x1 + "\t" + x3 + "\t" + x2);
        }
        else if (result3 < 0 && result2 < 0 ){
            System.out.println("Ordning är: " + x2 + "\t" + x1 + "\t" + x3);
        }
        else if (result4 < 0 && result5 < 0 ){
            System.out.println("Ordning är: " + x2 + "\t" + x3 + "\t" + x1);
        }
        else if (result5 < 0 && result1 < 0 ){
            System.out.println("Ordning är: " + x3 + "\t" + x1 + "\t" + x2);
        }
        else if (result6 < 0 && result3 <0 ){
            System.out.println("Ordning är: " + x3 + "\t" + x2 + "\t" + x1);
        }
        language.close();
    }
}

