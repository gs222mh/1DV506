package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class MarsMain {
    public static void main(String[] args) {

        //Skicka info från mainMethod till Planet-class. Sen retunerar de och skriver ut.
        Planet mars = new Planet("Mars", 4 ,2 , 1.666, 1.382);
        System.out.print(mars.getName() + ":");
        System.out.print("\n" + "\t" + "Position: " + "\t"  +  mars.getPositionFromSun());
        System.out.print("\n" + "\t" + "Moons: " + "\t" + "\t" + mars.getNoOfMoons());
        System.out.print("\n" + "\t" + "Aphelion: "+ "\t"  + mars.getAphelion());
        System.out.print("\n" + "\t" +  "Perihelion: " + mars.getPerihelion());


    }
}
