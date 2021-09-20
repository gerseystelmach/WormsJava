package com.company;

public class Tournament {

    public static void main(String[] args) {
        int max = 30;
        int min = 1;
        int range = max - min + 1;

        String[] wormNames = {"Raphael", "Zurabi", "Thuy", "Gersey", "Matthieu", "Mathias", "Lahcen", "Arnaud", "Nicolas", "Sylvain"};
        Worm[] worms = new Worm[10];

        for (int i = 0; i < 10; i++) {
            Worm worm = new Worm(10 * (int)(Math.random() * range) + min,(int)(Math.random() * range) + min, "Worm " + wormNames[i]);
            worms[i] = worm;
        }

        Worm[] team1 = new Worm[5];
        Worm[] team2 = new Worm[5];




    }



}
