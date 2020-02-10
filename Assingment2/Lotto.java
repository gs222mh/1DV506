package GS222MH_LABB2;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random num = new Random();
        int[] lotto = new int[7];

        boolean hasDeplicate = true;

        // kollar om arrayen har samma värdet.
        for (int i = 0; i < lotto.length; i++) {
            int a = num.nextInt(35) + 1;
            for (int r = 0; r < lotto.length; r++) {
                if (a == lotto[r]) {
                    hasDeplicate = false;
                }
            }

            // om arrayen inte har detta värde, ligga det i arrayen.
            if (hasDeplicate == true) {
                lotto[i] = a;
            } else {
                hasDeplicate = true;
                i--;
            }
        }
        // sortera arrayen efter att fylla i.
        if (hasDeplicate) {
            Arrays.sort(lotto);
            for (int visa : lotto) {
                System.out.print(" " + visa + " ");

            }
        }

    }
}






