package pattern_matching;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 5:56 am
 */
public class PatternMatchingExample2 {
    public static void main(String[] args) {
        Object integer = Integer.valueOf(10);
        Object string = "10";

        printObjectOld(integer);
        printObjectOld(string);

        System.out.println();

        printObjectNew(integer);
        printObjectNew(string);
    }

    private static void printObjectOld(Object val) {
        if (val instanceof Integer) {
            var number = (Integer) val;
            System.out.println(number.toString());
        } else if (val instanceof String) {
            var text = (String) val;
            System.out.println(text.toUpperCase());
        }
    }

    private static void printObjectNew(Object val) {
        // no need of explicit typecast
        if (val instanceof Integer number) {
            System.out.println(number.toString());
        } else if (val instanceof String text) {
            System.out.println(text.toUpperCase());
        }
    }
}
