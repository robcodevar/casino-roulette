/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class Slot here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */
public class Slot {
    private ColorsBet color;
    private int numberTag;
    private int row;

    public Slot(ColorsBet color, int numberTag, int row) {
        this.color = color;
        this.numberTag = numberTag;
        this.row = row;
    }

    public ColorsBet getColor() {
        return color;
    }

    public void setColor(ColorsBet color) {
        this.color = color;
    }

    public int getNumberTag() {
        return numberTag;
    }

    public void setNumberTag(int numberTag) {
        this.numberTag = numberTag;
    }

    public int getRow() {
        return row;
    }

    @Override
    public String toString() {
        return "Slot: " + color + " " + numberTag + " " + row;
    }
}
