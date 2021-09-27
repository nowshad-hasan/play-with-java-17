package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:57 am
 */
/*
    Interface can be sealed or non-sealed and it can permit another interface or class.
    Permitted interface must be sealed/non-sealed and class must be sealed/non-sealed/final.
 */
public sealed interface Move permits Fly, Run {
    void move();
}

non-sealed interface Fly extends Move {
}

sealed interface Run extends Move permits Marathon {
}

class Bird implements Fly {

    @Override
    public void move() {

    }
}

final class Marathon implements Run {
    @Override
    public void move() {

    }
}

