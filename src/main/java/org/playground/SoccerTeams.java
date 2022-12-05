package org.playground;

import javax.swing.*;
import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * This program calculates the number of soccer teams
 * that a youth league may create from the number of
 * available players. Input validation is demonstrated
 * with while loops.
 */

public class SoccerTeams {
    public static void main(String[] args) {
        // Minimum players per team
        final int MIN_PLAYERS = 9;
        // Maximum players per team
        final int MAX_PLAYERS = 15;
        // Number of available players
        int players;
        // Number of players per team
        int teamSize;
        // Number of teams
        int teams;
        // Number of leftover players
        int leftOver;
        // To hold the user input
        String input;

        // Get the number of players per team
        input = JOptionPane.showInputDialog("Enter the number of players" +
                " per team.");
        teamSize = Integer.parseInt(input);

        // Validate the number entered.
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS) {
            input = JOptionPane.showInputDialog("The number must be atleast " +
                    MIN_PLAYERS + " and no more than " + MAX_PLAYERS +
                    ".\nEnter the number of players");
            teamSize = Integer.parseInt(input);
        }
        // Get the number of players available.
        input = JOptionPane.showInputDialog("Enter the available number of players");
        players = Integer.parseInt(input);

        // Validate the number entered.
        while (players < 0) {
            input = JOptionPane.showInputDialog("Enter 0 or greater.");
            players = Integer.parseInt(input);
        }

        // Calculate the number of teams
        teams = players / teamSize;

        // Calculate the number of left over players
        leftOver = players % teamSize;

        // Display the result
        JOptionPane.showMessageDialog(null, "There will be " +
                teams + " teams with " + leftOver + " left over.");

        System.exit(0);
    }
}
