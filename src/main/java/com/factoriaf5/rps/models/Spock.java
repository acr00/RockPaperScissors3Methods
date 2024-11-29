package com.factoriaf5.rps.models;

public class Spock {
    public String getName() {
        return "Spock";
    }
    public String whoWins(Rock opt) {
        return "Spock win Rock. You win!";
    }
    public String whoWins(Paper opt) {
        return "Paper win Spock. You lose!";
    }
    public String whoWins(Scissors opt) {
        return "Spock win Scissors. You win!";
    }
    public String whoWins(Lizard opt) {
        return "Lizard win Spock. You lose!";
    }
    public String whoWins(Spock opt) {
        return "It's a tie!";
    }
}