package Generics;
// Чтобы объекты класса имели определенные типы поля (здесь все подклассы number)
public class Subtyping
{
    public static void main(String[] args)
    {

        Car<Integer> vol = new Car<>(18);
        System.out.println(vol);
        Car<Double> bug = new Car<>(2.3);
        System.out.println(bug);

    }
}
class Car <T extends Number> {
    private T value;

    public Car(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}