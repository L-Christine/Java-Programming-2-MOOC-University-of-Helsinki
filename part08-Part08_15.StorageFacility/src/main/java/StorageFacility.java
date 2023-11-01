
import java.util.*;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> hashmap;
    
    public StorageFacility() {
        this.hashmap = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        hashmap.putIfAbsent(unit, new ArrayList<>());
        hashmap.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return hashmap.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item) {
        hashmap.get(storageUnit).remove(item);
        
        if (hashmap.get(storageUnit).isEmpty()) {
            hashmap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : hashmap.keySet()) {
            units.add(unit);
        }
        return units;
    }
}
