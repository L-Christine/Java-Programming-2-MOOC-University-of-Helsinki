
import java.util.*;

public class Box implements Packable {

    private ArrayList<Packable> box;
    private double capacity;

    public Box(double capacity) {
        this.box = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Packable item) {
        double sum = weight() + item.weight();
        if (sum <= capacity) {
            box.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : box) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + box.size() + " items, total weight " + weight() +" kg";
    }
}
