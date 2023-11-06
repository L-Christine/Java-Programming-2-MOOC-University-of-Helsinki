
import java.util.*;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Item item) {
        if (capacity - item.getWeight() >= 0) {
            items.add(item);
            capacity -= item.getWeight();
        }
    }

    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
