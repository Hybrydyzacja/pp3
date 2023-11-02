/* 24.	A bank buys and sells Euro. Write a program that, based on the Euro buying and selling rates saved in variables, 
calculates the difference between the buying and selling rates (spread). Display result with 4 decimal places 
(you can use printf() method). Sample result:
Bank buys EUR: 4.5940
Bank sells EUR: 4.6250
Spread: 0.0310 */

public class Euro {
    public static void main(String[] args){
        double euroBuy = 4.5940;
        double euroSell = 4.6250;
        double spread = Math.abs(euroBuy - euroSell);

        System.out.printf("Bank buys EUR: "+"%.4f%n",euroBuy);
        System.out.printf("Bank sells EUR: "+"%.4f%n",euroSell);
        System.out.printf("Spread: "+"%.4f",spread); 
        //czy przecinek jest ok, czy trzeba sformatowac na kropke?
    }
    
}
