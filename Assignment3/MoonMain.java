package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class MoonMain {
    public static void main(String[] args) {
        Moon moon = new Moon("Ganymede", 5262 );
        System.out.print("Largest moon in the solar system is " + moon.getName() + " which is " + moon.getDiameter() + " km in diameter.");
    }
}
