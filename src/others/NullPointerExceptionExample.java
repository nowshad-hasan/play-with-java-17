package others;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 10:15 pm
 */
public class NullPointerExceptionExample {

    /*
    At Java 1.8, Exception in thread "main" java.lang.NullPointerException
	at exception.NullPointerException.main(NullPointerException.java:20)

    At Java 17, Exception in thread "main" java.lang.NullPointerException:
    Cannot read field "birthPlace" because "book.author" is null at
    others.NullPointerExceptionExample.main(NullPointerExceptionExample.java:20)
     */

    public static void main(String[] args) {
        Book book = new Book("Rebecca");
        System.out.println(book.author.birthPlace);
    }

    static class Book {

        String name;
        Author author;

        public Book(String name) {
            this.name = name;
        }
    }

    static class Author {
        String name;
        String birthPlace;
    }
}
