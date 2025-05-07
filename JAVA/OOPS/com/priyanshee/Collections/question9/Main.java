package com.priyanshee.Collections.question9;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Priyanshee", 90);
        Player p2 = new Player("Shriya", 89);
        Player p3 = new Player("Parnika", 95);
        Player p4 = new Player("Priya", 98);
        Player p5 = new Player("P", 95);

        Leaderboard board = new Leaderboard();
        board.addPlayer(p1);
        board.addPlayer(p2);
        board.addPlayer(p3);
        board.addPlayer(p4);
        board.addPlayer(p5);

        board.printLeaderboard();
        System.out.println("------------");
        //update the leaderboard
        board.updateScore("Priyanshee", 100);
        board.printLeaderboard();
        //the leaderboard did not update need to refactor the code.
        //why did the leaderboard did not update.
        //Because TreeMap relies on the comparison result at the time of insertion
        // and does not monitor key objects for changes — Java objects don't have
        // built-in change notifications, and TreeMap has no way to know a field
        // used in comparison was modified.
    }
}
