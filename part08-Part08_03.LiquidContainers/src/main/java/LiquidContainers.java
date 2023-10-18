import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int first = 0;
        int second = 0;
 
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            System.out.print("> ");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
 
            if (input.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }
            }
 
            if (input.equals("move") && amount > 0) {
                if (amount > first) {
                    amount = first;
                }
 
                first -= amount;
                second += amount;
 
                if (second > 100) {
                    second = 100;
                }
            }
 
            if (input.equals("remove") && amount > 0) {
                second -= amount;
                if (second < 0) {
                    second = 0;
                }
            }
 
            System.out.println("");
        }
    }
 
}