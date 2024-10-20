import packages.*;

public class Prog {
    public static void main(String[] args)
    {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.geProduitA();
        produitB = produitFactory1.geProduitB();
        produitA.methodeA();
        produitB.methodeB();


        System.out.println("Utilisation de la deuxieme fabrique");
        produitA = produitFactory2.geProduitA();
        produitB = produitFactory2.geProduitB();
        produitA.methodeA();
        produitB.methodeB();
    }
}
