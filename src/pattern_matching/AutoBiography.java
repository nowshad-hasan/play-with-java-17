package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 9:51 pm
 */
public class AutoBiography extends Book {
    String contribution;

    public AutoBiography(String name, String author, String contribution) {
        super(name, author);
        this.contribution = contribution;
    }


    @Override
    String about() {
        return "It's an autobiography, named \"" + name + "\", written by " + author;
    }

    String getContribution() {
        return "Contribution: " + contribution;
    }
}
