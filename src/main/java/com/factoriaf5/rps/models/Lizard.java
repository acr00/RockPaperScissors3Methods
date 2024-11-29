package com.factoriaf5.rps.models;

public class Lizard {
    public String getName() {
        return "Lizard";
    }
    public String whoWins(Rock opt) {
        return "Rock win Lizard. You lose!";
    }
    public String whoWins(Scissors opt) {
        return "Scissors win Lizard. You lose!";
    }
    public String whoWins(Spock opt) {
        return "Lizard win Spock. You win!";
    }
    public String whoWins(Paper opt) {
        return "Lizard win Paper. You win!";
    }
    public String whoWins(Lizard opt) {
        return "It's a tie!";
    }
}