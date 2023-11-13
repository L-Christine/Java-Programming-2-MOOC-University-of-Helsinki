import java.util.*;

public class ShoppingCart {
    private Map<String, Item> map;
    
    public ShoppingCart() {
        this.map = new HashMap<>();
    }
    
    public void add(String product, int price) {
        map.putIfAbsent(product, new Item(product, 0, price));
        map.get(product).increaseQuantity();
    }
    
    public int price() {
        int total = 0;
        for (Item item: map.values()) {
            total += item.price();
        }
        return total;
    }
    
    public void print() {
        for (Item item: map.values()) {
            System.out.println(item);
        }
    }
    
}
