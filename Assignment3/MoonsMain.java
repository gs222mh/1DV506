package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class MoonsMain {
    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 4 ,2 , 1.666, 1.382);
        Moon moon = new Moon("Phobos", 0);
        Moon moon1 = new Moon("Deimos", 0);
        Moon moon2 = new Moon("test", 0);

        //Adda 3 moons till en arrayList i Planet-class.
        mars.addMoon(moon);
        mars.addMoon(moon1);
        mars.addMoon(moon2);

        System.out.print("Moon of " + mars.getName() + ":");
        Moon[] moons = mars.getMoons();
        System.out.println("");

        //Skriva moons ut med hjälp av for loop.
            for (Moon show : moons){
                System.out.println("\t" + show.getName());
            }

    }
}

