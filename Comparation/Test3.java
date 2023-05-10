package Comparation;

import java.util.ArrayList;
import java.util.Collections;


public class Test3
{
    public static void main(String[] args) {
        Employee per1 = new Employee(3, "Nina", "Ivanov", 100);
        Employee per2 = new Employee(2, "Alisa", "Petrov", 150);
        Employee per3 = new Employee(1, "Tima", "Rybakov", 50);
        ArrayList<Employee> rab = new ArrayList<>();
        rab.add(per1);
        rab.add(per2);
        rab.add(per3);
        System.out.println(rab);
        Collections.sort(rab);
        System.out.println(rab);
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
       //return this.id - anotherEmp.id;
        int res = this.name.compareTo(anotherEmp.name);
        if (res == 0) { res = this.surname.compareTo(anotherEmp.surname);}
        return res;
   }
}


