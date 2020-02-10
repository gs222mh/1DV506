package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int xMain) {
        this.x = xMain;
    }

    public int getY() {
        return y;
    }

    public void setY(int yMain) {
        this.y = yMain;
    }

    //Retunera point som String.
    public String toString() {
        return "(" + x + "," + y + ")";
    }


    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
    }

    public boolean isEqualTo(Point point) {
        if (x == point.x && y == point.y) {
            return true;
        } else {
            return false;
        }
    }

    public void move(int pointX, int pointY) {
        this.x = x + pointX;
        this.y = y + pointY;
    }

    public void moveToXY(int pointX, int pointY) {
        this.x = pointX;
        this.y = pointY;
    }

}
