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
public class RouletteTest {

    public RouletteTest() {
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
