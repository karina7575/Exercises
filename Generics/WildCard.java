package Generics;
import java.util.ArrayList;
import java.util.List;

//Чтобы написать метод, который будет работать с любыми типами ArrayList
//List<? extends Number> list3 = new ArrayList<Integer> можно
public class WildCard
{
    public static void main(String[] args)
    {

        ArrayList<Double> dbl = new ArrayList<>();
        dbl.add(3.13);
        dbl.add(23.7);
        dbl.add(6.6);
        showListInfo(dbl);
        System.out.println(summ(dbl));
        List<String> strg = new ArrayList<>();
        strg.add("u");
        strg.add("t");
        strg.add("s");
        showListInfo(strg);
    }
    static void showListInfo(List<?> list)
    {
        System.out.println("It contends: " + list);
    }
    public static double summ(ArrayList<? extends Number> a1)
    {
        double summ = 0;
        for(Number n : a1)
        {
            summ +=n.doubleValue();
        }
        return summ;
    }
}
