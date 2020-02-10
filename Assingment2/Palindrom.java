package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner ord = new Scanner(System.in);
        while (true) {
            System.out.print("Skriv ett ord eller mening ");
            String word = ord.nextLine();
            if (word.equals("Stopp") || word.equals("stopp")) {
                break;
            } else {
                Palindrom(word);
            }
        }
        ord.close();
    }

    public static void Palindrom(String word) {
        String bytaTillSmall = word.toLowerCase();
        String taBortMellanSlag = bytaTillSmall.replaceAll(" ", "");
        int forstaBokstaven = 0;
        int sistaBokstaven = bytaTillSmall.length() - 1;
        boolean x = true;

        // Repetra medan förta bokstaven är mindre än sista. (kolla på de alla bokstäver)
        while (forstaBokstaven < sistaBokstaven) {
            if (bytaTillSmall.charAt(forstaBokstaven) != bytaTillSmall.charAt(sistaBokstaven)) {
                x = false;
                break;
            }
            forstaBokstaven++;
            sistaBokstaven--;
        }
        if (x) {
            System.out.println("Det var ett palindrom ");
        } else {
            System.out.println("Det var inte ett palindrom ");
        }
    }
}

