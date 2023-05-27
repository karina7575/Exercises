package Collection;

import java.util.LinkedHashMap;

public class LinkedHashMapEx
{
    public static void main(String[] args)
    {
        LinkedHashMap <Double, Student> lhm =
                new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Roma", "Logov", 1);
        Student st3 = new Student("Anton", "Sidorov", 4);
        Student st4 = new Student("Igor", "Sidorov", 3);
        lhm.put(5.8, st1);
        lhm.put(9.2, st2);
        lhm.put(6.4, st3);
        lhm.put(7.2, st4);
        System.out.println(lhm.get(9.2));
        System.out.println(lhm.get(6.4));
        System.out.println(lhm);
    }
}
