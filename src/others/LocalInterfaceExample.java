package others;

/**
 * @author Nowshad Hasan
 * @since 9/10/21 8:59 am
 */
public class LocalInterfaceExample {
    public static void main(String[] args) {

        LocalInterfaceExample example = new LocalInterfaceExample();
        example.checkLocalInterface();
        example.checkLocalInterfaceFromOtherMethod();

    }

    void checkLocalInterface() {
        interface Runner {
            void run();
        }

        Runner runner = () -> System.out.println("Running");
        runner.run();
    }

    void checkLocalInterfaceFromOtherMethod() {
        /*
        Runner from checkLocalInterface() is not accessible here.
        But we can declare another interface with same name in this method.
        It is totally isolated from the Runner of checkLocalInterface().
         */
        interface Runner {
            void run();
        }

        Runner runner = () -> System.out.println("Running from other method");
        runner.run();
    }


}
