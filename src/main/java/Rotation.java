package main.java;
import bandeau.Bandeau;


public class Rotation extends Effet {



    public void afficher() {
        bandeau.setMessage(message);
        for (int n = 0; n < this.repetitions; n++) {
            for (int i = 0; i <= 100; i++) {
                this.bandeau.setRotation(2 * Math.PI * i / 100);
                this.bandeau.sleep(100);
            }
        }

    }

    public Rotation(int repetitions, Bandeau bandeau, String message) {
        super(repetitions, bandeau, message);
    }
}