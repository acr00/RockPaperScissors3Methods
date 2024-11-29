package com.factoriaf5.rps.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SpockTest {
    @Test
    public void testGetName() {
        Spock spock = new Spock();
        assertEquals("Spock", spock.getName());
    }
    @Test
    public void testWhoWinsAgainstRock() {
        Spock spock = new Spock();
        Rock rock = new Rock();

        String result = spock.whoWins(rock);
        assertEquals("Spock win Rock. You win!", result);
    }
    @Test
    public void testWhoWinsAgainstPaper() {
        Spock spock = new Spock();
        Paper paper = new Paper();

        String result = spock.whoWins(paper);
        assertEquals("Paper win Spock. You lose!", result);
    }
    @Test
    public void testWhoWinsAgainstScissors() {
        Spock spock = new Spock();
        Scissors scissors = new Scissors();
        
        String result = spock.whoWins(scissors);
        assertEquals("Spock win Scissors. You win!", result);
    }
    @Test
    public void testWhoWinsAgainstLizard() {
        Spock spock = new Spock();
        Lizard lizard = new Lizard();

        String result = spock.whoWins(lizard);
        assertEquals("Lizard win Spock. You lose!", result);
    }
    @Test
    public void testWhoWinsAgainstSpock() {
        Spock spock1 = new Spock();
        Spock spock2 = new Spock();

        String result = spock1.whoWins(spock2);
        assertEquals("It's a tie!", result);
    }
}