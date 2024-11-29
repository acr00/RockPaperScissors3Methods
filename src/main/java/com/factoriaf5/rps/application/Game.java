package com.factoriaf5.rps.application;


import com.factoriaf5.rps.models.*;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Rock-Paper-Scissors game!");
        System.out.println("Choose your weapon: rock, paper, or scissors");

        String playerChoice = scanner.nextLine();
        String computerChoice = generateComputerChoice
        (playerChoice
        );
        System.out.println("Computer chose: " + computerChoice
        );
        System.out.println("You chose: " + playerChoice
        );
        System.out.println("Result: " + determineWinner(playerChoice, computerChoice));

        scanner.close();
        
        }

        public static String generateComputerChoice(String playerChoice) {
            String[] choices = {"rock", "paper", "scissors"};
            int randomIndex = (int) (Math.random() * choices.length);
            return choices[randomIndex];
            }
            public static String determineWinner(String playerChoice, String computerChoice) {
                if (playerChoice.equals(computerChoice)) {

                    return "It's a tie";

                    } else if ((playerChoice.equals("rock") && 
                    computerChoice.equals("scissors")) ||
                     (playerChoice.equals("scissors") && 
                     computerChoice.equals("paper")) || 
                     (playerChoice.equals("paper") && 
                     computerChoice.equals("rock"))) 

                     {
                        return "You win!";

                     } else

                        {
                            return "Computer wins!";
                        }



    }

 }

