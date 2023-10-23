/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class DozenBet here.
 * 
 * @author Fernando Quinteros
 * @version 1.0
 */
public class DozenBet extends Bet {
    private int dozenNumber;

    public DozenBet(float credits, Player player, int dozenNumber) {
        super(credits, player, 3);
        this.dozenNumber = dozenNumber;
    }

    public int getDozenNumber() {
        return dozenNumber;
    }

    @Override
    public boolean isWinner(Slot slot) {
        int resultDozen = 0;
        int result = slot.getNumberTag();

        if (result >= 1 && result <= 12) {
            resultDozen = 1;
        } else if (result >= 13 && result <= 24) {
            resultDozen = 2;
        } else if (result >= 25) {
            resultDozen = 3;
        }

        if (resultDozen == this.dozenNumber) {
            return true;
        }

        return false;
    }
}
