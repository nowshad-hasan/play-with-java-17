package records;

import java.util.Objects;
import java.util.StringJoiner;

/**
 * @author Nowshad Hasan
 * @since 25/9/21 5:35 pm
 */
public class OldStudent{
    /*
    We use this type of model class everywhere and everytime, where we've to generate getter-setter, constructor
    and implement equals, hashcode, toString etc.
    Sometimes, we use Lombok plugin to make these things a little easier. But it's a third party library
    which uses Reflection API to generate all these boilerplate codes. Sometimes it creates critical problems
    when a project grows bigger.
     */
    public static void main(String[] args) {
        OldStudent student1 = new OldStudent("Harry Potter",16);
        OldStudent student2 = new OldStudent("Harry Potter",16);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student2));
    }

    private String name;
    private int age;

    public OldStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldStudent student = (OldStudent) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", OldStudent.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .toString();
    }
}
