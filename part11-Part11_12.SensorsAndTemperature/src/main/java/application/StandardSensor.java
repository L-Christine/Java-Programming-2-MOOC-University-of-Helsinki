
package application;

public class StandardSensor implements Sensor {
    private int num;
    
    public StandardSensor(int num) {
        this.num = num;
    }
    
    public int read() {
        return num;
    }
    
    public boolean isOn() {
        return true;
    }
    
    public void setOn() {
        
    }
    
    public void setOff(){
        
    }
}
