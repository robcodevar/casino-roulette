/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.roulette;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fernando
 */
public class ColorBetTest {

    public ColorBetTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void shouldWinRedBet() {
        Slot slot1 = new Slot(ColorsBet.RED, 12, 1);
        Slot slot2 = new Slot(ColorsBet.BLACK, 13, 2);

        ColorBet colorBet1 = new ColorBet(123, null, ColorsBet.RED);

        assertEquals(true, colorBet1.isWinner(slot1));
        assertEquals(false, colorBet1.isWinner(slot2));
    }

    @Test
    public void shouldWinBlackBet() {
        Slot slot1 = new Slot(ColorsBet.RED, 12, 1);
        Slot slot2 = new Slot(ColorsBet.BLACK, 13, 2);

        ColorBet colorBet1 = new ColorBet(123, null, ColorsBet.BLACK);

        assertEquals(true, colorBet1.isWinner(slot2));
        assertEquals(false, colorBet1.isWinner(slot1));
    }

}
