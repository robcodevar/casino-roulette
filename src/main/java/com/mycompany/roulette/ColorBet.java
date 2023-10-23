/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class ColorBet here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class ColorBet extends Bet {
    ColorsBet colorBet;

    public ColorBet(float credits, Player player, ColorsBet colorBet) {
        super(credits, player, 2);
        this.colorBet = colorBet;
    }

    @Override
    public boolean isWinner(Slot slot) {
        if (slot.getColor() == this.colorBet) {
            return true;
        }

        return false;
    }

    @Override
    public String getType() {
        if (this.colorBet == ColorsBet.BLACK) {
            return "Color Black";
        } else if (this.colorBet == ColorsBet.RED) {
            return "Color Red";
        }

        return "";
    }
}
