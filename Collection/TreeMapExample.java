package Collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample
{
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
//        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Roma", "Logov", 1);
        Student st3 = new Student("Anton", "Sidorov", 4);
        Student st4 = new Student("Igor", "Sidorov", 3);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 4);
        Student st7 = new Student("Elena", "Sidorova", 3);
        Student st8 = new Student("Elena", "Sidorova", 3);
        treeMap.put(5.8, st1);
        treeMap.put(9.2, st7);
        treeMap.put(6.4, st3);
        treeMap.put(7.2, st6);
        treeMap.put(1.5, st2);
        treeMap.put(8.2, st5);
        treeMap.put(9.1, st4);
        treeMap.put(3.2, st8);                              //ключи не могут повторяться, а значения могут.
        System.out.println(treeMap);                        //если ключ повторится, значение перезапишется
        System.out.println(treeMap.get(6.4));
//        treeMap.remove(7.2);
//        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));    //все значения, ключ которых выше определенного значения
        System.out.println(treeMap.headMap(3.5));    //все значения, ключ которых ниже определенного значения
        System.out.println(treeMap.lastEntry());            //элемент, который находится в конце коллекции(высший ключ)
        System.out.println(treeMap.firstEntry());            //элемент, который находится в начале коллекции(низший ключ)

    }
}

