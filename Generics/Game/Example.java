package Generics.Game;

public class Example
{
    public static void main(String[] args)
    {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mari", 15);
        Students student1 = new Students("Miha", 18);
        Students student2 = new Students("Yana", 21);
        Employeee emp1 = new Employeee("Dima", 43);
        Employeee emp2 = new Employeee("Dasha", 27);
        Team schoolarTeam = new Team ("Dragons");
        schoolarTeam.addNewPlayer(schoolar1);
        schoolarTeam.addNewPlayer(schoolar2);
        Team studentTeam = new Team ("Diamonds");
        studentTeam.addNewPlayer(student1);
        studentTeam.addNewPlayer(student2);
        Team employeeTeam = new Team ("Pigs");
        employeeTeam.addNewPlayer(emp1);
        employeeTeam.addNewPlayer(emp2);

        Schoolar schoolar3 = new Schoolar("Richard", 10);
        Schoolar schoolar4 = new Schoolar("Liza", 18);
        Team schoolarTeam2 = new Team ("Boobs");
        schoolarTeam2.addNewPlayer(schoolar3);
        schoolarTeam2.addNewPlayer(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);

    }

}