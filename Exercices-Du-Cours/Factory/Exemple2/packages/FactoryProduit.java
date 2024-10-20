package packages;

public abstract class FactoryProduit {
    public ProduitA geProduitA()
    {
        return createProduitA();
    }

    public abstract ProduitA createProduitA();
}
