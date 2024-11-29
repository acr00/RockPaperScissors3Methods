package com.factoriaf5.rps.models;

public class Rock {
    public String getName() {
        return "Rock";
    }
    public String whoWins(Scissors opt) {
        return "Rock win Scissors. You win!";
    }
    public String whoWins(Rock opt) {
        return "It's a tie!";
    }
    public String whoWins(Paper opt) {
        return "Paper win Rock. You lose!";
    }
    
}
