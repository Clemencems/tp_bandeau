package main.java;

import bandeau.Bandeau;

import java.awt.*;

public abstract class Effet {
    protected String message;
    protected Color couleur;


    protected int repetitions;
    public Bandeau bandeau;






    public Effet(Bandeau bandeau, String message, Color couleur) {
        this.bandeau = bandeau;
        this.message = message;
        this.couleur = couleur;
    }


    public Effet(int repetitions, Bandeau bandeau, String message) {
        this.message = message;

        this.bandeau = bandeau;

        this.repetitions = repetitions;

    }


    public abstract void afficher();


}