package com.priyanshee.Collections.question9;

import java.util.Objects;

public class Player {
    private final String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //-----------------------
    //no need to override equals and hashcode here:
    // Reason: because the methods is correctly implemented in the
    //AbstractSet which checks for the value equality, so whenever we call
    //equals method on the TreeSet the inherited method is invoked.
    //THUS, NO NEED TO OVERRIDE IT HERE.
    //------------------------
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Player player = (Player) o;
//        return score == player.score && Objects.equals(name, player.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, score);
//    }
}
