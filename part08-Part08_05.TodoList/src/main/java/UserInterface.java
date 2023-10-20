import java.util.*;

public class UserInterface {
    private TodoList list;
    private Scanner scan;
    
    public UserInterface(TodoList list, Scanner scan) {
        this.list = list;
        this.scan = scan;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("add")) {
                System.out.println("To add: ");
                String addTask = scan.nextLine();
                list.add(addTask);
            }
            if (command.equals("list")) {
                list.print();
            }
            if (command.equals("remove")) {
                System.out.println("Which one is removed?");
                int taskNumber = Integer.valueOf(scan.nextLine());
                list.remove(taskNumber);
            }
        }
    }
    
}
