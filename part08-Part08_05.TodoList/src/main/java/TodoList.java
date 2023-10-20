import java.util.*; 

public class TodoList {
    private ArrayList<String> todoList;
    
    public TodoList() {
        this.todoList = new ArrayList<>();
    }
    
    public void add(String task) {
        todoList.add(task);
    }
    
    public void print() {
        for (String task : todoList) {
            int taskNumber = todoList.indexOf(task) + 1;
            System.out.println(taskNumber + ": " + task);
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        todoList.remove(index);
    }
}
