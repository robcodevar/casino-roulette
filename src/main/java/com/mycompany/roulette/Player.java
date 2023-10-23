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

    public Bet createBet(Bet newBet) {
        this.currentBet = newBet;
        removeCredits(newBet.credits);
        return newBet;
    }

    public ColorBet createColorBet(ColorsBet color, float credits) {
        return (ColorBet) createBet(new ColorBet(credits, this, color));
    }

    public EvenBet createEvenBet(float credits) {
        return (EvenBet) createBet(new EvenBet(credits, this));
    }

    public OddBet createOddBet(float credits) {
        return (OddBet) createBet(new OddBet(credits, this));
    }

    public RowBet createRowBet(int row, float credits) {
        return (RowBet) createBet(new RowBet(credits, this, row));
    }

    public DozenBet createDozenBet(int dozenNumber, float credits) {
        return (DozenBet) createBet(new DozenBet(credits, this, dozenNumber));
    }

    public SingleNumberBet createSingleNumberBet(int numberBet, float credits) {
        return (SingleNumberBet) createBet(new SingleNumberBet(credits, this, numberBet));
    }

    public MiddleBet createMiddleBet(int middleNumber, float credits) {
        return (MiddleBet) createBet(new MiddleBet(credits, this, middleNumber));
    }

    public Bet getCurrentBet() {
        return currentBet;
    }

    public String getId() {
        return id;
    }

}