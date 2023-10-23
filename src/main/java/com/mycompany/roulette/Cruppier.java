/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * Write a description of class Cruppier here.
 *
 * @author Fernando Quinteros
 * @version 2.0
 */
public class Cruppier {
    private int INITIAL_CASINO_CREDITS = 10000;
    private float casinoCredits;

    public Cruppier() {
        this.casinoCredits = INITIAL_CASINO_CREDITS;
    }

    public String getRules() {
        String rules = "Reglas de la Ruleta Europea:\n\n" +
                "La ruleta europea es un juego de azar que consta de los números del 0 al 36.\n" +
                "Las reglas básicas son las siguientes:\n\n" +
                "1. Los jugadores pueden realizar apuestas en números individuales o en grupos de números.\n" +
                "2. El crupier gira la ruleta y lanza una pequeña bola en dirección opuesta al giro.\n" +
                "3. Cuando la bola se detiene en un número, se determina el número ganador.\n" +
                "4. Si un jugador apostó al número ganador, recibe un pago basado en el tipo de apuesta realizada.\n" +
                "5. Las apuestas se pueden realizar en números pares/impares, rojo/negro, alto/bajo, y otros.\n" +
                "6. El 0 es un número especial, y si la bola cae en el 0, la casa gana todas las apuestas.\n\n" +
                "Estas son las reglas básicas de la ruleta europea. ¡Buena suerte!\n";

        return rules;
    }

    public void receiveBets(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            Bet bet = player.getCurrentBet();
            this.casinoCredits += bet.credits;
        }

        verifyBets(players);
    }

    public void verifyBets(ArrayList<Player> players) {
        for (Player player : players) {
            float betCredits = player.getCurrentBet().credits;
            String message = "";

            if (betCredits <= 0) {
                message = "El jugador " + player.name + " tiene una apuesta invalida de " + betCredits
                        + ". Sacandolo del juego...";
            } else if (betCredits >= 5000) {
                message = "El jugador " + player.name
                        + " tiene una apuesta mayor de 5000 creditos. Sacandolo del juego...";
            } else if (betCredits >= casinoCredits) {
                message = "El jugador " + player.name
                        + " tiene una apuesta mayor a los creditos del casino. Sacandolo del juego...";
            }

            if (!message.isEmpty()) {
                System.out.println(message);
                JOptionPane.showMessageDialog(null, message, "Apuesta invalida", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        players.removeIf(player -> player.getCurrentBet().credits <= 0
                | player.getCurrentBet().credits >= 5000
                | player.getCurrentBet().credits >= casinoCredits);
    }

    public void handleRoulleteResult(Slot slot, ArrayList<Player> players) {
        System.out.println("El resultado de la ruleta es: " + slot.toString());
        JOptionPane.showMessageDialog(null, "El resultado de la ruleta es: " + slot.toString(),
                "Resultado de la ruleta",
                JOptionPane.INFORMATION_MESSAGE);

        // Update Player bet if is winner
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            Bet bet = player.getCurrentBet();

            bet.setWinner(bet.isWinner(slot));
        }
    }

    public void removePlayersWithNoCredits(ArrayList<Player> players) {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.getCredits() <= 0) {
                players.remove(i);
                System.out.println("El jugador " + player.name + " se quedo sin creditos y fue sacado del casino");
                JOptionPane.showMessageDialog(null,
                        "El jugador " + player.name + " se quedo sin creditos y fue sacado del casino",
                        "Jugador eliminado", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void payBets(ArrayList<Player> players) {
        String message = "";
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            Bet bet = player.getCurrentBet();

            // If bet is winner, pay to player, else add credits to casino
            if (bet.getIsWinner()) {
                float playerCredits = calcEarningsByBet(bet);
                player.addCredits(playerCredits);
                casinoCredits -= playerCredits;

                message += "El jugador " + player.name + " gano " + playerCredits + " creditos\n";
            } else {
                message += "El jugador " + player.name + " perdio " + bet.credits + " creditos\n";

            }

        }

        JOptionPane.showMessageDialog(null, message, "Resultado de la ruleta", JOptionPane.INFORMATION_MESSAGE);
        removePlayersWithNoCredits(players);

    }

    private float calcEarningsByBet(Bet bet) {
        float betWinCredits = bet.credits;
        betWinCredits *= bet.getEarningMultiplier();
        return betWinCredits;
    }

    public float getCasinoCredits() {
        return casinoCredits;
    }
}
