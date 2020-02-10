package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Ange en radie: ");
        float Radian = r.nextFloat();

        //Använda double för att få decimala tal.
        double A = (float)(Math.PI)*(Math.pow(Radian, 2));


        /* Jag skrev denna rad för att få bara ett decimal tal efter comma.
        Du kan byta siffran i (%.1f) för att få flera decimal tal.
         */

        String ett_decimal_tal = String.format ("%.1f", A);



        System.out.println(ett_decimal_tal);
        r.close();
    }

}
