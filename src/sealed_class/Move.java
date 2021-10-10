package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:57 am
 */
/*
    Interface can be sealed or non-sealed, and it can permit other interface or class.
    Permitted interface must be sealed/non-sealed and class must be sealed/non-sealed/final.
    Sealed interface and permitted interface/class must be in same module. For unnamed module, they must be in same package.
 */
public sealed interface Move permits Fly, Run {
    void move();
}

// Fly is non-sealed. So, it can be implemented by any class or extended by any interface.
non-sealed interface Fly extends Move { }

// starts another sealed hierarchy
sealed interface Run extends Move permits Marathon { }

// As Fly is non-sealed, Bird easily implements it without extra keyword.
class Bird implements Fly {

    @Override
    public void move() {

    }
}

// Marathon needs to be final/sealed/non-sealed, as Run is sealed.
final class Marathon implements Run {
    @Override
    public void move() {

    }
}

