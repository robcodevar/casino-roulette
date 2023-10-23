/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;

/**
 * Write a description of class stadistics here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class Stadistics {

    private ArrayList<Slot> pastResults;
    private ArrayList<Bet> pastBets;

    public Stadistics() {
        pastResults = new ArrayList<>();
    }

    public void addResult(Slot result) {
        pastResults.add(result);
    }

    public void addBets(ArrayList<Bet> bets) {
        for (Bet bet : bets) {
            pastBets.add(bet);
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
}
