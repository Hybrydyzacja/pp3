public class Rectangle {
    int a;
    int b;
    int perimeter;
    int surfaceArea;


    public void printDmiensions(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void printPerimeter(){
        perimeter = 2* a + 2* b;
        System.out.printf("Perimeter of rectangle with edges " + a + " and " + b + " is: " + perimeter +"%n", a, b);
    }

    public void printSurfaceArea(){
        surfaceArea = a * b;
        System.out.printf("Surface area of rectangle with edges " + a + " and " + b + " is: " + surfaceArea +"%n", a, b);

    }
    
}
