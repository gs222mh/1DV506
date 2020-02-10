package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class DateMain {
    public static void main(String[] args) {
        DateFormat date1 = new DateFormat(1994, 5, 4, '!', 'b');
        DateFormat date2 = new DateFormat();
        date2.setYear(1980);
        date2.setMonth(5);
        date2.setDay(17);
        date2.setPunctuation('/');
        date2.setFormat('l');

        DateFormat date3 = new DateFormat(1983, 5, 25, '-', 'm');
        DateFormat date4 = new DateFormat(1999, 13, 34, '-', 'm');

        System.out.println(date1.getDate(false));
        System.out.println(date2.getDate(true));
        System.out.println(date3.getDate(false));
        System.out.println(date4.getDate(true));

    }
}
