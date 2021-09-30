package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:22 am
 */
/*
    Some concepts about sealed class.
    1. Which classes are permitted to extend this Liquid class, must be sealed/non-sealed/final.
        a. sealed - starts another sealed hierarchy
        b. non-sealed - can be extended by any class (stops sealing)
        c. final - can not be extended (stops sealing)
    2. Sealed class can be abstract
    3. Sealed class and permitted subclass must be in same module (Module introduced in java 9).
       If they are declared in unnamed module, they must be in same package.
 */
    /* 'permits Thriller' not allowed as it is in another package */
public sealed class Liquid permits Water, Honey, Milk {

}


