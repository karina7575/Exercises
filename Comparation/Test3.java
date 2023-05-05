package Comparation;

import java.util.ArrayList;
import java.util.Collections;


public class Test3
{
    public static void main(String[] args) {
        Employee per1 = new Employee(23, "T", "Y", 12);
        Employee per2 = new Employee(87, "T", "Y", 12);
        Employee per3 = new Employee(65, "T", "Y", 12);
        ArrayList<Employee> rab = new ArrayList<>();
        rab.add(per1);
        rab.add(per2);
        rab.add(per3);
        Collections.sort(rab);
    }
}
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) return 0;
        else if (this.id < anotherEmp.id) return -1;
        else return 1;

    }
}
