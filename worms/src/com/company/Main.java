package com.company;

public class Main {

    public static void main(String[] args) {

        int max = 30;
        int min = 1;
        int range = max - min + 1;
        String winner;
        String loser;

        Worm wormGersey = new Worm(100, (int)(Math.random() * range) + min, "Gersey");
        Worm wormThuy = new Worm (100, (int)(Math.random() * range) + min, "Thuy");


        int round = 1;

        while (wormGersey.getMaxLife() > 0 && wormThuy.getMaxLife() > 0) {

            wormGersey.fight(wormThuy);

            System.out.println(wormGersey.getName() + " attacked " + wormThuy.getName());
            System.out.println(wormThuy.getName() + "'s life: " + wormThuy.getMaxLife());

            wormThuy.fight(wormGersey);

            System.out.println(wormThuy.getName() + " attacked " + wormGersey.getName());
            System.out.println(wormGersey.getName() + "'s life: " + wormGersey.getMaxLife());

    }

        if (wormGersey.getMaxLife() > 0) {
            winner = wormGersey.getName();
            loser = wormThuy.getName();
        } else {
            winner = wormThuy.getName();
            loser = wormGersey.getName();
        }

        System.out.println(loser + " is dead. The winner is " + winner);

    }

}
