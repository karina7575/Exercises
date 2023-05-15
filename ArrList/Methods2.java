package ArrList;

import java.util.ArrayList;

public class Methods2
{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 67, 5, 9.5);
        Student st2 = new Student("Nikolay", 'm', 27, 3, 6.7);
        Student st3 = new Student("Alisa", 'f', 1, 1, 8.8);
        Student st4 = new Student("Karina", 'f', 28, 3, 6.3);
        Student st5 = new Student("Irbis", 'm', 4, 4, 1.4);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);
        Student st6 = new Student("Irbis", 'm', 4, 4, 1.4);

        ArrayList<String> L1 = new ArrayList<>();  //добавление всех элементов листа в другой лист,
        ArrayList<String> L2 = new ArrayList<>();  //начиная с определенного индекса
        L1.add("Timofei");
        L1.add("Nina");
        L1.add("Matvei");
        L2.add("^_^");
        L2.add(">_<");
        L2.addAll(1,L1);
        System.out.println(L2);
        L1.clear();                               //очистка листа
        System.out.println(L1);
        int index = studentList.indexOf(st5);     //индекс определенного объекта(если их два, выводится индекс первого
        System.out.println(index);                //lastIndexOf выводит индекс последнего
        System.out.println(L2.size());
        System.out.println(L1.isEmpty());
        System.out.println(studentList.contains(st3));
        System.out.println(L2.toString());


    }
}
class Student
{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
