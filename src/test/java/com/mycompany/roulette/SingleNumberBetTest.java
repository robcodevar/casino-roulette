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
public class SingleNumberBetTest {

    public SingleNumberBetTest() {
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
    public void shouldWinSingleNumber() {
        Slot slot1 = new Slot(ColorsBet.BLACK, 13, 2);
        SingleNumberBet singleNu1 = new SingleNumberBet(123, null, 13);

        assertEquals(true, singleNu1.isWinner(slot1));
    }

    @Test
    public void shouldNotWinSingleNumber() {
        Slot slot1 = new Slot(ColorsBet.BLACK, 0, 2);
        SingleNumberBet singleNu1 = new SingleNumberBet(123, null, 13);

        assertEquals(false, singleNu1.isWinner(slot1));
    }

}
