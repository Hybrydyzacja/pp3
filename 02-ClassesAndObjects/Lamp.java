public class Lamp {
    boolean isOn;

    public void switchOn(){
        isOn = true;
    }

    public void switchOff(){
        isOn = false;
    }

    public void isOn() {
       String isOnOrOff = isOn ? "on" : "off";
       System.out.println("Lamp is: " + isOnOrOff);
    }
}
