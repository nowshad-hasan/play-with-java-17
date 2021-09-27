package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:22 am
 */
/*
    Which classes are permitted to extend this Liquid class, must be sealed/non-sealed/final.
    1. sealed - starts another sealed hierarchy
    2. non-sealed - can be extended by any class
    3. final - can not be extended
 */
public sealed class Liquid permits Water, Honey, Milk {

}


