package others;

import java.util.Arrays;

/**
 * @author Nowshad Hasan
 * @since 9/10/21 9:08 am
 */
public class LocalEnumExample {
    public static final int VALUE = 5;

    public static void main(String[] args) {
        LocalEnumExample example = new LocalEnumExample();
        example.checkLocalEnum();
        example.checkLocalEnum2();
    }

    void checkLocalEnum() {
        enum COLOR {RED, PURPLE, BLUE}
        System.out.println(Arrays.toString(COLOR.values()));
    }

    /*
        Local enum is implicitly static. So, we can't work with non-static variable in local enum.
    */
    void checkLocalEnum2() {
        int val = 2;
        enum LEVEL {
            LOW, MID, HIGH;

            void getValue() {
                System.out.println(this);
//              System.out.println(val); // ERROR, non-static variable can't be referenced from static context.
                System.out.println(VALUE);  // allowed
            }
        }
        for (LEVEL level : LEVEL.values()) {
            level.getValue();
        }
    }

}
