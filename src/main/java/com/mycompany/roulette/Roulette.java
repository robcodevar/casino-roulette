/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import com.mycompany.GUI.Mesa;
import java.util.ArrayList;

/**
 * Write a description of class Roulette here.
 *
 * @author Fernando Quinteros
 * @version (a version number or a date)
 */
public class Roulette {

    private int SLOTS_AMOUNT = 36;
    private int[] BLACK_NUMBERS = {
        2, 4, 6, 8, 10,
        11, 13, 15, 17, 20,
        22, 24, 26, 28, 29,
        31, 33, 35
    };

    private ArrayList<Slot> slots;
    public Slot currentSlot;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Mesa t = new Mesa();
        t.setVisible(true);
    }

    public Roulette() {
        this.slots = new ArrayList<Slot>();
        createSlots(this.SLOTS_AMOUNT);
    }

    private void createSlots(int slotsAmount) {
        int row = 3;

        for (int i = 0; i < slotsAmount; i++) {
            Slot newSlot = null;

            if (i == 0) {
                newSlot = new Slot(ColorsBet.GREEN, i, 0);
                currentSlot = newSlot;
            } else {
                newSlot = new Slot(ColorsBet.RED, i, row);
                row--;
            }

            if (row < 1) {
                row = 3;
            }

            this.slots.add(newSlot);
        }

        for (int i = 0; i < BLACK_NUMBERS.length; i++) {
            Slot slot = this.slots.get(BLACK_NUMBERS[i]);
            slot.setColor(ColorsBet.BLACK);
        }
    }

    public Slot spin() {
        Random<Slot> random = new Random<Slot>();
        Slot choiseSlot = random.choiseItemList(this.slots);
        currentSlot = choiseSlot;
        return choiseSlot;
    }
}
