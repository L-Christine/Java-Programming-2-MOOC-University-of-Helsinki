
public class Book implements Packable {
    private String author;
    private String title;
    private double weight;
    
    public Book (String author, String title, double weight) {
        this.author = author;
        this.title = title;
        this.weight = weight;
    }
    
    public double weight() {
        return weight;
    }
    
    public String toString() {
        return author + ": " + title;
    }
}
