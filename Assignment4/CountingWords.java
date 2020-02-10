package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\lovecraft.txt");

        try (Scanner text = new Scanner(new FileInputStream(file))) {
            int word = 0;

            while (text.hasNext()) {
                text.next();
                word++;

            }
            text.close();

              test(word);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void test(int word) {
        File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\lovecraft.txt");

        try (Scanner text = new Scanner(new FileInputStream(file))) {
            int num = 0;

            while (text.hasNext()) {
                String str = text.nextLine();
                if (!str.isEmpty() && text.hasNextInt()){
                    num++;
                }

            }
            text.close();

            System.out.println("Lovecraft statistics: ");
            System.out.println("Total words: \t \t \t" + (word - num));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
