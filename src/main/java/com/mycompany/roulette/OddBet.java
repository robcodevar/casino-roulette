/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class OddBet here.
 * 
 * @author Fernando Quinteros
 * @version 1.0
 */
public class OddBet extends Bet {

    public OddBet(float credits, Player player) {
        super(credits, player, 2);
    }

    @Override
    public boolean isWinner(Slot slot) {
        if (isOdd(slot.getNumberTag())) {
            return true;
        }

        return false;
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    @Override
    public String getType() {
        return "Impar";
    }
}
