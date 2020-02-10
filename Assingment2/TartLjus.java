package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class TartLjus {
    public static void main(String[] args) {
        int ask = 24;
        int ar = 1;
        int kop;
        int sum = 0;
        System.out.println("Före födelseda " + ar + " Köp " + 1 + " ask(ar)");
        while (ar != 100) {
            int res = ask - ar;
            ask = res;
            kop = 1;

            //Jag plusar med 1 pga jag skriva ut det första året.
            if (ask <= ar) {
                System.out.print("Före födelseda " + (ar + 1));
            }
            while (ask <= ar) {
                kop = kop + 1;
                ask += 24;
            }
            sum += (kop - 1);

            //Jag minskar med 1 pga jag skriva ut det första året. Då köper man en ask.
            if (kop > 1) {
                System.out.print(" Köp " + (kop - 1) + " ask(ar)");
                System.out.println("");
            }
            ar++;
        }
        System.out.println("Totalt antal askar: " + (sum + 1) + ", återstående ljus: " + (ask - ar));
    }
}
