package packages;

public class Rectangles {

    public Rectangles(){}

    public float getPerimetre(float longeur, float largeur) {
        return ((longeur + largeur) * 2);
    }

    public float getAire(float longeur, float largeur) {
        return (longeur * largeur);
    }
}
