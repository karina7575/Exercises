package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(12, "Maksim");
        map1.put(345, "Mark");
        map1.put(56, "Mamix");
        map1.put(77, "Kerry");
        map1.putIfAbsent(77, "Kerry");   //добавляет если ключ не был использован ранее
        map1.put(null, "Manya");
        map1.put(45, null);
        System.out.println(map1);
        System.out.println(map1.get(345));  //вывод значения опеределнного ключа
        map1.remove(56);               //удаление элемента под опр. ключом
        System.out.println(map1.containsValue("Manya"));  //проверка есть ли значение
        System.out.println(map1.containsKey(55));         //проверка есть ли ключ
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        


    }
}
