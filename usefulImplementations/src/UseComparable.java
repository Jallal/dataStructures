import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseComparable implements Comparable<UseComparable> {

    String name;
    String author;

    public UseComparable(String author, String name) {

        this.name = name;
        this.author = author;
    }

    public static void main(String[] args) {

        List<UseComparable> books = new ArrayList<>();
        books.add(new UseComparable("Uncle Bob", "Clean Code"));
        books.add(new UseComparable("Rafael del Nero", "Golden Lessons"));
        books.add(new UseComparable("Uncle Bob", "Clean Architecture"));
        books.add(new UseComparable("Joshua Bloch", "Effective Java"));
        books.add(new UseComparable("John Sonmez", "Soft Skills"));

        Collections.sort(books);
        books.forEach(i -> System.out.println(i.author + "--" + i.name));

    }

    @Override
    public int compareTo(UseComparable book) {

        if (this.author.compareTo(book.author) == 0) {
            return this.name.compareTo(book.name);
        } else {
            return this.author.compareTo(book.author);
        }
    }


}
