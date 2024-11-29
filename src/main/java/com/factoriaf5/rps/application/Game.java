package com.factoriaf5.rps.application;

import com.factoriaf5.rps.models.Move;

public class Game {
    public Move evaluateGameWinner(Move option1,Move option2){
        return option1==null||option2==null?
        null:
        option1.beats(option2)?
        option1:
        option2.beats(option1)?
        option2:
        null;
    }
}
