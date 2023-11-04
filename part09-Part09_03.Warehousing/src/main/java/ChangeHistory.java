
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    public double maxValue() {
        if (list.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (double each : list) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public double minValue() {
        if (list.isEmpty()) {
            return 0;
        }
        double min = list.get(0);
        for (double each: list) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public double average() {
        if (list.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double each: list) {
            sum += each;
        }
        return sum / list.size();
    }

    public String toString() {
        return list.toString();
    }
}
