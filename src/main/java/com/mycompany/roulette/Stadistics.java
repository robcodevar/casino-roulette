/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class stadistics here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class Stadistics {

    private ArrayList<Slot> pastResults;
    private ArrayList<Bet> pastBets;

    private Map<String, Float> earningsByPlayer;

    public Stadistics() {
        pastResults = new ArrayList<>();
        earningsByPlayer = new HashMap<>();
    }

    public void addResult(Slot result) {
        pastResults.add(result);
    }

    public void addBets(ArrayList<Bet> bets) {
        for (Bet bet : bets) {
            if (bet == null)
                continue;

            String playerId = bet.player.getId();

            if (bet.getIsWinner()) {
                if (earningsByPlayer.containsKey(playerId)) {
                    float earnings = earningsByPlayer.get(playerId);
                    earnings += bet.credits;

                    earningsByPlayer.put(playerId, earnings);
                } else {
                    earningsByPlayer.put(playerId, bet.credits);
                }
            } else {
                if (earningsByPlayer.containsKey(playerId)) {
                    float earnings = earningsByPlayer.get(playerId);
                    earnings -= bet.credits;
                    earningsByPlayer.put(playerId, earnings);
                } else {
                    earningsByPlayer.put(playerId, 0 - bet.credits);
                }
            }
        }
    }

    public int getMostFrecuentNumber() {
        int[] frecuency = new int[37];
        for (Slot slot : pastResults) {
            frecuency[slot.getNumberTag()]++;
        }

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < frecuency.length; i++) {
            if (frecuency[i] > max) {
                max = frecuency[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public ColorsBet getMostFrecuentColor() {
        int[] frecuency = new int[2];
        for (Slot slot : pastResults) {
            if (slot.getColor() == ColorsBet.RED) {
                frecuency[0]++;
            } else {
                frecuency[1]++;
            }
        }

        if (frecuency[0] > frecuency[1]) {
            return ColorsBet.RED;
        } else {
            return ColorsBet.BLACK;
        }
    }

    public String getPlayerWithMoreEarnigs() {
        String playerId = "";
        float max = 0;
        for (Map.Entry<String, Float> entry : earningsByPlayer.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                playerId = entry.getKey();
            }
        }

        return playerId;
    }

    public String getPlayerWithLessEarnigs() {
        String playerId = "";
        float min = 0;
        for (Map.Entry<String, Float> entry : earningsByPlayer.entrySet()) {
            if (entry.getValue() < min) {
                min = entry.getValue();
                playerId = entry.getKey();
            }
        }

        return playerId;
    }
}
