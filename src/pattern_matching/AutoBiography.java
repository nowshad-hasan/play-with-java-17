package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 26/9/21 9:51 pm
 */
public class AutoBiography extends Book {
    String lifeGoal;

    public AutoBiography(String name, String author, String lifeGoal) {
        super(name, author);
        this.lifeGoal = lifeGoal;
    }


    @Override
    String about() {
        return "It's an autobiography, named \"" + name + "\" written by " + author;
    }

    String getLifeGoal() {
        return lifeGoal;
    }
}
