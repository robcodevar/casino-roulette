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
public class RowBetTest {

    public RowBetTest() {
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
    public void shouldWinRowBet() {
        Slot slot1 = new Slot(ColorsBet.RED, 3, 1);
        Slot slot2 = new Slot(ColorsBet.BLACK, 2, 2);
        Slot slot3 = new Slot(ColorsBet.RED, 1, 3);

        RowBet rowBet1 = new RowBet(123, null, 1);

        assertEquals(true, rowBet1.isWinner(slot1));
        assertEquals(false, rowBet1.isWinner(slot2));
        assertEquals(false, rowBet1.isWinner(slot3));
    }
}
