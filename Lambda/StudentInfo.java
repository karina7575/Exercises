package Lambda;


import java.util.ArrayList;

public class StudentInfo
{
    void testStudents(ArrayList<Student> al, StudentChecks sc)
    {
        for(Student s: al)
        {
            if(sc.check(s))
            {
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> a1, double avgGrade)
//    {
//        for(Student s: a1)
//        {
//            if(s.avgGrade>avgGrade)
//            {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> a1, int age)
//    {
//        for(Student s: a1)
//        {
//            if(s.age>age)
//            {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> a1, int age, double avgGrade, char sex)
//    {
//        for(Student s: a1)
//        {
//            if(s.age>age && s.avgGrade < avgGrade && s.sex == sex)
//            {
//                System.out.println(s);
//            }
//        }
//    }
}
class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
        info.testStudents(students, new CheckOverGrade());
        info.testStudents(students, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age<30;
            }
        });
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("-----------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("-----------------------");
//        info.printStudentsMixCondition(students, 20, 9.5, 'f');

    }
}
interface StudentChecks
{
   boolean check(Student s);
}
class CheckOverGrade implements StudentChecks
{
    @Override
    public boolean check(Student s)
    {
        return s.avgGrade>8;
    }
}











