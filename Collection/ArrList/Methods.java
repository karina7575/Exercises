package Collection.ArrList;

import java.util.ArrayList;

public class Methods
{
    public static void main(String[] args)
    {
        ArrayList <String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Urii");
        arrayList1.add("Mariya");
        arrayList1.add(1, "Nikita");

        for(String s:arrayList1)             //вывод объектов без скобок
        {
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println(arrayList1.get(2)); //вывод объекта под определенным индексом

        arrayList1.set(1,"Tanya");          //замена объекта в листе
        System.out.println(arrayList1);

        arrayList1.remove(0);         //удаление объекта из листа
        System.out.println(arrayList1);


    }
}
