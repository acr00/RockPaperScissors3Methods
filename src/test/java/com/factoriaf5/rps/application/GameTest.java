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

}
