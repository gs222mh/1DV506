package GH222MH_LABB1;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Random;
import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner svar1 = new Scanner(System.in);
        Scanner svar2 = new Scanner(System.in);
        Random number = new Random();

        /*ligger alla variable upp, eftersom jag kommer att använda
            de under hela uppgift.
         */
        int x1 = number.nextInt(6) + 1;
        int x2 = number.nextInt(6) + 1;
        int x3 = number.nextInt(6) + 1;
        int x4 = number.nextInt(6) + 1;
        int res1 = (x1 + x2);
        int res2 = (x3 + x4);


        System.out.println("Vill du spela och slår en tärning? (J/N)");

        String s = svar1.next();
        //ställ en fråga, om frågan är true, gör så ....
        if (s.equals("J") || s.equals("j")) {

            System.out.println("Du slår tärningen och får " + x1);
            System.out.println("Vill du slå tärningen igen? (J/N)");
            String s1 = svar2.next();
            if (s1.equals("J") || s1.equals("j")) {
                System.out.println("Du slår tärningen och får " + x2);
                System.out.println("Summan av de två är " + res1);
            } else {
                System.out.println("Du kastar tärning en gång och får " + x1);
            }

            System.out.println("Dator slår tärning en gång och fick " + x3);
            if (x3 <= 4) {
                System.out.println("Dator kastar en gång till och fick  " + x4);
                System.out.println("Summan av de två är " + res2);
            }

            else {
                System.out.println("OBS!! Dator kastar tärning en gång Bara och fick" + x3);
            }

            if (res1 > res2 && res1 <= 9){
                System.out.println("Du vinn!!");
            }
            else if (res2 > res1 && res2 <= 9){
                System.out.println("Dator vinn!!");
            }
            else if (res1 > 9){
                System.out.println("Dator vinn!!");
            }
            else if (res2 > 9){
                System.out.println("Du vinn!!");
            }
            else if (res1 == res2){
                System.out.println("Finns inga segrare!!");
            }

            else {
                System.out.println("Dator vinn!!");

            }

        }

        else {
            System.out.println("om du vill spela kör progrmamet igen. ");
            svar1.close();
            svar2.close();

        }

    }
}
