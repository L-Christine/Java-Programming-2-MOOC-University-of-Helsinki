import java.util.*;

public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String xy = "";
        for (Movable each: herd) {
            xy += each.toString() + "\n";
        }
        return xy;
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable each: herd) {
            each.move(dx, dy);
        }
    }
}
