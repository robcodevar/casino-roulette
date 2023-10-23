/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;

/**
 * Write a description of class Random here.
 *
 * @author Fernando Quinteros
 * @version 1.0
 */

public class Random<T> {
    public int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public T choiseItemList(ArrayList<T> list) {
        int index = getRandomNumber(0, list.size() - 1);
        return list.get(index);
    }
}
