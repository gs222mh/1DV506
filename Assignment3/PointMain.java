package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class PointMain {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3, 4);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        double dist = p1.distanceTo(p2);
        String distt = String.format("%.1f", dist);
        System.out.println("Point Distance: " + distt);

        if (p1.isEqualTo(p2)) {
            System.out.println("The two points are equal");
        }

        p2.move(5, -2);
        p1.moveToXY(8, 2);

        if (p1.isEqualTo(p2)) {
            System.out.println("The two points are equal");
        }

    }
}
