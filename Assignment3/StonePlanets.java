package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class StonePlanets {
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 1, 0, 0.47, 0.31);
        Planet venus = new Planet("Venus", 2, 0, 0.72, 0.72);
        Planet earth = new Planet("Earth", 3, 1, 1.0, 0.99);
        Planet mars = new Planet("Mars", 4, 2, 1.666, 1.382);

        Moon moonEarth = new Moon("The moon", 3474);
        Moon moonMars = new Moon("Phobos ", 0);
        Moon moon1Mars = new Moon("Deimos ", 0);


        mercury.addToArray(mercury);
        venus.addToArray(venus);
        earth.addToArray(earth);
        mars.addToArray(mars);

        earth.addMoon(moonEarth);
        mars.addMoon(moonMars);
        mars.addMoon(moon1Mars);


        for (Planet fourPlanet : mercury.show()) {
            System.out.println("Planet " + fourPlanet.getName() + " has aphelion " + fourPlanet.getAphelion() +
                    " AU, perihelion " + fourPlanet.getPerihelion() + "  AU and " + fourPlanet.getNoOfMoons() + " moons.");
        }

        for (Planet fourPlanet : venus.show()) {
            System.out.println("Planet " + fourPlanet.getName() + " has aphelion " + fourPlanet.getAphelion() +
                    " AU, perihelion " + fourPlanet.getPerihelion() + "  AU and " + fourPlanet.getNoOfMoons() + " moons.");
        }
        for (Planet fourPlanet : earth.show()) {
            System.out.println("Planet " + fourPlanet.getName() + " has aphelion " + fourPlanet.getAphelion() +
                    " AU, perihelion " + fourPlanet.getPerihelion() + "  AU and " + fourPlanet.getNoOfMoons() + " moons.");
            if (fourPlanet.getNoOfMoons() > 0) {
                Moon[] moons = earth.getMoons();

                for (Moon moon : moons) {
                    System.out.println(moon.getName());
                }
            }
        }
        for (Planet fourPlanet : mars.show()) {
            System.out.println("Planet " + fourPlanet.getName() + " has aphelion " + fourPlanet.getAphelion() +
                    " AU, perihelion " + fourPlanet.getPerihelion() + "  AU and " + fourPlanet.getNoOfMoons() + " moons.");
            if (fourPlanet.getNoOfMoons() > 0) {
                Moon[] moons = mars.getMoons();

                for (Moon moon : moons) {
                    System.out.println(moon.getName());
                }
            }
        }
    }
}
