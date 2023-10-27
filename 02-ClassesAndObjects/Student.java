public class Student {
    String name;
    int age;
    int studentIdCard;
    boolean isIdCardValid;
    int semester;
    double averageGrade;

    void sayHello(){
        System.out.println("Hello from "+name);
    }

    void displayName(){
        System.out.println("My name is "+name);
    }

    void displayAge(){
        System.out.println("I am "+age+" years old");
    }

    void displayStudentInfo(){
        System.out.println("Student's name: "+name);
        System.out.println("Age:"+age);
        System.out.println("ID number: "+studentIdCard);
    }

    void changeId(boolean valid){
        isIdCardValid = valid;
    }

    void displayInfo(){
        System.out.println(isIdCardValid == true ? "Valid" : "Invalid");
    }
}


// liczba z przecinkiem to domyślnie double
// nazwa konstruktora taka sama jak nazwa klasy
