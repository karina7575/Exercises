package Collection;

import Generics.Game.Employeee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary
{
    public static void main(String[] args)
    {
        //просто с листом цифр
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(-3);
        arrlist.add(8);
        arrlist.add(12);
        arrlist.add(-8);
        arrlist.add(0);
        arrlist.add(5);
        arrlist.add(10);
        arrlist.add(1);
        arrlist.add(150);
        arrlist.add(-30);
        arrlist.add(19);
        Collections.sort(arrlist);
        //Collections.reverse(arrlist);
        //Collections.shuffle(arrlist);
        int index1 = Collections.binarySearch(arrlist, 12);
        System.out.println(index1);


        //с листом объектов
        Employee emp1 = new Employee(100, "Zaur", 12345);
        Employee emp2 = new Employee(15, "Ivan", 6542);
        Employee emp3 = new Employee(123, "Petr", 8543);
        Employee emp4 = new Employee(15, "Mariya", 634);
        Employee emp5 = new Employee(182, "Kolya", 158);
        Employee emp6 = new Employee(15, "Sasha", 897);
        Employee emp7 = new Employee(250, "Elena", 564);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        empList.add(emp6);
        empList.add(emp7);
        System.out.println(empList);
        Collections.sort(empList);
        System.out.println(empList);
        int index2 = Collections.binarySearch(empList, new Employee(182, "Kolya", 0));
        System.out.println(index2);


        int []array = {-3,8,12,-8,0,5,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array,150);
        System.out.println(index3);


    }
}


class Employee implements Comparable<Employee>
{
    int id;
    String name;
    int salary;

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.id - anotherEmp.id;
        if(result == 0) {
            return this.name.compareTo(anotherEmp.name);
        }
        return result;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
