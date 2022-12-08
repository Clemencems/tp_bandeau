
package exemple;
import java.awt.Color;

import bandeau.Bandeau;

public class ExempleBandeau {




    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
        Animation monscenario = new Animation(monBandeau);

        Color couleur =  Color.blue;


        monscenario.addEffet(new Rotation(2, monBandeau, "On tourne 2 fois !!"));
        monscenario.addEffet(new Couleur(monBandeau, "Changement de la couleur", couleur));
        monscenario.addEffet(new Zoom(3, monBandeau, "On zoome trois fois!!"));
        monscenario.addEffet(new Clignoter(3, monBandeau, "On clignote trois fois !!"));

        monscenario.afficherScenario();
    }


}