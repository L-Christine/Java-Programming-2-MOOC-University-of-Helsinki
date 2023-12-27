import java.util.*;

public class Pipe<T> {
    private List<T> list;
    
    public Pipe() {
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        list.add(value);
    }
    
    public T takeFromPipe() {
        if (list.isEmpty()) {
            return null;
        }
        T longest = list.get(0);
        list.remove(0);
        return longest;
    }
    
    public boolean isInPipe() {
        if (list.isEmpty()) {
            return false;
        }
        return true;
    }
}
