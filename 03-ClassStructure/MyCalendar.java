public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static String myDate() {
        return String.format("%d-%02d-%02d", MyCalendar.year, MyCalendar.month, MyCalendar.day);
        /*  metoda format z klasy string (String.format) */
    }

    static int days() {
        return month * 30 + day;
        /* tablica z ilością dni w miesiącach */
    }

    static String monthName(int number) {
        String[] month = { /*nazwy miesięcy8*/ };
        return month[number -1];
    }


}   
