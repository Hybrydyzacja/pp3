public class DrivingLicenceTest {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.setName("Jack"); /* if name is private, DrivingLicence.name is not visible */
        dl.setSurname("Smith");
        System.out.println(dl.getName());
        System.out.println(dl.getSurname());
    }
    
 

}