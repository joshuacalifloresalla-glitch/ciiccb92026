package Task121;

// DateTask Class
class DateTask {
    // Step 4: Encapsulate instance variables with private access modifier
    private byte day;
    private byte month;
    private short year;

    // Step 5: Add "this(1, 1, 1);" to no-args constructor
    public DateTask() {
        this(1, 1, 1);
    }

    // Constructor that takes 3 arguments
    public DateTask(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Step 6: Set toString() to display "12/12/2012" date format
    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public void setDate(int m, int d, int y) {
        if (valid(d, m, y)) {
            day = (byte) d;
            year = (short) y;
            month = (byte) m;
        } else {
            day = (byte) 0;
            year = (short) 0;
            month = (byte) 0;
        }
    }

    // Step 14: Display leap years
    public static void leapYears() {
        for (int i = 1980; i <= 2023; i = i + 4) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                System.out.println("The year " + i + " is a leap year");
            }
        }
    }

    // Step 7: getDay
    public int getDay() {
        return day;
    }

    // Step 8: setDay
    public void setDay(int day) {
        if (valid(day, month, year)) {
            this.day = (byte) day;
        } else {
            this.day = (byte) 0;
        }
    }

    // Step 9: getMonth
    public int getMonth() {
        return month;
    }

    // Step 10: setMonth
    public void setMonth(int month) {
        if (valid(day, month, year)) {
            this.month = (byte) month;
        } else {
            this.month = (byte) 0;
        }
    }

    // Step 11: getYear
    public int getYear() {
        return year;
    }

    // Step 12: setYear
    public void setYear(int year) {
        if (valid(day, month, year)) {
            this.year = (short) year;
        } else {
            this.year = (short) 0;
        }
    }

    private boolean valid(int day, int month, int year) {
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            System.out.println("Attempting to create a non-valid date " + month + "/" + day + "/" + year);
            return false;
        }
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return (day <= 30);
            case 2:
                return day <= 28 || (day == 29 && year % 4 == 0);
        }
        return true;
    }
}

// Main class containing main()
public class MyDate {
    public static void main(String[] args) {
        // Step 13: Set date1 to Jan 1, 1978 and date2 to Sep 21, 1984
        DateTask date1 = new DateTask(1, 1, 1978);
        DateTask date2 = new DateTask(9, 21, 1984);

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // Step 14: Display leapYears after printing date2
        DateTask.leapYears();
    }
}
