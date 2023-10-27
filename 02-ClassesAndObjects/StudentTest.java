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
        s.studentIdCard = 4321;
        s.isIdCardValid = true;
        System.out.println(s.name + " " +s.age);
        System.out.println(s2.name + " "+ s2.age);
    }

}

