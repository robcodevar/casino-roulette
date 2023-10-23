/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.roulette;

/**
 *
 * @author Fernando
 */
public class MiddleBet extends Bet {
  int middleNumber;

  public MiddleBet(float credits, Player player, int middleNumber) {
    super(credits, player, 2);
    this.middleNumber = middleNumber;
  }

  @Override
  public boolean isWinner(Slot slot) {
    boolean res = false;

    if (middleNumber == 1 && slot.getNumberTag() >= 1 && slot.getNumberTag() <= 18) {
      res = true;
    } else if (middleNumber == 2 && slot.getNumberTag() >= 19 && slot.getNumberTag() <= 36) {
      res = true;
    }

    return res;
  }

  @Override
  public String getType() {

    if (this.middleNumber == 1) {
      return "1 a 18";
    } else if (this.middleNumber == 2) {
      return "19 a 36";
    }

    return "";
  }
}