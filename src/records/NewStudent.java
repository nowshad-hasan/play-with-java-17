package records;

import java.io.Serializable;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 5:50 pm
 */

/*
    This record class is cleaner than OldStudent example. Here are some concepts we should remember for 'record' class.
    1. Every field declared here, is private and final. So, the object is immutable. We can't set new values.
       We can access value by method which is same as the field name.
    2. Record automatically implements hashCode(), equals(), toString() with all field variables.
       But we can override these methods as our need.
    3. We can not add any instance field in record. But we can add static field here.
    4. We can add static, non-static method in record.
    5. Constructors are created automatically at compile-time with field variables (All args constructor).
       We can not create any custom constructor which doesn't call the all-args constructor inside or initialize the fields.
       Because all fields are private and final. So, we must initialize those via constructor.
    6. Record can implement any interface like - Serializable, Cloneable etc.
    7. Record can't be abstract and extended because it's a final class.
    8. It can't extend another class as it implicitly extends java.lang.Record class.
     */

public record NewStudent(String name, int age) implements Serializable, Cloneable {
    /* abstract not allowed */

    //This constructor not allowed. As, it doesn't internally initialize fields or calls any valid constructor.
    /*
    public NewStudent(){

    }
     */

    //    private int rollNumber;  // not allowed
    public static String country = "England";
    public static String defaultName = "Any Hogwarts's Student";
    public static int defaultAge = 12;

    // We can validate our parameter like this.
    // It's called compact constructor, which doesn't have parameter list or a parenthesis.
    // It initializes object internally with fields.
    public NewStudent {
        if (age < 10)
            throw new IllegalArgumentException("Underage");
    }

    // Or, we can do like below.
    // It's called canonical constructor which matches the parameter list with fields.
    /*
    public NewStudent(String name, int age) {
    if (age < 10)
            throw new IllegalArgumentException("Underage");
        this.name = name;
        this.age = age;
    }
    */

    //  It's a custom constructor which takes custom parameter and calls other constructor to initialize.
    public NewStudent(String name) {
        this(name, defaultAge);
    }

    //  Also, a custom constructor.
    public NewStudent() {
        this(defaultName, defaultAge);
    }

    public static void main(String[] args) {
        NewStudent student1 = new NewStudent("Hermione Granger", 12);
        NewStudent student2 = new NewStudent("Hermione Granger", 13);
        NewStudent student3 = new NewStudent();
//        NewStudent student4 = new NewStudent("Ginny Weasley", 9);   // throw IllegalArgumentException
        NewStudent student5 = new NewStudent("Ron Weasley");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("Is Equals: " + student1.equals(student2));

        System.out.println(student1.name());
        System.out.println(student2.age());

        System.out.println(NewStudent.country);

        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());

        System.out.println(student3);
        System.out.println(student5);
    }

    public String getInfo() {
        return name + ' ' + age;
    }

    // customized toString() as our need
    @Override
    public String toString() {
        return new StringJoiner(", ", NewStudent.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }

    // We implemented equals() as we want it only for 'name' field
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewStudent student = (NewStudent) o;
        return Objects.equals(name, student.name);
    }

    // We implemented hashCode() as we want it only for 'name' field
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
