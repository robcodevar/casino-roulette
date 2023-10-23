/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.roulette;

import java.util.ArrayList;
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
public class CruppierTest {
    Cruppier cruppier;
    
    public CruppierTest() {
        cruppier = new Cruppier();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        cruppier = new Cruppier();
    }
    
    @AfterEach
    public void tearDown() {
    }

        @Test
    public void shouldDeletePlayersWithNocredits() {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("A", 100));
        players.add(new Player("B", 0));
        players.add(new Player("C", 100));

        cruppier.removePlayersWithNoCredits(players);

        assertEquals(2, players.size());
    }

    @Test
    public void shouldNoDeletePlayersWithCredits() {
        ArrayList<Player> players = new ArrayList<>();

        players.add(new Player("A", 100));
        players.add(new Player("B", 200));
        players.add(new Player("C", 100));

        cruppier.removePlayersWithNoCredits(players);

        assertEquals(3, players.size());
    }

    @Test
    public void shouldReceiveBets() {
        ArrayList<Player> players = new ArrayList<>();

        float casinoCredits = cruppier.getCasinoCredits();

        Player p1 = new Player("Jhonn", 100);
        p1.createEvenBet(10);
        casinoCredits += 10;
        players.add(p1);

        Player p2 = new Player("Dave", 100);
        p2.createOddBet(10);
        casinoCredits += 10;
        players.add(p2);

        cruppier.receiveBets(players);

        assertEquals(casinoCredits, cruppier.getCasinoCredits());
    }

    @Test
    public void shouldRemovePlayersWithInvalidBets() {
        ArrayList<Player> players = new ArrayList<>();
        Player p1 = new Player("Alice", 100);
        p1.createEvenBet(0);
        players.add(p1);
        Player p2 = new Player("Bob", 100);
        p2.createEvenBet(-10);
        players.add(p2);
        Player p3 = new Player("Charlie", 100);
        p3.createEvenBet(5000);
        players.add(p3);
        Player p4 = new Player("Dave", 100);
        p4.createOddBet(50);
        players.add(p4);

        cruppier.verifyBets(players);

        assertEquals(1, players.size());
        assertEquals("Dave", players.get(0).name);
    }
    
}
