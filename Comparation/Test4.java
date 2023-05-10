package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test4
{
        public static void main(String[] args) {
            Employee1 pers1 = new Employee1(3, "Nina", "Ivanov", 100);
            Employee1 pers2 = new Employee1(2, "Alisa", "Petrov", 150);
            Employee1 pers3 = new Employee1(1, "Tima", "Rybakov", 50);
            ArrayList<Employee1> list1 = new ArrayList<>();
            list1.add(pers1);
            list1.add(pers2);
            list1.add(pers3);
            System.out.println(list1);
            Collections.sort(list1, new idComparator());
            System.out.println(list1);
        }
 }
    class Employee1 implements Comparable<Employee1>{
        int id;
        String name;
        String surname;
        int salary;

        public Employee1(int id, String name, String surname, int salary) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee1{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    '}';
        }

           @Override
           public int compareTo(Employee1 anotherEmp) {
              //return this.id - anotherEmp.id;
               int res = this.name.compareTo(anotherEmp.name);
               if (res == 0) { res = this.surname.compareTo(anotherEmp.surname);}
                  return res;
           }
    }

    class idComparator implements Comparator<Employee1>
    {
        @Override
        public int compare(Employee1 pers1, Employee1 pers2) {
            return pers1.id - pers2.id;
        }
    }

