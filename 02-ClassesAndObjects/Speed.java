public class Speed {
    public static void main(String[] args) {
        int speed  = 110;
        String isOk = (speed >= 40 && speed <= 140) ? "jest  ok" : "nie jest ok";
        System.out.println("Prędkość: " +isOk);
        }
}
