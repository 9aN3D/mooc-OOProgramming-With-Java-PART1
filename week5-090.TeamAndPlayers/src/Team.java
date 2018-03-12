
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9an3d
 */
public class Team {
    private String name;
    private int maxSize;
    private ArrayList<Player> players;
    
    public Team (String name) {
        this.name = name;
        this.maxSize = 16;
        this.players = new ArrayList<Player>();
    }
    
    public String getName() {
        return name;
    }
    
    public void addPlayer(Player player) {
        if (size() < maxSize) {
            this.players.add(player);
        }
    }
    
    public void printPlayers() {
        //System.out.println("Team: " + getName());
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals() {
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.goals();
        }
        return totalGoals;
    }
}
