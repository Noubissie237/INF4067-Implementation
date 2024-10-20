package packages;

public class ProduitFactory2 implements IProduitFactory {
    public ProduitA geProduitA(){
        return new ProduitA2();
    }

    public ProduitB geProduitB()
    {
        return new ProduitB2();
    }
}
