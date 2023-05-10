package Generics;

import java.util.ArrayList;
import java.util.List;

public class Gen
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("Prinvet");
        list.add("Poka");
        list.add("ok");
        list.add("tyryty");

        for(Object o: list)
        {
            System.out.println(o+" dlina " + ((String)o).length());

        }

    }
}
