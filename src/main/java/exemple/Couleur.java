package exemple;
import java.awt.Color;
import bandeau.Bandeau;
import java.awt.Font;



public class Couleur extends Effet {

    public void afficher() {
        bandeau.setMessage(message);
        this.bandeau.setForeground(couleur);

    }


    public Couleur( Bandeau bandeau, String message, Color couleur) {
        super( bandeau, message, couleur);
    }







}
