
import java.util.*;

public class Hideout<T> {
    private T value;

    public void putIntoHideout(T toHide) {
        this.value = toHide;
    }
    
    public T takeFromHideout() {
        if (value == null) {
            return null;
        }
        T alreadyHiding = value;
        value = null;
        return alreadyHiding;
    }

    public boolean isInHideout() {
        if (value == null) {
            return false;
        }
        return true;
    }
}
