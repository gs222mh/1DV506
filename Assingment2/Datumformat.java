package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Datumformat {
    public static void main(String[] args) {
        Scanner datum = new Scanner(System.in);
        Scanner form = new Scanner(System.in);
        System.out.print("Skriv ett år: ");
        int year = datum.nextInt();
        System.out.print("Skriv en månad: ");
        int month = datum.nextInt();
        System.out.print("Skriv en dag: ");
        int day = datum.nextInt();
        String a = "YYYY/MM/DD";
        String b = "DD/MM/YYYY";
        String c = "MM/DD/YYYY";
        System.out.println("Ange format (a, b, c)");
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        String format = form.nextLine();

        if (format.equals("a")) {
            yearManadDag(year, month, day);
        } else if (format.equals("b")) {
            dagManadYear(year, month, day);
        } else if (format.equals("c")) {
            manadDagYear(year, month, day);
        } else {
            System.out.println("Error. Finns inte denna form.");
        }
    }

    /*
    Här delar jag uppgiften till tre method. En method fungerar för en form.
     */
    public static void manadDagYear(int year, int month, int day) {
        if (month < 10 && day < 10) {
            System.out.println(String.format("%02d", month) + "/" + String.format("%02d", day) + "/" + year);
        } else if (month < 10) {
            System.out.println(String.format("%02d", month) + "/" + day + "/" + year);
        } else if (day < 10) {
            System.out.println(month + "/" + String.format("%02d", day) + "/" + year);
        } else {
            System.out.println(day + "/" + month + "/" + year);
        }
    }

    public static void dagManadYear(int year, int month, int day) {
        if (month < 10 && day < 10) {
            System.out.println(String.format("%02d", day) + "/" + String.format("%02d", month) + "/" + year);
        } else if (month < 10) {
            System.out.println(day + "/" + String.format("%02d", month) + "/" + year);
        } else if (day < 10) {
            System.out.println(String.format("%02d", day) + "/" + month + "/" + year);
        } else {
            System.out.println(day + "/" + month + "/" + year);
        }
    }

    public static void yearManadDag(int year, int month, int day) {
        if (month < 9 && day < 10) {
            System.out.println(year + "/" + String.format("%02d", month) + "/" + String.format("%02d", day));
        } else if (month < 10) {
            System.out.println(year + "/" + String.format("%02d", month) + "/" + day);
        } else if (day < 10) {
            System.out.println(year + "/" + month + "/" + String.format("%02d", day));
        } else {
            System.out.println(year + "/" + month + "/" + day);
        }
    }
}
