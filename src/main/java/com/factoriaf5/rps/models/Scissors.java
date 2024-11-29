package com.factoriaf5.rps.models;

public class Scissors {
    public String getName() {
        return "Scissors";
    }
    public String whoWins(Rock opt) {
        return "Rock win Scissors. You lose!";
    }
    public String whoWins(Spock opt) {
        return "Spock vaporizes Scissors. You lose!";
    }
    public String whoWins(Lizard opt) {
        return "Scissors win Lizard. You win!";
    }
    public String whoWins(Paper opt) {
        return "Scissors win Paper. You win!";
    }
    public String whoWins(Scissors opt) {
        return "It's a tie!";
    }

}
