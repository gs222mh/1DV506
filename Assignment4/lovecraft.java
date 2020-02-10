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

public class lovecraft {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\lovecraft.txt");

        try (Scanner text = new Scanner(new FileInputStream(file))) {
            int row = 0;
            int emptyRow = 0;
            int rowWithtext= 0;
            int rowWithNumber = 0;

            //while filen har ett ord till.
            while (text.hasNext()) {
                String str = text.nextLine();
                row++;
                if (str.isEmpty()) {
                   emptyRow++;
                }
                if (!str.isEmpty() && !text.hasNextInt()){
                    rowWithtext++;
                }
                if (!str.isEmpty() && text.hasNextInt()){
                    rowWithNumber++;
                }

            }
            text.close();

            System.out.println("Lovecraft statistics: ");
            System.out.println("Total lines: \t \t \t" + row);
            System.out.println("Empty lines: \t \t \t" + emptyRow);
            System.out.println("Lines with text: \t \t" + rowWithtext);
            System.out.println("Lines with page number: " + (rowWithNumber));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
