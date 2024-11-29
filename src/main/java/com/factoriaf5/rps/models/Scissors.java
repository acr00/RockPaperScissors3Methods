package com.factoriaf5.rps.models;

public class Scissors {
    public String getName() {
        return "Scissors";
    }
    public String whoWins(Paper opt) {
        return "Scissors win Paper. You win!";
    }
    public String whoWins(Scissors opt) {
        return "It's a tie!";
    }
    public String whoWins(Rock opt) {
        return "Rock win Scissors. You lose!";
    }
}
