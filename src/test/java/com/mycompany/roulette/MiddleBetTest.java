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
public class MiddleBetTest {

    public MiddleBetTest() {
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
    public void shouldReturnTrueForWinningNumberInMiddle() {
        MiddleBet bet = new MiddleBet(10, null, 1);

        Slot slot = new Slot(ColorsBet.RED, 2, 1);

        assertTrue(bet.isWinner(slot));
    }

    @Test
    public void shouldReturnFalseForWinningNumberNotInMiddle() {
        MiddleBet bet = new MiddleBet(10, null, 2);

        Slot slot = new Slot(ColorsBet.RED, 2, 1);

        assertFalse(bet.isWinner(slot));
    }

}
