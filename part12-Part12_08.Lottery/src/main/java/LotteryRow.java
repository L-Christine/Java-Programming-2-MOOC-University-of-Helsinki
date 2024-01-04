
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random randNum = new Random();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        while (numbers.size() < 7) {
            int num = randNum.nextInt(40) + 1;
            if (!containsNumber(num)) {
                numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
