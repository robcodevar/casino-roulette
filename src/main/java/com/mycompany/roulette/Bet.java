/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class Bet here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public abstract class Bet {
    public Player player;
    public float credits;

    private int earningMultiplier;
    private boolean isWinner;

    public Bet(float credits, Player player, int earningMultiplier) {
        this.credits = credits;
        this.player = player;
        this.isWinner = false;
        this.earningMultiplier = earningMultiplier;
    }

    public boolean getIsWinner() {
        return isWinner;
    }

    public void setWinner(boolean isWinner) {
        this.isWinner = isWinner;
    }

    public int getEarningMultiplier() {
        return earningMultiplier;
    }

    public boolean isWinner(Slot slot) {
        return false;
    }

    public String getType() {
        return "";
    }
}