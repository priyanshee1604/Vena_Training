package com.priyanshee.Collections.question12;

public class Main {
  public static void main(String[] args) {
    VotingSystem batch1 = new VotingSystem();

    batch1.vote("Priyanshee");
    batch1.vote("Priyanshee");
    batch1.vote("Priyanshee");
    batch1.vote("Priyanshee");
    batch1.vote("Priyansh");
    batch1.vote("Priyansh");
    batch1.vote("Shee");
    batch1.vote("Shee");
    batch1.vote("Riyanshee");
    batch1.vote("Shee");

    batch1.printResults();
  }
}
