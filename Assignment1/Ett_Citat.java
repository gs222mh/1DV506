package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Ett_Citat {
    public static void main(String[] args) {

        // Vi imoportera Scanner för att kunna skriva ett citat
        Scanner citat = new Scanner(System.in);
        System.out.println("Skriva din citat :");

        /* Om vi skriver (citat.next) kommer
        att visas bara det första ordet, därför skriver jag
        (citat.nextline)
         */
        String x = citat.nextLine();
        System.out.println("Din citat är : " + "\"" + x + "\"");
        citat.close();
    }
}
