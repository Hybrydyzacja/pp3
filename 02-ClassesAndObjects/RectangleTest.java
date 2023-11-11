public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle();
        rectangle1.a = 3;
        rectangle1.b = 4;

        rectangle1.printDmiensions();
        rectangle1.printPerimeter();
        rectangle1.printSurfaceArea();


        Rectangle rectangle2 = new Rectangle();
        rectangle2.a = 2;
        rectangle2.b = 7;

        rectangle2.printDmiensions();
        rectangle2.printPerimeter();
        rectangle2.printSurfaceArea();
    }

}
