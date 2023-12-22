package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
    private boolean isItOn;
    private int num;

    public TemperatureSensor() {
        this.isItOn = false;
    }

    public int read() {
        if (isItOn == false) {
            throw new IllegalStateException();
        }
        setOn();
        num = new Random().nextInt(61) - 30;
        return num;
    }

    public boolean isOn() {
        return isItOn;
    }

    public void setOn() {
        isItOn = true;
    }
    
    public void setOff() {
        isItOn = false;
    }
}
