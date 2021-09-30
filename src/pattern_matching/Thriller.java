package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 9:47 pm
 */
public class Thriller extends Book {
    private String suspense;

    public Thriller(String name, String author, String suspense) {
        super(name, author);
        this.suspense = suspense;
    }

    @Override
    String about() {
        return "It's a thriller. The name is \"" + name + "\", author is " + author;
    }

    String getSuspense() {
        return suspense;
    }
}
