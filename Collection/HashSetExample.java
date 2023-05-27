package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample
{
    public static void main(String[] args) {
        Set<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(8);
        hashSet1.add(3);
        hashSet1.add(2);
        hashSet1.add(5);
        hashSet1.add(1);
        System.out.println("Set1: " + hashSet1);
        System.out.println(hashSet1.size());
        System.out.println(hashSet1.contains(6));

        Set <Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(8);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(10);
        hashSet2.remove(10);
        System.out.println("Set2: " + hashSet2);
        System.out.println(hashSet2.size());

        Set <Integer> union = new HashSet<>(hashSet1);
        union.addAll(hashSet2);                             //добавление только различающихся элементов
        System.out.println(union);

        Set <Integer> intersect = new HashSet<>(hashSet1);
        intersect.retainAll(hashSet2);                       //вывод общих элементов
        System.out.println(intersect);

        Set <Integer> substract = new HashSet<>(hashSet1);
        substract.removeAll(hashSet2);                       //удаление из 1 сета все элементы второго сета
        System.out.println(substract);
    }
}
