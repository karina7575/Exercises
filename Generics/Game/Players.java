package Generics.Game;

public class Players
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Players (String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
