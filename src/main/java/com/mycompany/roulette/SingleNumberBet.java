/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class SingleNumberBet here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class SingleNumberBet extends Bet {
    private int numberBet;

    public SingleNumberBet(float credits, Player player, int numberBet) {
        super(credits, player, 36);
        this.numberBet = numberBet;
    }

    public int getNumberBet() {
        return numberBet;
    }

    @Override
    public boolean isWinner(Slot slot) {
        if (slot.getNumberTag() == this.numberBet) {
            return true;
        }

        return false;
    }
}
