package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ObscureLovecraftMain {
    public static void main(String[] args) {
        Scanner options = new Scanner(System.in);
        while (true) {
            System.out.println("Obscure \n=======\n1. Make obscure\n2. Make readable\n3. Print obscure\n4. Print readable\n0. Exit");
            System.out.print("==>");
            String input = options.nextLine();

            //ta första raden. sen varje ord på den första raden, sen varje bokstav plus 3.
            if (input.equals("1")) {
                try {
                    File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\lovecraft.txt");
                    Scanner text = new Scanner(file);
                    while (text.hasNextLine()) {
                        File outFile = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\Obscure.txt");
                        PrintWriter printer = new PrintWriter(outFile);
                        while (text.hasNextLine()) {
                            String row = text.nextLine();
                            int length = row.length();
                            for (int i = 0; i < length; i++) {
                                char str = row.charAt(i);
                                char newChar = (char) (str + 3);
                                printer.print(newChar);
                            }
                            printer.print("\n");
                        }
                        printer.close();
                    }
                    System.out.println("Done!");
                    text.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }


                //gör motsatsen bara minus 3
            } else if (input.equals("2")) {
                try {
                    File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\Obscure.txt");
                    Scanner text = new Scanner(file);
                    while (text.hasNextLine()) {
                        File outFile = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\readableLovecraft.txt");
                        PrintWriter printer = new PrintWriter(outFile);
                        while (text.hasNextLine()) {
                            String row = text.nextLine();
                            int length = row.length();
                            for (int i = 0; i < length; i++) {
                                char str = row.charAt(i);
                                char newChar = (char) (str - 3);
                                printer.print(newChar);
                            }
                            printer.print("\n");
                        }
                        printer.close();
                    }
                    System.out.println("Done!");
                    text.close();
                } catch (FileNotFoundException e) {
                    System.out.println("You have to make a obscure file first.");
                    e.getMessage();
                }
            } else if (input.equals("3")) {
                try {
                    File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\Obscure.txt");
                    Scanner text = new Scanner(file);
                    while (text.hasNextLine()) {
                        String str = text.nextLine();
                        System.out.println(str);
                    }
                    text.close();
                } catch (FileNotFoundException e) {
                    System.out.println("You have to make a obscure file first.");
                    e.getMessage();
                }
            } else if (input.equals("4")) {
                try {
                    File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\readableLovecraft.txt");
                    Scanner text = new Scanner(file);
                    while (text.hasNextLine()) {
                        String str = text.nextLine();
                        System.out.println(str);
                    }
                    text.close();

                } catch (FileNotFoundException e) {
                    System.out.println("You have to make a readable file first.");
                    e.getMessage();
                }
            } else if (input.equals("0")) {
                System.out.println("Bye, bye!");
                options.close();
                System.exit(0);
            } else {
                System.out.println("That is not an option.\n");
            }
        }
    }
}
