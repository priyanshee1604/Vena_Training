package com.priyanshee.Collections.question9;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Leaderboard {
    Set<Player> players = new TreeSet<>(Comparator.comparing(Player::getScore).reversed().thenComparing(Player::getName));
    //Why did we used Name in Comparator: Read todo.md

    public void addPlayer(Player player) {
        players.add(player);
    }

    //---------------------------
    //here if we directly update the score of the player then the TreeSet will not be rearranged automatically
    //because The tree's internal structure and ordering are determined at the time of insertion,
    // based on the compareTo method (or Comparator).
    //After insertion, TreeSet does not "track" changes in the objects that affect their comparison result.
    //Thus, we need to first remove and reinsert so that it can be stored in sorted manner.
    //-----------------------

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
