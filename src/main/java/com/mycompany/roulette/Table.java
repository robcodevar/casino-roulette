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
    private javax.swing.JLabel playerMoreEarnigsLabel;
    private javax.swing.JLabel playerLessEarnigsLabel;

    public Table(javax.swing.JLabel colorMostFrecuentLabel, javax.swing.JLabel numberMostFrecuentLabel, javax.swing.JLabel playerMoreEarnigsLabel, javax.swing.JLabel playerLessEarnigsLabel) {
        players = new ArrayList<Player>();
        cruppier = new Cruppier();
        roulette = new Roulette();
        stadistics = new Stadistics();
        currentTurn = -1;

        this.colorMostFrecuentLabel = colorMostFrecuentLabel;
        this.numberMostFrecuentLabel = numberMostFrecuentLabel;
        this.playerMoreEarnigsLabel = playerMoreEarnigsLabel;
        this.playerLessEarnigsLabel = playerLessEarnigsLabel;
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
        stadistics.addBets(getBets(players));
        updateStadistics();
    }

    public void updateStadistics() {
        colorMostFrecuentLabel.setText("COLOR MAS FRECUENTE: " + stadistics.getMostFrecuentColor());
        numberMostFrecuentLabel.setText("NUMERO MAS FRECUENTE: " + stadistics.getMostFrecuentNumber());
        playerMoreEarnigsLabel.setText("JUGADOR CON MAS GANANCIAS: " + getPlayerNameById(stadistics.getPlayerWithMoreEarnigs()));
        playerLessEarnigsLabel.setText("JUGADOR CON MENOS GANANCIAS: " + getPlayerNameById(stadistics.getPlayerWithLessEarnigs()));
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

    private ArrayList<Bet> getBets(ArrayList<Player> players) {
        ArrayList<Bet> bets = new ArrayList<>();
        for (Player player : players) {
            bets.add(player.getCurrentBet());
        }

        return bets;
    }

    public String getPlayerNameById(String id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                return player.name;
            }
        }

        return null;
    }

    public int getCurrentTurn() {
        return currentTurn;
    }
}
