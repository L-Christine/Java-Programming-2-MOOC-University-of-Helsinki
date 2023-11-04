
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        history.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double returnValue = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return returnValue;
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName()
                + "\n History: " + history()
                + "\n Largest amount of product: " + history.maxValue()
                + "\n Smallest amount of product: " + history.minValue()
                + "\n Average: " + history.average());
    }

}
