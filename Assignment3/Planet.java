package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

import java.util.ArrayList;

public class Planet {

    private String name;
    private int positionFromSun;
    private int noOfMoons;
    private double aphelion;
    private double perihelion;
    //Skapa en arrayList som hämtar info från main och hanterar de i Moon-class.
    private ArrayList<Moon> moons = new ArrayList<Moon>();

    private int num = 0;
    private Planet[] fourPlanet = new Planet[4];

    public Planet() {
    }

    public Planet(String name, int positionFromSun, int noOfMoons, double aphelion, double perihelion) {
        setName(name);
        setPositionFromSun(positionFromSun);
        setNoOfMoons(noOfMoons);
        setAphelion(aphelion);
        setPerihelion(perihelion);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            this.name = "Unknown planet";
        } else {
            this.name = name;
        }
    }

    public int getPositionFromSun() {
        return positionFromSun;
    }

    public void setPositionFromSun(int pos) {
        if (pos > 0 && pos < 10) {
            this.positionFromSun = pos;
        } else {
            positionFromSun = 0;
        }
    }

    public int getNoOfMoons() {
        return noOfMoons;
    }

    public void setNoOfMoons(int moons) {
        if (moons >= 0 && moons <= 100) {
            this.noOfMoons = moons;
        } else {
            noOfMoons = 0;
        }
    }

    public double getAphelion() {
        return aphelion;
    }

    public void setAphelion(double aphe) {
        if (aphe >= 0 && aphe <= 50) {
            this.aphelion = aphe;
        } else {
            aphelion = 0;
        }
    }

    public double getPerihelion() {
        return perihelion;
    }

    public void setPerihelion(double peri) {
        if (peri >= 0 && peri <= 30) {
            this.perihelion = peri;
        } else {
            perihelion = 0;
        }
    }

    //Få namn från Moon-class och adda det i arrayen.
    public void addMoon(Moon namn) {
        moons.add(namn);
    }

    //Byta arrayList till array
    public Moon[] getMoons() {
        Moon[] show = moons.toArray(new Moon[moons.size()]);
        return show;
    }


    public void addToArray (Planet info){
        if (num < 4){
            fourPlanet[num] = info;
            num++;
        }
    }

    //skriva ut alla information som står i arrayen.
    public Planet[] show (){
        Planet[] array = new Planet[num];
        for(int i = 0; i<num ; i++){
            array[i] =  new Planet(fourPlanet[i].getName(), fourPlanet[i].getPositionFromSun(),
                    fourPlanet[i].getNoOfMoons(), fourPlanet[i].getAphelion(), fourPlanet[i].getPerihelion());
        }
        return array;
    }
}
