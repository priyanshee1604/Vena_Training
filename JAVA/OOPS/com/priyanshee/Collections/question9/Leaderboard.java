package com.priyanshee.Collections.question9;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    Set<Player> players = new TreeSet<>(Comparator.comparing(Player::getScore).reversed().thenComparing(Player::getName));

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void updateScore(String name, int newScore) {
        Player toUpdate = null;
        for(Player p: players) {
            if(p.getName().equals(name)){
                toUpdate = p;
                break;
            }
        }

        if(toUpdate != null) {
            players.remove(toUpdate);
            toUpdate.setScore(newScore);
            players.add(toUpdate);
        }
    }

    public void printLeaderboard() {
        for(Player p: players){
            System.out.println(p.getName() + " " + p.getScore());
        }
    }

}
