package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 9:43 pm
 */
public abstract class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    abstract String about();
}
