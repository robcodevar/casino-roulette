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
public class OddBetTest {

    public OddBetTest() {
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
    public void shouldWinOddBet() {
        OddBet evenBet1 = new OddBet(123, null);
        Slot slot1 = new Slot(ColorsBet.RED, 12, 1);
        Slot slot2 = new Slot(ColorsBet.BLACK, 13, 2);

        assertEquals(true, evenBet1.isWinner(slot2));
        assertEquals(false, evenBet1.isWinner(slot1));
    }
}
