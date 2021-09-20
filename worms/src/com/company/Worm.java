package com.company;

public class Worm {

     private int maxLife;
     private int strength;
     private String name;


     public Worm(int maxLife, int strength, String name) {
          this.maxLife = maxLife;
          this.strength = strength;
          this.name = name;
     }

     public void fight (Worm wormAdversary) {

          int damage = this.getStrength();
          if (damage < 0) {
               damage = 0;
          }
          wormAdversary.setMaxLife(wormAdversary.getMaxLife() - damage);
     }

     public boolean isDead() {
          return this.getMaxLife() <= 0;
     }

     public int getMaxLife() {
          return maxLife;
     }

     public void setMaxLife(int maxLife) {
          if (maxLife < 0) {
               maxLife = 0;
          }
          this.maxLife = maxLife;
     }

     public int getStrength() {
          return strength;
     }

     public void setStrength(int strength) {
          this.strength = strength;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

}
