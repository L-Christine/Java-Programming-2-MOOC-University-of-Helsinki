import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
 
public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Result> results = new ArrayList<>();
        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.split(","))
                    .map(p -> new Result(p[2].replace("(%)", "").trim(), p[3], Integer.valueOf(p[4]), Double.parseDouble(p[5])))
                    .forEach(line -> results.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        results.stream().sorted((p1, p2) -> {
            if (p1.getPercent() > p2.getPercent()) {
                return 1;
            }
            if (p1.getPercent() < p2.getPercent()) {
                return -1;
            }
            return 0;
        }).forEach(p -> System.out.println(p));
    }
}