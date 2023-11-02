public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        s.studentIdCard = 1234;
        s.isIdCardValid = false;

        Student s2 = new Student();
        s2.name  = "Ola";
        s2.age = 25;
        s2.studentIdCard = 4321;
        s2.isIdCardValid = true;

        System.out.println("Student's name and age: "+ s.name + " " +s.age);
        System.out.println("Student's2 name and age: "+s2.name + " "+ s2.age);
        System.out.println("Student's Card ID: " +s.studentIdCard);
        System.out.println("Student's2 Card ID: "+ s2.studentIdCard);
    }

}

