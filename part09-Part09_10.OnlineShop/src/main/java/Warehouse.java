import java.util.*;

public class Warehouse {
    private Map<String, Integer> map;
    private Map<String, Integer> stockMap;
    
    public Warehouse() {
        this.map = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        map.put(product, price);
        stockMap.put(product, stock);
    }
    
    public int price(String product) {
        return map.getOrDefault(product, -99);
    }
    
    public int stock(String product) {
        return stockMap.getOrDefault(product, 0);
    }
    
    public boolean take(String product) {
        if (stockMap.containsKey(product)) {
            if (stock(product) > 0) {
                stockMap.put(product, stock(product) -1);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return map.keySet();
    }
    
}
