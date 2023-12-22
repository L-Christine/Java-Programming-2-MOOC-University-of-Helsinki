package application;

import java.util.*;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    public int read() {
        if (!isOn()) {
            throw new IllegalStateException();
        }
        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.read();
        }
        int reading = sum / sensors.size();
        readings.add(reading);
        return reading;
    }

    public boolean isOn() {
        for (Sensor sensor: sensors) {
            if (sensor.isOn() == false) {
                return false;
            }
        }
        return true;
    }

    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }
}
