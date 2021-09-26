package switch_expression;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 4:03 pm
 */
public class OldSwitchExample {
    public static void main(String[] args) {
        getDayStatus(WeekDay.SUNDAY);
    }

    private static void getDayStatus(WeekDay day) {
        switch(day) {
            case SUNDAY:
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("On day");
                break;
            case FRIDAY:
            case SATURDAY:
                System.out.println("Off day");
                break;
        }
    }
}
