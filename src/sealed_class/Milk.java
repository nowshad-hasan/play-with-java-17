package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:24 am
 */
// Milk is sealed. So, it starts another sealed type hierarchy.
// Which class extends Milk, must be sealed/non-sealed/final.
public sealed class Milk extends Liquid permits Yogurt {


}
