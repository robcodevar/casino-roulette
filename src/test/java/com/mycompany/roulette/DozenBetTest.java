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
public class DozenBetTest {
    
    public DozenBetTest() {
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
    public void shouldWinFirstDozenBet() {
        DozenBet dozenBet1 = new DozenBet(123, null, 1);
        Slot slot1 = new Slot(ColorsBet.RED, 12, 1);
        Slot slot2 = new Slot(ColorsBet.RED, 6, 1);
        Slot slot3 = new Slot(ColorsBet.RED, 1, 1);
        Slot slot4 = new Slot(ColorsBet.RED, 0, 1);

        assertEquals(true, dozenBet1.isWinner(slot1));
        assertEquals(true, dozenBet1.isWinner(slot2));
        assertEquals(true, dozenBet1.isWinner(slot3));
        assertEquals(false, dozenBet1.isWinner(slot4));
    }

    @Test
    public void shouldWinSecondDozenBet() {
        DozenBet dozenBet1 = new DozenBet(123, null, 2);

        Slot slot1 = new Slot(ColorsBet.RED, 13, 1);
        Slot slot2 = new Slot(ColorsBet.RED, 22, 1);
        Slot slot3 = new Slot(ColorsBet.RED, 24, 1);
        Slot slot4 = new Slot(ColorsBet.RED, 25, 1);
        Slot slot5 = new Slot(ColorsBet.RED, 12, 1);

        assertEquals(true, dozenBet1.isWinner(slot1));
        assertEquals(true, dozenBet1.isWinner(slot2));
        assertEquals(true, dozenBet1.isWinner(slot3));
        assertEquals(false, dozenBet1.isWinner(slot4));
        assertEquals(false, dozenBet1.isWinner(slot5));
    }

    @Test
    public void shouldWinThirdDozenBet() {
        DozenBet dozenBet1 = new DozenBet(123, null, 3);

        Slot slot1 = new Slot(ColorsBet.RED, 25, 1);
        Slot slot2 = new Slot(ColorsBet.RED, 32, 1);
        Slot slot3 = new Slot(ColorsBet.RED, 36, 1);
        Slot slot4 = new Slot(ColorsBet.RED, 24, 1);

        assertEquals(true, dozenBet1.isWinner(slot1));
        assertEquals(true, dozenBet1.isWinner(slot2));
        assertEquals(true, dozenBet1.isWinner(slot3));
        assertEquals(false, dozenBet1.isWinner(slot4));
    }
}
