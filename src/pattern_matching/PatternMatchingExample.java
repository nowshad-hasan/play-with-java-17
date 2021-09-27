package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 9:41 pm
 */
public class PatternMatchingExample {

    public static void main(String[] args) {
        Book thriller = new Thriller("Murder on the Orient Express", "Agatha Cristie", "A man is killed on the train");
        Book autobiography = new AutoBiography("Long Walk to Freedom", "Nelson Mandela", "Freedom");

        printBookOld(thriller);
        printBookOld(autobiography);

        System.out.println();

        printBookNew(thriller);
        printBookNew(autobiography);
    }

    static void printBookOld(Book book) {
        System.out.println(book.about());

        if (book instanceof Thriller) {
            Thriller thriller = (Thriller) book; // must-do casting
            System.out.println(thriller.getSuspense());
        } else if (book instanceof AutoBiography) {
            AutoBiography biography = (AutoBiography) book; //must-do casting
            System.out.println(biography.getLifeGoal());
        }
    }

    static void printBookNew(Book book) {
        System.out.println(book.about());

        if (book instanceof Thriller thriller) {   /* casting in one-line */
            System.out.println(thriller.getSuspense());
        } else if (book instanceof AutoBiography biography) {   /* casting in one-line */
            System.out.println(biography.getLifeGoal());
        }
    }

}
