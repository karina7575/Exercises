package NestedClasses.Static_Nested_Class;

public class Car
{
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }
    void method(){
        System.out.println(Engine.countOfObjects);     //так можно из внешнего класса обращаться к static полям внутреннего
        Engine eng = new Engine(200);       //создав объект внутреннего класса, из внешнего класса
        System.out.println(eng.countOfObjects);     //можно обратиться к private полям внутреннего
}
    public static class Engine{                //если он final, то не сможем создать наследника
        private int horsePower;
        static int countOfObjects;

        public Engine(int horsePower) {
            System.out.println(a);             //можно обратиться к private/public static полям внешнего класса
            this.horsePower = horsePower;
            countOfObjects++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(149);        //без создания внешнего класса все работает тоже.
        System.out.println(e);                               //сначала создаем внутренний класс, потом внешний
        Car car = new Car("red", 2, e);
        System.out.println(car);
    }
}
class Example extends Car.Engine
{
    Example(){super(200);}
}
