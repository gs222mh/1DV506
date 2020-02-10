package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        Random kasting = new Random();
        int ett = 0;
        int tva = 0;
        int tre = 0;
        int fyra = 0;
        int fem = 0;
        int sex = 0;
        int tarning = kasting.nextInt(6) + 1;
        int kasta = 0;
        while (kasta != 500) {
            tarning = kasting.nextInt(6) + 1;
            if (tarning == 1) {
                ett = ett + 1;
            } else if (tarning == 2) {
                tva = tva + 1;
            } else if (tarning == 3) {
                tre = tre + 1;
            } else if (tarning == 4) {
                fyra = fyra + 1;
            } else if (tarning == 5) {
                fem = fem + 1;
            } else if (tarning == 6) {
                sex = sex + 1;
            }
            kasta++;
        }
        System.out.print("Ettor " + "(" + ett + ") :");
        for (int i = 1; i <= ett; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Tvåor " + "(" + tva + ") :");
        for (int i = 1; i <= tva; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Treor " + "(" + tre + ") :");
        for (int i = 1; i <= tre; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Fyror " + "(" + fyra + ") :");
        for (int i = 1; i <= fyra; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Femor " + "(" + fem + ") :");
        for (int i = 1; i <= fem; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print("Sexor " + "(" + sex + ") :");
        for (int i = 1; i <= sex; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

