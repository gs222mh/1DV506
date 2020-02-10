package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class växel {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Betalning: ");
        int money = number.nextInt();
        Scanner prise = new Scanner(System.in);
        System.out.print("Pris: ");
        double kostar = prise.nextDouble();

        //byta double till int.
        // 10000 - 2340 = 7660
        int resten1 = (int) (money - kostar + 0.5);

        // 7660 / 1000 = 7
        int tusen = resten1/1000;

        // 7660 % 1000 = 660
        int restenaftertusen = resten1%1000;

        // 660 / 500 = 1
        int femhundra = restenaftertusen/500;

        // 660 % 500 = 160
        int restenavfemhundra = restenaftertusen%500;

        // 160 / 200 = 0
        int tvåhundra = restenavfemhundra/200;

        // 160 % 100 = 60
        int restenavtvåhundra = restenavfemhundra%100;

        // 160 / 100 = 1
        int hundra = restenavfemhundra/100;

        // 60 / 50 = 1
        int femtio = restenavtvåhundra/50;

        // 60 % 50 = 10
        int restenavhundra = restenavtvåhundra%50;

        // 10 / 10 = 1
        int tjugo = restenavhundra/20;

        int restenavfemtio = restenavhundra%20;

        int tio = restenavfemtio / 10;

        int restenavtio = restenavfemtio%10;

        int fem = restenavtio / 5;

        int restenavtvå = restenavtio%5;

        int två = restenavtvå/2;

        int restenavett = restenavtvå%2;

        int ett = restenavett/1;



        System.out.println("Växel:" + resten1);
        System.out.println("1000 kr-sedlar: " + tusen);
        System.out.println("500 kr-sedlar: " + femhundra);
        System.out.println("200 kr-sedlar: " + tvåhundra);
        System.out.println("100 kr-sedlar: " + hundra);
        System.out.println("50 kr-sedlar: " + femtio);
        System.out.println("20 kr-sedlar: " + tjugo);
        System.out.println("10 kr-sedlar: " + tio);
        System.out.println("5 kr-sedlar: " + fem);
        System.out.println("2 kr-sedlar: " + två);
        System.out.println("1 kr-sedlar: " + ett);


        prise.close();
        number.close();
    }
}
