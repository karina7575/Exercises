package Generics;
// Чтобы поле разных объектов было различного типа
// для одного объекта поле value строчного типа, для другого объекта integer
public class Parametrize
{
    public static void main(String[] args)
    {
       Info<String> info1 = new Info<>("privet");
       System.out.println(info1);
       Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
    }
    //public void abc (Info<String> info)
    //{
    //   String s = info.getValue();
    //}
    //public void abc (Info<Integer> info)
    //{
    //    Integer s = info.getValue();
    //}
}
class Info <T>
{
    private T value;
    public Info(T value)
    {
        this.value = value;
    }
    public String toString()
    {
        return "{[" + value + "]}";
    }
    public T getValue()
    {
        return value;
    }
}
//class Child extends Parent
//{
//    public void abc(Info<String> info)
//    {
//        String s = info.getValue();
//    }
//}
