package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:25 am
 */

/*
    For sealed class,
    1. Liquid is our base class which permits Water, Honey, Milk class to extend Liquid.
       But these class must be sealed/non-sealed/final
    2. Water extends Liquid, marked as non-sealed. So, Tea can easily extend it without any extra keyword.
    3. Honey extends Liquid, marked as final.
    4. Milk extends Liquid, marked as sealed and starts a new sealed type hierarchy.
       So, when Yogurt extends Milk, it needs to be final/non-sealed/sealed again. We make it final, finally.

    For sealed interfaces,
    1. Move is our base interface which permits Fly, Run to extend Move. But these need to be sealed/non-sealed.
    2. Fly extends Move, mark as non-sealed. So, any class/interface easily work with Fly now.
       So, Bird implements Move without any special keyword.
    3. Run extends Move, but it marked as sealed. So, when Marathon implements it, it needs to sealed/non-sealed/final
       as the requirement of sealed class. We make it final.
 */
public class SealedClassExample {

}
