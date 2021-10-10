package others;

/**
 * @author Nowshad Hasan
 * @since 27/9/21 6:16 am
 */
public class StringExample {

    /*
    New methods introduced in String class, like - indent(int n), transform(java.util.function.Function function).
     */

    public static void main(String[] args) {
        String str = "Hello Java 17!\nIt's a new LTS.";
        indentString(str);
        transformString(str);
    }

    //    indent(int n) takes an int input, positive or negative.
    public static void indentString(String input) {
        // Positive value add spaces beginning of each line.
        String positiveIndent5 = input.indent(5);   // 5 spaces

        // Negative value remove spaces from each line.
        String negativeIndent2 = positiveIndent5.indent(-2);    // 3 spaces

        // For negative value, if the value is greater than the actual spaces the string actually has,
        // it removes all the spaces.
        String negativeIndent10 = positiveIndent5.indent(-10);  // no space at all

        System.out.println(positiveIndent5);
        System.out.println(negativeIndent2);
        System.out.println(negativeIndent10);
    }

    //    transform(java.util.function.Function function) takes a Function to transform a string.
    public static void transformString(String input) {
        input.transform(s -> s.trim())
                .transform(s -> s.toUpperCase())
                .transform(s -> s.lines())
                .forEach(s -> System.out.println(s));
    }
}
