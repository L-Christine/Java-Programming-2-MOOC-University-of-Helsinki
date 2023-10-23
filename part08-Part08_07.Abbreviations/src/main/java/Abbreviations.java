import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> hashmap;
    
    public Abbreviations() {
        this.hashmap = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        hashmap.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return hashmap.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return hashmap.get(abbreviation);
    }
}
