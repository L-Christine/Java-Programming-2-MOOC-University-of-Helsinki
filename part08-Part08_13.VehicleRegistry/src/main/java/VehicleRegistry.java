
import java.util.*;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> hashmap;

    public VehicleRegistry() {
        this.hashmap = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!hashmap.containsKey(licensePlate)) {
            hashmap.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return hashmap.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (hashmap.containsKey(licensePlate)) {
            hashmap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : hashmap.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String name : hashmap.values()) {
            if (!owners.contains(name)) {
                owners.add(name);
            }
        }

        for (String name : owners) {
            System.out.println(name);
        }
    }
}
