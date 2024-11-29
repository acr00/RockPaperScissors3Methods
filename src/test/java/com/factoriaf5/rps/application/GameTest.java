package com.factoriaf5.rps.application;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.factoriaf5.rps.models.*;

public class GameTest {
    public void testRockBeatsScissors() {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();
        assertEquals("Rock win Scissors. You win!", rock.whoWins(scissors));
    }
    @Test
    public void testPaperBeatsRock() {
        Paper paper = new Paper();
        Rock rock = new Rock();
        assertEquals("Paper win Rock. You win!", paper.whoWins(rock));
    }
    @Test
    public void testScissorsBeatsPaper() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();
        assertEquals("Scissors win Paper. You win!", scissors.whoWins(paper));
    }

    @Test
    public void testRockLosesToPaper() {
        Rock rock = new Rock();
        Paper paper = new Paper();
        assertEquals("Rock lose to Paper. Computer wins!", rock.whoWins(paper));
    
    }
    @Test
    public void testPaperLosesToScissors() {
        Paper paper = new Paper();
        Scissors scissors = new Scissors();
        assertEquals("Paper lose to Scissors. Computer wins!", paper.whoWins(scissors));
        
    }
    @Test
    public void testScissorsLosesToRock() {
        Scissors scissors = new Scissors();
        Rock rock = new Rock();
        assertEquals("Scissors lose to Rock. Computer wins!", scissors.whoWins(rock));
            
    }
               
}

