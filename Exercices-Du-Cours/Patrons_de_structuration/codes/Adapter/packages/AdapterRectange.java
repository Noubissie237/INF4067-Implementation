package packages;

public class AdapterRectange implements Carres {

    Rectangles rectangles = new Rectangles();

    @Override
    public float getAire(float cote) {
        return rectangles.getAire(cote, cote);
    }

    @Override
    public float getPerimetre(float cote) {
        return rectangles.getPerimetre(cote, cote);
    }
    
}
