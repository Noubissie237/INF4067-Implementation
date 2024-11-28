import packages.*;

public class Prog {
    public static void main(String[] args) {
        AdapterRectange rectangles = new AdapterRectange();

        float cote = 4.2f;

        float air = rectangles.getAire(cote);
        float perimetre = rectangles.getPerimetre(cote);

        System.out.println("AIRE : "+air);
        System.out.println("PERIMETRE : "+perimetre);
    }
}