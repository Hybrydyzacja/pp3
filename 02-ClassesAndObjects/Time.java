/* 	Variables ‘hours’ and ‘minutes’ contain the number of hours and minutes that have passed since midnight. 
Write a program that displays the given time (in the format hh:mm – you can use printf() method) and calculates and displays 
the number of minutes and the number of seconds that have passed since midnight. Sample result: 
hours = 14
minutes = 27
time: 14:27
minutes from midnight: …
seconds from midnight: … */

public class Time {
    public static void main(String[] args){
        int hours = 14;
        int minutes = 27;
        System.out.printf("time: "+"%d:%d%n", hours, minutes);
        System.out.println("minutes from midnight: "+(hours*60 + minutes));
        System.out.println("seconds from midnight: "+(hours*60*60 + minutes*60));
    }
}
