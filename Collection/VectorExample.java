package Collection;

import java.util.Vector;

public class VectorExample
{
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Alisa");
        vec.add("Olga");
        vec.add("Masha");
        vec.add("Sonya");
        System.out.println(vec);
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        vec.remove(2);
        System.out.println(vec);
        System.out.println(vec.get(2));

    }
}
