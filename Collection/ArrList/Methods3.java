package Collection.ArrList;


import java.util.Arrays;
import java.util.List;

public class Methods3
{
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("A");
        StringBuilder str2 = new StringBuilder("B");
        StringBuilder str3 = new StringBuilder("C");
        StringBuilder str4 = new StringBuilder("D");
        StringBuilder[] array = {str1, str2, str3, str4};
        List<StringBuilder> list = Arrays.asList(array);      //если в массиве array меняются
        System.out.println(list);                             // элементы, они меняются и в листе list
        //array[0].append("!!!");
        array[0] = new StringBuilder("F");
        System.out.println(list);
    }
}
