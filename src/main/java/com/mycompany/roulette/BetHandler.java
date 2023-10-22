/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bobvo
 */
package com.mycompany.roulette;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class BetHandler {
    private Map<String, TriFunction<Integer, Integer, Boolean>> apuestas = new HashMap<>();
    
    public BetHandler(){
        // Inicializa el mapa de funciones de apuestas
        apuestas.put("betOdd", this::betOdd);
        apuestas.put("betEven", this::betEven);
        apuestas.put("betOneTo18", this::betOneTo18);
        apuestas.put("bet19To36", this::bet19To36);
        apuestas.put("betBlack", this::betBlack);
        apuestas.put("betRed", this::betRed);
        apuestas.put("betFirstDozen", this::betFirstDozen);
        apuestas.put("betScndDozen", this::betScndDozen);
        apuestas.put("betTrdDozen", this::betTrdDozen);
        apuestas.put("betFstRow", this::betFstRow);
        apuestas.put("betSndRow", this::betSndRow);
        apuestas.put("betThrdRow", this::betThrdRow);
        apuestas.put("betZero", this::betZero);
        apuestas.put("betRedOne", this::betRedOne);
        apuestas.put("betRed3", this::betRed3);
        apuestas.put("betRedFive", this::betRedFive);
        apuestas.put("betRedSeven", this::betRedSeven);
        apuestas.put("betRedNine", this::betRedNine);
        apuestas.put("betRedTwelve", this::betRedTwelve);
        apuestas.put("betRedFourteen", this::betRedFourteen);
        apuestas.put("betRed16", this::betRed16);
        apuestas.put("betRed18", this::betRed18);
        apuestas.put("betRed19", this::betRed19);
        apuestas.put("betRed21", this::betRed21);
        apuestas.put("betRed23", this::betRed23);
        apuestas.put("betRed25", this::betRed25);
        apuestas.put("betRed27", this::betRed27);
        apuestas.put("betRed30", this::betRed30);
        apuestas.put("betRed32", this::betRed32);
        apuestas.put("betRed34", this::betRed34);
        apuestas.put("betRed36", this::betRed36);
        apuestas.put("betBlack2", this::betBlack2);
        apuestas.put("betBlack4", this::betBlack4);
        apuestas.put("betBlack6", this::betBlack6);
        apuestas.put("betBlack8", this::betBlack8);
        apuestas.put("betBlack10", this::betBlack10);
        apuestas.put("betBlack11", this::betBlack11);
        apuestas.put("betBlack13", this::betBlack13);
        apuestas.put("betBlack15", this::betBlack15);
        apuestas.put("betBlack17", this::betBlack17);
        apuestas.put("betBlack20", this::betBlack20);
        apuestas.put("betBlack22", this::betBlack22);
        apuestas.put("betBlack24", this::betBlack24);
        apuestas.put("betBlack26", this::betBlack26);
        apuestas.put("betBlack28", this::betBlack28);
        apuestas.put("betBlack29", this::betBlack29);
        apuestas.put("betBlack31", this::betBlack31);
        apuestas.put("betBlack33", this::betBlack33);
        apuestas.put("betBlack35", this::betBlack35);
    }
    
    private boolean betRedOne(int x , int y){
        int ax = 106;
        int ay = 145;
        int gx = 137;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Red one");
        }
        return res;
    }
    private boolean betRed3(int x , int y){
        int ax = 106;
        int ay = 48;
        int gx = 137;
        int gy = 91;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Red 3");
        }
        return res;
    }
    private boolean betRedFive(int x , int y){
        int ax = 141;
        int ay = 96;
        int gx = 172;
        int gy = 140;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red Five");
        }
        return res;
    }
    
    private boolean betRedSeven(int x , int y){
        int ax = 175;
        int ay = 145;
        int gx = 205;
        int gy = 188;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Red seven");
        }
        return res;
    }
    
    private boolean betRedNine(int x , int y){
        int ax = 175;
        int ay = 48;
        int gx = 206;
        int gy = 93;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red nine");
        }
        return res;
    }
    
    private boolean betRedTwelve(int x , int y){
        int ax = 209;
        int ay = 48;
        int gx = 241;
        int gy = 93;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red Twelve");
        }
        return res;
    }
    
    private boolean betRedFourteen(int x , int y){
        int ax = 243;
        int ay = 97;
        int gx = 275;
        int gy = 140;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Red 14");
        }
        return res;
    }
    
    private boolean betRed16(int x , int y){
        int ax = 278;
        int ay = 144;
        int gx = 310;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 16");
        }
        return res;
    }  
    private boolean betRed18(int x , int y){
        int ax = 280;
        int ay = 48;
        int gx = 309;
        int gy = 91;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 18");
        }
        return res;
    }
    
    private boolean betRed19(int x , int y){
        int ax = 313;
        int ay = 146;
        int gx = 346;
        int gy = 187;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 19");
        }
        return res;
    }
    
    private boolean betRed21(int x , int y){
        int ax = 312;
        int ay = 48;
        int gx = 345;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 21");
        }
        return res;
    }
    
    private boolean betRed23(int x , int y){
        int ax = 347;
        int ay = 97;
        int gx = 379;
        int gy = 140;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 23");
        }
        return res;
    }
    
    private boolean betRed25(int x , int y){
        int ax = 381;
        int ay = 146;
        int gx = 413;
        int gy = 188;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 25");
        }
        return res;
    }
    
    private boolean betRed27(int x , int y){
        int ax = 381;
        int ay = 48;
        int gx = 414;
        int gy = 91;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 27");
        }
        return res;
    }
    
    private boolean betRed30(int x , int y){
        int ax = 416;
        int ay = 48;
        int gx = 447;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 30");
        }
        return res;
    }
    private boolean betRed32(int x , int y){
        int ax = 450;
        int ay = 97;
        int gx = 483;
        int gy = 141;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 32");
        }
        return res;
    }
    private boolean betRed34(int x , int y){
        int ax = 485;
        int ay = 145;
        int gx = 517;
        int gy = 187;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 34");
        }
        return res;
    }
    private boolean betRed36(int x , int y){
        int ax = 485;
        int ay = 48;
        int gx = 516;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in red 36");
        }
        return res;
    }
    private boolean betBlack2(int x , int y){
        int ax = 107;
        int ay = 97;
        int gx = 138;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 2");
        }
        return res;
    }
    private boolean betBlack4(int x , int y){
        int ax = 141;
        int ay = 145;
        int gx = 172;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 4");
        }
        return res;
    }
    private boolean betBlack6(int x , int y){
        int ax = 141;
        int ay = 49;
        int gx = 172;
        int gy = 93;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 6");
        }
        return res;
    }
    private boolean betBlack8(int x , int y){
        int ax = 175;
        int ay = 97;
        int gx = 207;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 8");
        }
        return res;
    }
    private boolean betBlack10(int x , int y){
        int ax = 209;
        int ay = 145;
        int gx = 242;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 10");
        }
        return res;
    }
    private boolean betBlack11(int x , int y){
        int ax = 211;
        int ay = 97;
        int gx = 241;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 11");
        }
        return res;
    }
    private boolean betBlack13(int x , int y){
        int ax = 244;
        int ay = 145;
        int gx = 275;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 13");
        }
        return res;
    }
    private boolean betBlack15(int x , int y){
        int ax = 244;
        int ay = 97;
        int gx = 276;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 15");
        }
        return res;
    }
    private boolean betBlack17(int x , int y){
        int ax = 279;
        int ay = 97;
        int gx = 310;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 17");
        }
        return res;
    }
    private boolean betBlack20(int x , int y){
        int ax = 313;
        int ay = 97;
        int gx = 346;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 20");
        }
        return res;
    }
    private boolean betBlack22(int x , int y){
        int ax = 348;
        int ay = 145;
        int gx = 380;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 22");
        }
        return res;
    }
    private boolean betBlack24(int x , int y){
        int ax = 350;
        int ay = 97;
        int gx = 379;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 24");
        }
        return res;
    }
    private boolean betBlack26(int x , int y){
        int ax = 382;
        int ay = 97;
        int gx = 415;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 26");
        }
        return res;
    }
    private boolean betBlack28(int x , int y){
        int ax = 416;
        int ay = 145;
        int gx = 448;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 28");
        }
        return res;
    }
    private boolean betBlack29(int x , int y){
        int ax = 416;
        int ay = 97;
        int gx = 448;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 29");
        }
        return res;
    }
    private boolean betBlack31(int x , int y){
        int ax = 451;
        int ay = 145;
        int gx = 483;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 31");
        }
        return res;
    }
    
    private boolean betBlack33(int x , int y){
        int ax = 450;
        int ay = 49;
        int gx = 482;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 33");
        }
        return res;
    }
    private boolean betBlack35(int x , int y){
        int ax = 485;
        int ay = 97;
        int gx = 516;
        int gy = 138;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Black 35");
        }
        return res;
    }
    private boolean betFstRow(int x , int y){
        int ax = 520;
        int ay = 48;
        int gx = 551;
        int gy = 92;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in First Row");
        }
        return res;
    }
    private boolean betSndRow(int x , int y){
        int ax = 520;
        int ay = 97;
        int gx = 551;
        int gy = 142;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Scnd Row");
        }
        return res;
    }
    
    private boolean betThrdRow(int x , int y){
        int ax = 520;
        int ay = 145;
        int gx = 551;
        int gy = 189;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Third Row");
        }
        return res;
    }
    
    private boolean betOdd(int x , int y){
        int ax = 381;
        int ay = 229;
        int gx = 448;
        int gy = 262;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Odds");
        }
        return res;
    }
    
    private boolean betEven(int x , int y){
        int ax = 176;
        int ay = 230;
        int gx = 241;
        int gy = 260;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting in Evens");
        }
        return res;
    }
    private boolean betRed(int x , int y){
        int ax = 243;
        int ay = 230;
        int gx = 309;
        int gy = 261;
        boolean res = false;
        if(verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Bet on Red");
        }
        return res;
    }
    private boolean betBlack(int x , int y){
        int ax = 313;
        int ay = 229;
        int gx = 378;
        int gy = 259;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Bet on Black");
        }   
        return res;
    }
    
    private boolean betOneTo18(int x , int y){
        int ax = 105;
        int ay = 230;
        int gx = 172;
        int gy = 261;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("apuesta de 1 a 18");
        }   
        return res;
    }
    private boolean bet19To36(int x , int y){
        int ax = 451;
        int ay = 230;
        int gx = 516;
        int gy = 261;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Betting from 19 to 36");
        }   
        return res;
    }
    private boolean betFirstDozen(int x , int y){
        int ax = 107;
        int ay = 194;
        int gx = 239;
        int gy = 223;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("First dozen be");
        }   
        return res;
    }
    
    private boolean betScndDozen(int x , int y){
        int ax = 244;
        int ay = 194;
        int gx = 378;
        int gy = 223;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Second Dozen bet");
        }
        return res;
    }
    
    private boolean betTrdDozen(int x , int y){
        int ax = 382;
        int ay = 194;
        int gx = 516;
        int gy = 223;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("Third Dozen bet");
        }  
        return res;
    }
    private boolean betZero(int x , int y){
        int ax = 56;
        int ay = 49;
        int gx = 103;
        int gy = 189;
        boolean res = false;
        if (verifyBet(ax, ay, gx, gy, x, y)){
            res=true;
            System.out.println("apuesta a Cero");
        }
        return res;
    }
    
    private boolean verifyBet(int xMin , int yMin , int xMax , int yMax , int xr , int yr){
        boolean res = false;
        // Se analiza si el valor real de x , esta entre los parametros de X
        if(xr >= xMin  && xr <= xMax){
            // Se analiza si el valor real de y , esta entre los parametros de Y
            if(yr >= yMin && yr <= yMax){
                res = true;
            }
        }
        return res;
    }

    public Map<String, TriFunction<Integer, Integer, Boolean>> getApuestas() {
        return apuestas;
    }
    
    public void clasificarApuesta(int x, int y) {
        for (Map.Entry<String, TriFunction<Integer, Integer, Boolean>> entry : apuestas.entrySet()) {
                String nombreApuesta = entry.getKey();
                TriFunction<Integer, Integer, Boolean> funcionApuesta = entry.getValue();

                if (funcionApuesta.apply(x, y)) {
                    // Se ha seleccionado esta apuesta
                    String mensaje = "Has seleccionado la apuesta: " + nombreApuesta;
                    String cantidadApostada = JOptionPane.showInputDialog(null, mensaje + 
                        "\nIngrese la cantidad a apostar:");
                    if (cantidadApostada != null && !cantidadApostada.isEmpty()) {
                        int montoApostado = Integer.parseInt(cantidadApostada);
                        // Realiza la lógica de la apuesta y muestra el resultado
                        String resultado = realizarApuesta(nombreApuesta, montoApostado) ? "Ganaste" : "Perdiste";
                        JOptionPane.showMessageDialog(null, "Resultado de la apuesta: " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break; // Sal del bucle una vez que se encuentra una apuesta seleccionada
                }else{
                    System.out.println("Apuesta desconocida");// Si no se encuentra ninguna apuesta
                }
        }
    }

    public boolean realizarApuesta(String nom , int monto){
     return true;
    }

}

@FunctionalInterface
interface TriFunction<T, U, R> {
    R apply(T t, U u);
}