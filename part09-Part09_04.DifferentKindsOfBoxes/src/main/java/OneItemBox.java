import java.util.*;

public class OneItemBox extends Box {
    private ArrayList<Item> items;
    
    public OneItemBox() {
        this.items = new ArrayList<>();
    }
    
    public void add(Item item) {
        if (items.isEmpty()) {
            items.add(item);
        }
    }
    
    public boolean isInBox(Item item) {
        if (items.contains(item)) {
            return true;
        }
        return false;
    }
}
