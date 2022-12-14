package main.java;

import bandeau.Bandeau;

import java.awt.*;


public class Clignoter extends Effet {

    public Clignoter(int repetitions, Bandeau bandeau, String message) {
        super(repetitions, bandeau, message);
    }




    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 0; i < this.repetitions; i++) {
                if (i % 2 == 0) {
                    this.bandeau.setForeground(Color.white);
                    this.bandeau.sleep(100);
                }
                if ((i % 2) != 0) {
                    this.bandeau.setForeground(Color.black);
                    this.bandeau.sleep(100);

                }
            }
        }
    }
}