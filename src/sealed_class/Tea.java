package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 8:24 am
 */
/*
Tea can't extend Liquid class, as it was not permitted. But it can extend Water as this is non-sealed.
 */
public class Tea extends Water {
    class  Water1 extends Tea {

    }
}
