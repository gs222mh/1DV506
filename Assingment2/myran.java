package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */


import java.util.Random;

public class myran {
    public static void main(String[] args) {
        double sum = 0;
        int repear = 0;
        while (repear != 10) {
            int num = 0;
            int move = 0;

            /*
            Skapa en array 8 rad och 8 kolumner.
            Fylla arrayen med 0.
             */
            int[][] table = new int[8][8];
            for (int i = 0; i < table.length; i++) {
                int[] row = table[i];
                for (int j = 0; j < row.length; j++) {
                    row[j] = 0;
                }
            }

            /*
            Skapa random för att lämna myran någonstans i arrayen.
            Myran har x och y-värdet.
             */
            Random position = new Random();
            int y = position.nextInt(8);
            int x = position.nextInt(8);
            table[x][y] = 1;

            /* While loop tills 63. Eftersom det finns 64 platser (8*8),
            och vi bestämde var myran ska finnas (64-1).
             */
            while (num != 63) {

                //Random med 4 alternativ. Exempelvis är 0 för att gå upp, 1 vänster osv..
                int rnd = position.nextInt(4);

                if (rnd == 0) {
                    /*
                    If-sats, tänk om myran ligger i kanten, då kan den inte röra sig utan för rutan.
                    så if den är inte i kanten kör ett steg till. Annars ett steg till andra håll.
                     */
                    if (x < 7) {
                        x = x + 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    } else {
                        x = x - 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    }
                }

                if (rnd == 1) {
                    if (x > 0) {
                        x = x - 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    } else {
                        x = x + 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    }
                }

                if (rnd == 2) {
                    if (y < 7) {
                        y = y + 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    } else {
                        y = y - 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    }
                }

                if (rnd == 3) {
                    if (y > 0) {
                        y = y - 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    } else {
                        y = y + 1;
                        if (table[x][y] == 1) {
                            num--;
                        }
                    }
                }
                table[x][y] = 1;
                move = move + 1;
                num++;
            }
            repear++;
            System.out.println("Antal steg i simulering " + repear + ": " + move);
            sum += move;
        }
        System.out.println("Antal steg i medel: " + (sum / 10));
    }
}
