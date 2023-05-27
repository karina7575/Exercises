package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample
{
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.remove(2);
        System.out.println(treeSet.contains(1));
        System.out.println(treeSet);

        Set<Studentt> treeSet1 = new TreeSet<>();
        Studentt st1 = new Studentt("Zaur", 5);
        Studentt st2 = new Studentt("Nelya", 1);
        Studentt st3 = new Studentt("Elena", 2);
        Studentt st4 = new Studentt("Angela", 4);
        Studentt st5 = new Studentt("Rustam", 3);
        treeSet1.add(st1);
        treeSet1.add(st2);
        treeSet1.add(st3);
        treeSet1.add(st4);
        treeSet1.add(st5);
        System.out.println(treeSet1);


    }
}
class Studentt implements Comparable<Studentt>
{
    String name;
    int course;

    public Studentt(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Studentt other) {
        return this.course - other.course;
    }

    @Override
    public String toString() {
        return "Studentt{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
