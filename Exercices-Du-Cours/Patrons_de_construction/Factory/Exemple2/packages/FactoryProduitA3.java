package packages;

public class FactoryProduitA3 extends FactoryProduit{
    public ProduitA createProduitA()
    {
        return new ProduitA3();
    }
}
