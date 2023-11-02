/* 22.	A variable contains your height in cm. Write a program that calculates and displays your height both in cm and in feet and inches. 
Sample result:
I am 170cm tall, i.e. 5 feet and 7 inches */

public class Height {
    public static void main(String[] args) {
        int heightCm = 170;
        double heightFeet = heightCm * 0.032808f;
        int heightFeetRound = (int)Math.floor(heightFeet);
        double heightInches = (heightFeet - heightFeetRound)*12;
        int heightInchesRound = (int)Math.round(heightInches);

        System.out.println("I am " + heightCm + " tall, i.e. " + heightFeetRound + " feet and " + heightInchesRound + " inches");
    }

}
