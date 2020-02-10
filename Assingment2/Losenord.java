package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Losenord {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        boolean ratt = false;
        while (!ratt) {
            System.out.println("Skriv ett lösenoed: ");
            String password = word.nextLine();
            ratt = lenght(password);
        }
    }
    // Kolla om ordet längre än 10.
    public static boolean lenght(String password) {
        if (password.length() >= 10) {
            return num(password);
        }
        return false;
    }

    // Kolla om ordet har siffror.
    public static boolean num(String password) {
        int num = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                num = num + 1;
            }
        }
        if (num >= 2) {
            return storabokstaver(password);
        }
        return false;
    }

    // Kolla om ordet har stora bokstäver.
    public static boolean storabokstaver(String password) {
        int bokstav = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                bokstav = bokstav + 1;
            }
        }
        if (bokstav >= 2) {
            return tecken(password);
        }
        return false;
    }

    // Kolla om ordet har specialtecken.
    public static boolean tecken(String password) {
        int tecken = 0;
        boolean check = true;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                check = false;
            } else {
                tecken = tecken + 1;
            }
        }
        // if allt stämer. Password in good
        if (tecken >= 2) {
            System.out.println("The password is good");
            return true;
        }
        // Annars fel
        return false;
    }
}
