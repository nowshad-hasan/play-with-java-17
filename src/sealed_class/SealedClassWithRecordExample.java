package sealed_class;

/**
 * @author Nowshad Hasan
 * @since 30/9/21 8:06 am
 */
/*
Sealed class nicely works with record type, as record is implicitly final.
 */
public class SealedClassWithRecordExample {
    sealed interface Exam permits Student {
        void giveExam();
    }

    record Student(String name, String rollNumber) implements Exam {
        @Override
        public void giveExam() {

        }
    }
}
