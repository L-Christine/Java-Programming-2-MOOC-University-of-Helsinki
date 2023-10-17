
import java.util.*;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 0) {
                if (numbers.isEmpty()) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                int sum = 0;
                for (Integer each : numbers) {
                    sum += each;
                }
                double avg = 1.0 * sum / numbers.size();
                System.out.println(avg);
                break;
            }
            
            if (input > 0) {
                numbers.add(input);
            }
        }
    }
}
