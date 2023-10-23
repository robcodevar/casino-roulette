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
public class PlayerTest {

    public PlayerTest() {
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
    public void shouldCreateColorRedBet() {
        Player player1 = new Player("Jhonn", 300);
        ColorBet bet = player1.createColorBet(ColorsBet.RED, 100);

        assertEquals(100, bet.credits);
        assertEquals(ColorsBet.RED, bet.colorBet);
    }

    @Test
    public void shouldCreateRowBet() {
        Player player1 = new Player("Jhonn", 300);
        RowBet bet = player1.createRowBet(1, 100);

        assertEquals(100, bet.credits);
        assertEquals(1, bet.getRow());
    }

    @Test
    public void shouldCreateEvenBet() {
        Player player1 = new Player("Jhonn", 300);
        EvenBet bet = player1.createEvenBet(100);

        assertEquals("Par", bet.getType());
    }

    @Test
    public void shouldCreateOddBet() {
        Player player1 = new Player("Jhonn", 300);
        OddBet bet = player1.createOddBet(100);

        assertEquals("Impar", bet.getType());
    }

    @Test
    public void shouldCreateDozenBet() {
        Player player1 = new Player("Jhonn", 300);
        DozenBet bet = player1.createDozenBet(1, 100);

        assertEquals(100, bet.credits);
        assertEquals(1, bet.getDozenNumber());
    }

    @Test
    public void shouldCreateSingleNumberBet() {
        Player player1 = new Player("Jhonn", 300);
        SingleNumberBet bet = player1.createSingleNumberBet(1, 100);

        assertEquals(100, bet.credits);
        assertEquals(1, bet.getNumberBet());
    }

    @Test
    public void shouldCreateMiddleBet() {
        Player player1 = new Player("Jhonn", 300);
        MiddleBet bet = player1.createMiddleBet(1, 100);

        assertEquals(100, bet.credits);
        assertEquals(1, bet.middleNumber);
    }

    @Test
    public void shouldAddCredits() {
        Player player1 = new Player("Jhonn", 100);
        player1.addCredits(50);

        assertEquals(150, player1.getCredits());
    }

    @Test
    public void shouldRemoveCredits() {
        Player player1 = new Player("Jhonn", 100);
        player1.removeCredits(50);

        assertEquals(50, player1.getCredits());
    }
}
