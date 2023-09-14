package com.games.blackjack.app;

import com.games.blackjack.Dealer;

import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private final Scanner scanner = new Scanner(System.in);

    public void execute() {
        welcome();
        int numPlayers = promotForNumPlayers();
        promptForPlayerNames();
        dealer.dealClards();
    }

    private void promptForPlayerNames() {

    }

    private int promotForNumPlayers() {
        return 0;
    }

    private void welcome() {
        System.out.println("Welcome to Blackjack!");
    }
}
