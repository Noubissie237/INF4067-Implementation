package packages;

public class FactoryProduitA2 extends FactoryProduit {
    public ProduitA createProduitA()
    {
        return new ProduitA2();
    }
}
