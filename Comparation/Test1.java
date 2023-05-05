package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alina");
        list.add("Karina");
        list.add("Dasha");
        System.out.println("Before sorting:");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After sorting: ");
        System.out.println(list);
    }
}
