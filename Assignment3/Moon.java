package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class Moon {
    private String name;
    private int diameter;

    public Moon() {
    }

    public Moon(String name, int diameter) {
        setName(name);
        setDiameter(diameter);
    }

    public String getName() {
        return name;
    }

    public void setName(String nameFromMain) {
        this.name = nameFromMain;
    }


    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameterFromMain) {
        this.diameter = diameterFromMain;
    }
}
