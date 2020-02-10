package GS222MH;

/*
 * Date: 31 jan 2020
 * Please do NOT copy this code, this code is to help to understand.
 * Author: Ghayth Sabeaallil
 */

public class SwedishID {
    private DateFormat birthday = new DateFormat();
    private int checksum;
    private boolean valid;

    public SwedishID() {
    }

    //Dela String till olika delar (beror på vad det står i DafteFormat-class) och skicka dem till DateFormat-class.
    public SwedishID(String personalNumber) {
        int year = Integer.parseInt(personalNumber.substring(0, 4));
        int month = Integer.parseInt(personalNumber.substring(4, 6));
        int day = Integer.parseInt(personalNumber.substring(6, 8));
        int fourNumber = Integer.parseInt(personalNumber.substring(9, 13));
        birthday.setFourNumber(fourNumber);
        char form = 'b';
        char punctuation = '!';
        birthday.setPunctuation(punctuation);
        birthday.setYear(year);
        birthday.setMonth(month);
        birthday.setDay(day);
        birthday.setFormat(form);
    }


    public String showID() {
        if (birthday.getDate(true) == "Invalid date") {
            return birthday.getDate(false);
        } else {
            return birthday.getDate(true) + "-" + birthday.getFourNumber();
        }
    }

    public boolean isFamale() {
        String personalNumbere = birthday.getDate(true) + birthday.getFourNumber();
        if (personalNumbere.charAt(12) % 2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    //Ta de första 8 siffror (YYYYMMDD).
    public int comparedTo(SwedishID ID) {
        String personalNUmber =birthday.getDate(true);
        String IDWithFour = ID.showID();
        String IDWithoutFour = IDWithFour.substring(0,10);

        if (personalNUmber.compareTo(IDWithoutFour) > 0) {
            return 1;
        } else if (personalNUmber.compareTo(IDWithoutFour) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean validID() {
        String yearFromMain = birthday.getDate(false);
        String year = yearFromMain.substring(2, 4);
        String year1 = yearFromMain.substring(5, 7);
        String year2 = yearFromMain.substring(8, 10);
        String personalNumber = year + year1 + year2 + birthday.getFourNumber();
        int checksum;
        int sum = 0;
        for (int i = 0; i <= personalNumber.length() - 1; i++) {
            if (i % 2 == 0) {
                checksum = personalNumber.charAt(i) * 2 - (48 * 2);
            } else {
                checksum = personalNumber.charAt(i) - 48;
            }
            if (checksum > 9) {
                checksum = (checksum % 10) + 1;
            }
            sum += checksum;
        }
        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

