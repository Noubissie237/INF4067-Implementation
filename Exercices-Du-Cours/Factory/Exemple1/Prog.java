import packages.*;

public class Prog
{
    public static void main(String args[])
    {
        ProduitA produitA = null;
        FactoryProduit factoryProduit = new FactoryProduit();

        produitA = factoryProduit.geProduitA(FactoryProduit.TYPE_PRODUITA1);
        produitA.methodeA();
        
        
        produitA = factoryProduit.geProduitA(FactoryProduit.TYPE_PRODUITA2);
        produitA.methodeA();
        
        
        produitA = factoryProduit.geProduitA(FactoryProduit.TYPE_PRODUITA3);
        produitA.methodeA();
        
        
    }
}