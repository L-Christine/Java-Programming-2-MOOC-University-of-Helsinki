
import java.util.*;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Input numbers, type \"end\" to stop.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.valueOf(input));
        }

        double average = numbers.stream()
                .mapToInt(n -> Integer.valueOf(n))
                .average()
                .getAsDouble();

        System.out.println("average of the numbers: " + average);
    }
}
