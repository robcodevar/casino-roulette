/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class RowBet here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class RowBet extends Bet {
    private int row;

    public RowBet(float credits, Player player, int row) {
        super(credits, player, 3);
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    @Override
    public boolean isWinner(Slot slot) {
        if (slot.getRow() == this.row) {
            return true;
        }

        return false;
    }

    @Override
    public String getType() {
        return "Fila " + this.row;
    }
}
