import java.util.ArrayList;
import java.util.List;
public class Example
{
    public static void main(String[] args) {
        List animals = new ArrayList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

        List<String> animals2 = new ArrayList<String>();
        animals2.add("Catt");
        animals2.add("Dogg");
        animals2.add("Frogg");
        String animal2 = animals2.get(1);
        System.out.println(animal2);

    }
}
