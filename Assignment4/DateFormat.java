package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class DateFormat{

    private int year;
    private int month;
    private int day;


    public DateFormat() {
    }


    public int getYear() {
        return year;
    }

    public void setYear(int yearFromMain) {
        if (yearFromMain >= 1900 && yearFromMain <= 2100) {
            this.year = yearFromMain * 2 ;

        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int monthFromMain) {
        this.month = monthFromMain;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int dayFromMain) {
        this.day = dayFromMain;
    }


    public String getDate(boolean fullYear) {

        //Check om månaden är större än 12, och om dagerna mer är 31.
        if (getDay() > 31) {
            throw new IllegalArgumentException("No, that is not possible, error is: Not a valid day that month.");
        } else if (getMonth() > 12) {
            throw new IllegalArgumentException("No, that is not possible, error is: Month must be between 1 and 12.");
        }

        //Bestämma vilka månader måste vara 31 dager, och vilka måste vara 30. (Varana månader)
        if ((getMonth() < 7) && (getMonth() % 2) == 0) {
            if (getDay() > 30) {
                throw new IllegalArgumentException("No, that is not possible, error is: Check the month.");

            }
        } else if ((getMonth() > 8) && (getMonth() % 2) != 0) {
            if (getDay() > 30) {
                throw new IllegalArgumentException("No, that is not possible, error is: Check the month.");
            }
        }

        //if-sats som hanterar Februari.
        if (getMonth() == 2 && getDay() == 29) {
            if ((getYear() % 4) != 0) {
                throw new IllegalArgumentException("No, that is not possible, error is: Check the month or the year. (leap year)");
            } else if ((getYear() % 100) == 0 && (getYear() % 400) != 0) {
                throw new IllegalArgumentException("No, that is not possible, error is: Check the month or the year. (leap year)");
            }
        }

        //Det kommer aldrig att vara 30 eller 31 feb.
        if (getMonth() == 2 && getDay() == 30) {
            throw new IllegalArgumentException("No, that is not possible, error is: Not a valid day that month. (Feb must be between 1 and (28 or 29))");
        } else if (getMonth() == 2 && getDay() == 31) {
            throw new IllegalArgumentException("No, that is not possible, error is: Not a valid day that month. (Feb must be between 1 and (28 or 29))");
        }


        if (getDay() < 10 & getMonth() < 10) {
            return "0" + getDay() + "" + "/" + "0" + getMonth() + "" + "/" + "" + getYear();
        } else if (getMonth() < 10) {
            return getDay() + "" + "/" + "0" + getMonth() + "" + "/" + "" + getYear();
        } else if (getDay() < 10) {
            return "0" + getDay() + "" + "/" + "" + getMonth() + "" + "/" + "" + getYear();
        } else {
            return getDay() + "" + "/" + "0" + getMonth() + "" + "/" + "" + getYear();
        }

    }

}

