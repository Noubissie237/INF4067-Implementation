package packages;

public class FactoryProduitA1 extends FactoryProduit {
    
    public ProduitA createProduitA()
    {
        return new ProduitA1();
    }
}
