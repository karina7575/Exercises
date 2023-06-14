
public class Zadachi
{
        public static void main(String args[]) {
            Patient p = new Patient("Sarik", "Egorov", "34957857", 27, 160, 67);
            System.out.println(p);
            System.out.println(p.getBMI(76, 187));
        }

}
class Patient {
    private String firstName;
    private String lastName;
    private String iin;
    private int age;
    private int weight;
    private int height;

    public Patient(String firstName, String lastName, String iin, int age, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iin = iin;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Пациент(" + iin + ", " + firstName + " " + lastName + ", " + age + ')';
    }
    public double getBMI(int weight, int height) {
        return (double)weight/(double)(0.0001*height*height);
    }
}

