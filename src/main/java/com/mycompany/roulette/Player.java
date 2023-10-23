/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 * Write a description of class Player here.
 *
 * @author Fernando Quinteros
 * @version 2.0
 */

public class Player {
    private String id;
    public String name;
    private float credits;
    private Bet currentBet;

    public Player(String name, float credits) {
        this.id = name + Math.random();
        this.name = name;
        this.credits = credits;
    }

    public float getCredits() {
        return credits;
    }

    public void addCredits(float credits) {
        this.credits += credits;
    }

    public void removeCredits(float credits) {
        this.credits -= credits;
    }

    public String toString() {
        return "Player: " + name + " - Credits: " + credits;
    }

    public ColorBet createColorBet(ColorsBet color, float credits) {
        ColorBet newBet = new ColorBet(credits, this, color);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public EvenBet createEvenBet(float credits) {
        EvenBet newBet = new EvenBet(credits, this);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public OddBet createOddBet(float credits) {
        OddBet newBet = new OddBet(credits, this);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public RowBet createRowBet(int row, float credits) {
        RowBet newBet = new RowBet(credits, this, row);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public DozenBet createDozenBet(int dozenNumber, float credits) {
        DozenBet newBet = new DozenBet(credits, this, dozenNumber);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public SingleNumberBet createSingleNumberBet(int numberBet, float credits) {
        SingleNumberBet newBet = new SingleNumberBet(credits, this, numberBet);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public MiddleBet createMiddleBet(int middleNumber, float credits) {
        MiddleBet newBet = new MiddleBet(credits, this, middleNumber);
        this.currentBet = newBet;
        removeCredits(credits);

        return newBet;
    }

    public Bet getCurrentBet() {
        return currentBet;
    }

    public String getId() {
        return id;
    }

}