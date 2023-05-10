package Generics;
import java.util.ArrayList;
//метод для различных типов параметра
public class ParameterizedMethod
{
public static void main(String [] args)
{
    ArrayList<String> al1 = new ArrayList<>();
    al1.add("Dig");
    al1.add("Element");
    al1.add("Hope");
    String a = GenMethod.getSecondElement(al1);
    System.out.println(a);
    ArrayList<Integer> al2 = new ArrayList<>();
    al2.add(4);
    al2.add(32);
    al2.add(6);
    Integer b = GenMethod.getSecondElement(al2);
    System.out.println(b);
}
}
class GenMethod
{
    public static <T> T getSecondElement (ArrayList<T> al)
    {
        return al.get(1);
    }
}
