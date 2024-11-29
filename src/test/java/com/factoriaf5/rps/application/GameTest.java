package com.factoriaf5.rps.application;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.factoriaf5.rps.factories.*;
import com.factoriaf5.rps.models.*;

public class GameTest {

    Move winner;
    Move option1;
    Move option2;
    Game game = new Game();
    Paper paper;
    Rock rock;
    Spock spock;
    Lizard lizard;
    Scissors scissors;

    @BeforeEach
    public void beforeEach(){
        MoveFactory moveFactory;
        moveFactory = new PaperFactory();
        paper = ((Paper)moveFactory.createMove());
        moveFactory = new RockFactory();
        rock = ((Rock)moveFactory.createMove());
        moveFactory = new ScissorsFactory();
        scissors = ((Scissors)moveFactory.createMove());
        moveFactory = new LizardFactory();
        lizard = ((Lizard)moveFactory.createMove());
        moveFactory = new SpockFactory();
        spock = ((Spock)moveFactory.createMove());
        winner = null;
        option1 = null;
        option2 = null;
    }

    @Test
    public void option1ScissorsWinsPaper() {
        option1 = scissors;
        option2 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1ScissorsWinsLizard() {
        option1 = scissors;
        option2 = lizard;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1RockWinsScissors() {
        option1 = rock;
        option2 = scissors;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1RockWinsLizard() {
        option1 = rock;
        option2 = lizard;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1PaperWinsRock() {
        option1 = paper;
        option2 = rock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1PaperWinsSpock() {
        option1 = paper;
        option2 = spock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1LizardWinsSpock() {
        option1 = lizard;
        option2 = spock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1LizardWinsPaper() {
        option1 = lizard;
        option2 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1SpockWinsRock() {
        option1 = spock;
        option2 = rock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option1SpockWinsScissors() {
        option1 = spock;
        option2 = scissors;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option1, winner);
    }

    @Test
    public void option2ScissorsWinsPaper() {
        option2 = scissors;
        option1 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2ScissorsWinsLizard() {
        option2 = scissors;
        option1 = lizard;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2RockWinsScissors() {
        option2 = rock;
        option1 = scissors;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2RockWinsLizard() {
        option2 = rock;
        option1 = lizard;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2PaperWinsRock() {
        option2 = paper;
        option1 = rock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2PaperWinsSpock() {
        option2 = paper;
        option1 = spock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2LizardWinsSpock() {
        option2 = lizard;
        option1 = spock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2LizardWinsPaper() {
        option2 = lizard;
        option1 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2SpockWinsRock() {
        option2 = spock;
        option1 = rock;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2SpockWinsScissors() {
        option2 = spock;
        option1 = scissors;
        winner = game.evaluateGameWinner(option1, option2);
        assertEquals(option2, winner);
    }

    @Test
    public void option2ifoption1isNotWinnerAndoption2isNotWinner_ThereIsADraw() {
        option1 = paper;
        option2 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertTrue(null == winner);
    }

    @Test
    public void option2ifAnyHandIsNull_thereIsNoWinner() {
        option2 = paper;
        winner = game.evaluateGameWinner(option1, option2);
        assertTrue(null == winner);
        option1 = paper;
        option2 = null;
        winner = game.evaluateGameWinner(option1, option2);
        assertTrue(null == winner);
    }
}
