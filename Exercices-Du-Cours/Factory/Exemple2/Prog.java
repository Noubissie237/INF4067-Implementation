import packages.*;

public class Prog
{
    public static void main(String args[])
    {
        ProduitA produitA = null;
        FactoryProduit factoryProduit1 = new FactoryProduitA1();
        FactoryProduit factoryProduit2 = new FactoryProduitA2();
        FactoryProduit factoryProduit3 = new FactoryProduitA3();

        System.out.println("---------- Utilisation de la premiere fabrique ----------");
        produitA = factoryProduit1.createProduitA();
        produitA.methodeA();
        
        
        System.out.println("---------- Utilisation de la deuxieme fabrique ----------");
        produitA = factoryProduit2.createProduitA();
        produitA.methodeA();
        
        
        System.out.println("---------- Utilisation de la troisieme fabrique ----------");
        produitA = factoryProduit3.createProduitA();
        produitA.methodeA();
        
        
    }
}