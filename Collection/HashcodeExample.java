package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashcodeExample
{
    public static void main(String[] args)
    {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Roma", "Logov", 1);
        Student st3 = new Student("Anton", "Sidorov", 4);
        map.put(st1, 7.5);
        map.put(st1, 8.7);
        map.put(st1, 9.2);
        System.out.println(map);
        Student st4 = new Student("Zaur", "Tregulov", 3);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println(st1.equals(st4));
        System.out.println(st1.hashCode());
        System.out.println(st4.hashCode());
        Student st5 = new Student("Filipp","Burov", 5);


    }

}
class Student implements Comparable<Student>
{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo((o.name));
    }
}
