package main.java;

import bandeau.Bandeau;

import java.util.ArrayList;


public class Animation {

    private Bandeau bandeau;
    ArrayList<Effet> mesEffets = new ArrayList<Effet>();






    public void addEffet(Effet mesEffets) {
        this.mesEffets.add(mesEffets);

    }
    public Animation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void afficherScenario() {
        for (Effet e : mesEffets) {
            e.afficher();
            bandeau.sleep(2000);
        }
        bandeau.close();
    }

}