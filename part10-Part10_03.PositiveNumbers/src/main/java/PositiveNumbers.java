
import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            numbers.add(input);
        }
    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positive = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positive;
    }
}
