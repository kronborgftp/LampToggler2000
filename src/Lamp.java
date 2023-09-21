public class Lamp {

    private String name;
    private boolean isOn;


    public Lamp(String name) {
        this.name = name;
        this.isOn = false;
    }

    //toogle the lamps state
    public void toggle() {
        isOn = !isOn;
    }

public String toString() {
        return name + " is on " + isOn;
    }
}
