/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;

/**
 * Write a description of class Table here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class Table {
    public ArrayList<Player> players;
    public Cruppier cruppier;
    private Roulette roulette;
    private int currentTurn;
    public Stadistics stadistics;

    private javax.swing.JLabel colorMostFrecuentLabel;
    private javax.swing.JLabel numberMostFrecuentLabel;

    public Table(javax.swing.JLabel colorMostFrecuentLabel, javax.swing.JLabel numberMostFrecuentLabel) {
        players = new ArrayList<Player>();
        cruppier = new Cruppier();
        roulette = new Roulette();
        stadistics = new Stadistics();
        currentTurn = -1;

        this.colorMostFrecuentLabel = colorMostFrecuentLabel;
        this.numberMostFrecuentLabel = numberMostFrecuentLabel;
    }

    public void addPlayer(String name, float credits) {
        Player player = new Player(name, credits);
        players.add(player);
    }

    public ArrayList<Player> showAllPlayers() {
        if (this.players.size() == 0) {
            System.out.println("No hay jugadores en la mesa");
            return null;
        }

        players.forEach(player -> System.out.println(player.toString()));
        return players;
    }

    public void startGame() {
        // 1. El crupier recibe las apuestas de los jugadores
        cruppier.receiveBets(players);
        // 2. El crupier gira la ruleta
        Slot result = roulette.spin();
        stadistics.addResult(result);
        // 3. El crupier anuncia el resultado
        cruppier.handleRoulleteResult(result, players);
        // 4. El crupier paga a los ganadores
        cruppier.payBets(players);
        updateStadistics();
    }

    public void updateStadistics() {
        colorMostFrecuentLabel.setText("COLOR MAS FRECUENTE: " + stadistics.getMostFrecuentColor());
        numberMostFrecuentLabel.setText("NUMERO MAS FRECUENTE: " + stadistics.getMostFrecuentNumber());
    }

    public Player endGameTurn() {
        currentTurn += 1;

        if (currentTurn < players.size()) {
            return players.get(currentTurn);
        } else {
            currentTurn = -1;
            return null;
        }

    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}
