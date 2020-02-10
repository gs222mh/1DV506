package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class SummanAvTre {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Give me a numbe of three numbers xxx: ");
        String x = number.next();

        /* Här får jag fram första siffran i nummer ett,
         två och tre. */
        char n1 = x.charAt(0);
        char n2 = x.charAt(1);
        char n3 = x.charAt(2);

        /* Eftersom siffror börjar från 48 enligt ascii-table (char).
        48 * 3 = 144 */
        System.out.println( (n1 + n2 + n3) - 144);
        number.close();

    }
}
