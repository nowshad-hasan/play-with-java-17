package switch_expression;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 3:58 pm
 */
public class NewSwitchExample {
    public static void main(String[] args) {
        getDayStatus(WeekDay.FRIDAY);
    }

    /*
    This switch-expression actually creates our normal switch type at compile time.
    We can see it from 'out/' folder.
     */

    // This method is pretty simple and concise
    private static void getDayStatus(WeekDay day) {
        switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("On day");
            case FRIDAY, SATURDAY -> System.out.println("Off day");
        }
    }

    // We can also use 'default' if we want generalize something.
    private static void getDayStatus2(WeekDay day) {
        switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> System.out.println("On day");
            case FRIDAY -> System.out.println("Off day");
            default -> System.out.println("Just another day");
        }
    }

    // We can also return value from these switch-expressions.
    // We can store the return value in a variable or directly return that from the method.
    // But we must use semicolon at the end, as it works like a statement.
    private static int getDayExpense(WeekDay day) {
        int val = switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> 100;
            case FRIDAY, SATURDAY -> 200;
        };

        return val;

        // Or, we can return like that
        /*
       return switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> 100;
            case FRIDAY, SATURDAY -> 200;
        };
         */
    }

    // When returning, we must handle all values of an ENUM or use 'default'.
    private static int getDayExpense2(WeekDay day) {
        return switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> 100;
//            case FRIDAY -> 200;  // without using 'default', this line creates compile error
//            case FRIDAY, SATURDAY -> 200  // valid
            default -> 200; // valid
        };
    }

    // We must use 'default' if we have int, String etc common parameter type.
    // Because it can't determine which value is missing, so it expects a general fall-through => 'default'.
    private static int getDayExpense3(int indexOfWeek) {
        return switch (indexOfWeek) {
            case 1, 2, 3, 4, 5 -> 100;
            default -> 200;
        };
    }

    // We can also do some extra work inside the case block. When returning value we've to use 'yield' keyword.
    private static int getExpense4(WeekDay day) {
        return switch (day) {
            case SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY -> {
                var val = eatLunch();
                yield val;
            }

            case FRIDAY, SATURDAY -> {
                yield goToRestaurant();
                /*
                We can also write this inline.
                yield goToRestaurant();
                 */
            }
        };
    }

    private static int goToRestaurant() {
        return 200;
    }

    private static int eatLunch() {
        return 100;
    }

}
