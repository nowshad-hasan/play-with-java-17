package records;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 5:50 pm
 */

/*
    This record class is cleaner than OldStudent example. We just used 'record' instead of 'class'.
    Java creates the original class at compile-time. we can find it at 'out/' folder.
    Here are some concepts we should remember for 'record' type.
    1. Every field declared here, is private and final. So, the object is immutable. We can't set new values.
       We can access value by method which is same as the field name.
    2. Record automatically implements hashCode(), equals(), toString() with all field variables.
       But we can override these methods as our need.
    3. We can not add any instance field in record. But we can add static field here.
    4. We can add static, non-static method in record.
    5. Constructs are created automatically at compile-time with field variables (All args constructor).
       We can not create any custom constructor which doesn't internally call the all-args constructor.
       Because all fields are private and final. So, we must initialise those via constructor.
    6. Record can implement any interface like - Serializable, Cloneable etc.
    7. Record can't be abstract and extended because it's a final class.
     */

public record NewStudent(String name, int age) implements Serializable, Cloneable {
    /* abstract record not allowed */

    // Not allowed
    /*
    public NewStudent(){

    }
     */

    //    private int rollNumber;  not allowed
    public static String country = "Bangladesh";

    // allowed
    public NewStudent() {
        this("Ron Weasley", 16);
    }

    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("Hermione Granger", 16);
        NewStudent student2 = new NewStudent("Hermione Granger", 16);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));

        System.out.println(student1.name());
        System.out.println(student2.age());

        System.out.println(NewStudent.country);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());

        NewStudent student3 = new NewStudent();
        System.out.println(student3);
    }

    public String getInfo() {
        return name + ' ' + age;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", NewStudent.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewStudent student = (NewStudent) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
