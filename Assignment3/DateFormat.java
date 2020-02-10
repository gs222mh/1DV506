package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class DateFormat {

    private int year;
    private int month;
    private int day;
    private char space;
    private char bigEndian;
    private int fourNumber;

    public DateFormat() {
    }

    DateFormat(int year, int month, int day, char space, char form) {
        setYear(year);
        setMonth(month);
        setDay(day);
        setPunctuation(space);
        setFormat(form);
    }


    public int getFourNumber() {
        return fourNumber;
    }

    public void setFourNumber(int fourNumber) {
            this.fourNumber = fourNumber;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int yearFromMain) {
        if (yearFromMain >= 1900 && yearFromMain <= 2100) {
        this.year = yearFromMain;
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

    public char getFormat() {
        return bigEndian;
    }

    public void setFormat(char format) {
        this.bigEndian = format;
    }

    public char getPunctuation() {
        return space;
    }

    //Skapa en method som hanterar vilken tecken har skickat från mainMethod.
    public void setPunctuation(char punctuation) {
        if (punctuation == '-') {
            this.space = '-';
        } else if (punctuation == '/') {
            this.space = '/';
        } else if (punctuation == '!') {

            //Denna kod betyder en tom space.
            this.space = '\uFEFF';
        }
    }

    public String getDate(boolean fullYear) {

        //Check om månaden är större än 12, och om dagerna mer är 31.
        if (getDay() > 31) {
            this.day = 0;
            return "Invalid date";
        } else if (getMonth() > 12) {
            this.month = 0;
            return "Invalid date";
        }

        //Bestämma vilka månader måste vara 31 dager, och vilka måste vara 30. (Varana månader)
        if ((getMonth() < 7) && (getMonth() % 2) == 0) {
            if (getDay() > 30) {
                return "Invalid date";
            }
        } else if ((getMonth() > 8) && (getMonth() % 2) != 0) {
            if (getDay() > 30) {
                return "Invalid date";
            }
        }

        //if-sats som hanterar Februari.
        if (getMonth() == 2 && getDay() == 29) {
            if ((getYear() % 4) != 0) {
                return "Invalid date";
            } else if ((getYear() % 100) == 0 && (getYear() % 400) != 0) {
                return "Invalid date";
            }
        }

        //Det kommer aldrig att vara 30 eller 31 feb.
        if (getMonth() == 2 && getDay() == 30) {
            return "Invalid date";
        } else if (getMonth() == 2 && getDay() == 31) {
            return "Invalid date";
        }


        if (getFormat() == 'b') {
            if (getMonth() < 10 && getDay() < 10) {
                return getYear() + "" + getPunctuation() + "0" + getMonth() + getPunctuation() + "0" + getDay();
            } else if (getDay() < 10) {
                return getYear() + "" + getPunctuation() + getMonth() + getPunctuation() + "0" + getDay();
            } else if (getMonth() < 10) {
                return getYear() + "" + getPunctuation() + "0" + getMonth() + "" + getPunctuation() + getDay();
            } else {
                return getYear() + "" + getPunctuation() + getMonth() + getPunctuation() + getDay();
            }

        } else if (getFormat() == 'l') {
            if (getDay() < 10 & getMonth() < 10) {
                return "0" + getDay() + "" + getPunctuation() + "0" + getMonth() + "" + getPunctuation() + "" + getYear();
            } else if (getMonth() < 10) {
                return getDay() + "" + getPunctuation() + "0" + getMonth() + "" + getPunctuation() + "" + getYear();
            } else if (getDay() < 10) {
                return "0" + getDay() + "" + getPunctuation() + "" + getMonth() + "" + getPunctuation() + "" + getYear();
            } else {
                return getDay() + "" + getPunctuation() + "0" + getMonth() + "" + getPunctuation() + "" + getYear();
            }
        } else {
            if (getMonth() < 10 && getDay() < 10) {
                return "0" + getMonth() + "" + getPunctuation() + "0" + getDay() + "" + getPunctuation() + "" + getYear();
            } else if (getDay() < 10) {
                return getMonth() + "" + getPunctuation() + "0" + getDay() + "" + getPunctuation() + "" + getYear();
            } else if (getMonth() < 10) {
                return "0" + getMonth() + "" + getPunctuation() + "" + getDay() + "" + getPunctuation() + "" + getYear();
            } else {
                return getMonth() + "" + getPunctuation() + "" + getDay() + "" + getPunctuation() + "" + getYear();
            }
        }
    }
}

