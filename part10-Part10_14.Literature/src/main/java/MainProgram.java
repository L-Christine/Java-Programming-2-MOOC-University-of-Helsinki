
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title, age));
        }
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getTitle);
        Collections.sort(books, comparator);
        for (Book book: books) {
            System.out.println(book);
        }
    }

}
