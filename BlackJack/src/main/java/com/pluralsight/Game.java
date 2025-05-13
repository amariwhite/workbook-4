package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> players;
    private Deck deck;
    private Scanner scanner;

    public Game() {
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
        deck = new Deck();
        deck.shuffle();
    }

    public void startGame() throws Exception {
        getPlayerName();
        dealCards();
        displayHands();
        determineWinner();
        //game starter
    }

    private void getPlayerName() {
        System.out.println("Enter the name of the players: ");
        String playerNamesAsString = scanner.nextLine();
        String[] playerNames = playerNamesAsString.split(",");

        for (String playerName : playerNames) {
//            System.out.println("Player Name "  + playerName + ":");
            Player player = new Player(playerName);
            players.add(player);
        }
    }

    private void dealCards() {
        for (Player player : players) {
            player.addCard(deck.deal());
            player.addCard(deck.deal());
        }
    }

    private void displayHands() {
        for (Player player : players) {
            System.out.println(player.getName() + "'s Hand: " + player.showHand());
        }
    }
    public void shuffleDeck(){
        deck.shuffle();
    }

    private void determineWinner() throws Exception {
        Player winner = null;
        int winnerValue = 0;

        for (Player player : players) {
            int handValue = player.getHandValue();
            System.out.println(player.getName() + " has a hand value of " + handValue);

            if (handValue <= 21 && handValue > winnerValue) {
                winnerValue = handValue;
                winner = player;
            }
        }
        if (winner != null) {
            System.out.println("The winner is " + winner.getName() + " with a hand value of " + winnerValue);
        } else {
            System.out.println("No one won the game!");
        }
    }
}
