package com.factoriaf5.rps.models;

public class Rock {
    public String getName() {
        return "Rock";
    }
    public String whoWins(Scissors opt) {
        return "Rock win Scissors. You win!";
    }
    public String whoWins(Lizard opt) {
        return "Rock win Lizard. You win!";
    }
    public String whoWins(Paper opt) {
        return "Paper win Rock. You lose!";
    }
    public String whoWins(Spock opt) {
    return "Spock win rock. You lose!";
    }
    public String whoWins(Rock opt) {
    return "It's a tie!";
    }

}
