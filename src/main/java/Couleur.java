package main.java;

import bandeau.Bandeau;

import java.awt.*;


public class Couleur extends Effet {

    public void afficher() {
        bandeau.setMessage(message);
        this.bandeau.setForeground(couleur);

    }


    public Couleur(Bandeau bandeau, String message, Color couleur) {
        super( bandeau, message, couleur);
    }







}
