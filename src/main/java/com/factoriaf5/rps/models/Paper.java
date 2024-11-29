package com.factoriaf5.rps.models;

public class Paper {
    public String getName() {
        return "Paper";
    }

    public String whoWins(Lizard opt) {
        return "Lizard win Paper. You lose!";
    } 
    public String whoWins(Scissors opt) {
        return "Scissors win Paper. You lose!";
    }
    public String whoWins(Spock opt) {
        return "Paper win Spock. You win!";
    }
    public String whoWins(Rock opt) {
        return "Paper win Rock. You win!";
    }
    public String whoWins(Paper opt) {
        return "It's a tie!";
    }

}
