package com.factoriaf5.rps.models;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LizardTest {
    @Test
    public void testGetName() {
        Lizard lizard = new Lizard();
       
        assertEquals("Lizard", lizard.getName());
    }
    @Test
    public void testWhoWinsAgainstRock() {
        Lizard lizard = new Lizard();
        Rock rock = new Rock();
        
        
        String result = lizard.whoWins(rock);
        assertEquals("Rock win Lizard. You lose!", result);
    }
    @Test
    public void testWhoWinsAgainstPaper() {
        Lizard lizard = new Lizard();
        Paper paper = new Paper();
        
        
        String result = lizard.whoWins(paper);
        assertEquals("Lizard win Paper. You win!", result);
    }
    @Test
    public void testWhoWinsAgainstScissors() {
        Lizard lizard = new Lizard();
        Scissors scissors = new Scissors();
        
       
        String result = lizard.whoWins(scissors);
        assertEquals("Scissors win Lizard. You lose!", result);
    }
    @Test
    public void testWhoWinsAgainstSpock() {
        Lizard lizard = new Lizard();
        Spock spock = new Spock();
        
      
        String result = lizard.whoWins(spock);
        assertEquals("Lizard win Spock. You win!", result);
    }
    @Test
    public void testWhoWinsAgainstLizard() {
        Lizard lizard1 = new Lizard();
        Lizard lizard2 = new Lizard();
        
       
        String result = lizard1.whoWins(lizard2);
        assertEquals("It's a tie!", result);
    }

}