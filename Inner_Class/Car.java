package Inner_Class;

public class Car
{
    String color;
    int doorCount;
    Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        //this.engine = this.new Engine(horsePower);
    }
    public void setEngine(Engine engine)
    {
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
    public class Engine{                //если он final, то не сможем создать наследника
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
    Car car = new Car("red", 2);
    Car.Engine engine = car.new Engine(150);
    car.setEngine (engine);
    System.out.println(engine);
    System.out.println(car);
    }
}
