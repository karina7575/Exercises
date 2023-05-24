package Collection.ArrList;

import java.util.ArrayList;
import java.util.List;

public class Methods4
{
    public static void main(String[] args)
    {
        ArrayList<String> arraylist1= new ArrayList<>();
        arraylist1.add("Zina");
        arraylist1.add("Anna");
        arraylist1.add("Urii");
        arraylist1.add("Manya");
        arraylist1.add("Yulia");
        System.out.println(arraylist1);
        List<String> myList = arraylist1.subList(1,4);     //возвращает лист из куска arraylist1
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(arraylist1);

        Object[] array = arraylist1.toArray();
        String[] array2 = arraylist1.toArray(new String[2]);
        for (String s: array2)
        {
            System.out.println(s);
        }

        List<Integer> list1 = List.of(3,6,8);      //добавление элементов в лист без add. Изменить невозможно
        System.out.println(list1);


        ArrayList<String> arraylist2= new ArrayList<>();
        arraylist2.add("Zina");
        arraylist2.add("Anna");
        arraylist2.add("Igor");
        //arraylist1.removeAll(arraylist2);  //удалятся из arraylist1 те элементы, которые есть в arraylist2
        //arraylist1.retainAll(arraylist2);    //останутся в arraylist1 те элементы, которые есть в arraylist2
        //System.out.println(arraylist1);
        //boolean result = arraylist1.containsAll(arraylist2);
        //System.out.println(result);



    }
}
