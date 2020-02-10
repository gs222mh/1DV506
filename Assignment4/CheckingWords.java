package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckingWords {
    public static void main(String[] args) {
        //skapa tre arrayList för varje ord.
        ArrayList<String> numOfCthulhu = new ArrayList<String>();
        ArrayList<String> numOfAzathoth = new ArrayList<String>();
        ArrayList<String> numOfNecronomicon = new ArrayList<String>();


        File file = new File("C:\\Users\\GhaythSabeaallil\\Desktop\\lovecraft.txt");

        try (Scanner text = new Scanner(new FileInputStream(file))) {
            int repeting = 0;
            int mostCoomonWord = 0;
            int secondMostCommonWord = 0;

            //skapa en arrayList som innehåller alla ord som finns i txt fil. (alla ord med duplicates utan siffra)
            ArrayList<String> word = new ArrayList<String>();

            String mostWord = null;
            String secondMostWord = null;
            while (text.hasNextLine()) {
                String str = text.nextLine();

                //adda alla ord som finns i filen till en array.
                if (!str.isEmpty()) {
                    String[] arr = str.toLowerCase().split(" ");

                    for (String show : arr) {

                        //flytta alla elementer förutom Interger från array till en arrayList
                        if (Character.isLetter(show.charAt(0))) {
                            word.add(show);
                        }
                    }
                }
            }

            //Skapa en arrayList som har exakt samma element som finns i word arrayList, men utan duplicates.
            ArrayList<String> wordWithoutDub = (ArrayList<String>) word.stream().distinct().collect(Collectors.toList());
            for (int i = 0; i < wordWithoutDub.size(); i++) {
                repeting = 0;
                for (int j = 0; j < word.size(); j++) {
                    if (word.get(j).equals(wordWithoutDub.get(i))) {
                        repeting++;
                    }
                }
                if (repeting > mostCoomonWord) {  // 20 > 0
                    secondMostCommonWord = mostCoomonWord;  // secondMostCommonWord = 0
                    mostCoomonWord = repeting; //mostCoomonWord = 20
                    mostWord = wordWithoutDub.get(i);
                } else if (repeting > secondMostCommonWord) {
                    secondMostCommonWord = repeting;
                    secondMostWord = wordWithoutDub.get(i);

                }
            }

            //for loop för att räkna hur många ord är lika med cthulhu.
            for (int i = 0; i < word.size(); i++) {
                if (word.get(i).equals("cthulhu")) {
                    numOfCthulhu.add(word.get(i));
                }
            }
            for (int i = 0; i < word.size(); i++) {
                if (word.get(i).equals("azathoth")) {
                    numOfAzathoth.add(word.get(i));
                }
            }
            for (int i = 0; i < word.size(); i++) {
                if (word.get(i).equals("necronomicon")) {
                    numOfNecronomicon.add(word.get(i));
                }
            }

            text.close();
            System.out.println("Most common word: " + mostWord + " with " + mostCoomonWord + " occurrences.");
            System.out.println("Second most common word: " + secondMostWord + " with " + secondMostCommonWord + " occurrences.");
            System.out.println("Occurrences of \"Cthulhu\": " + numOfCthulhu.size());
            System.out.println("Occurrences of \"Azathoth\": " + numOfAzathoth.size());
            System.out.println("Occurrences of \"Necronomicon\": " + numOfNecronomicon.size());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
