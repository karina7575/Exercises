package Generics.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Players>
{
    private String name;
    private List <T> playerss = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }

    public void addNewPlayer(T player)
    {
        playerss.add(player);
        System.out.println("V komandu " + name + " bil dobavlen novyy uchasnik " + player.getName());
    }
    public void playWith(Team<T> team)
    {
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) winnerName = this.name;
        else winnerName = team.name;
        System.out.println(winnerName + "WIN!");
    }
}
