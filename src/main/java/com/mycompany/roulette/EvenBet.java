/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class EvenBet here.
 * 
 * @author Roberto Vargas
 * @version 1.0
 */
public class EvenBet extends Bet {

    public EvenBet(float credits, Player player) {
        super(credits, player, 2);
    }

    @Override
    public boolean isWinner(Slot slot) {
        if (isEven(slot.getNumberTag())) {
            return true;
        }

        return false;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }

    @Override
    public String getType() {
        return "Par";
    }
}
