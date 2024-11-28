package packages;

public class ProduitFactory1 implements IProduitFactory {
    public ProduitA geProduitA(){
        return new ProduitA1();
    }

    public ProduitB geProduitB()
    {
        return new ProduitB1();
    }
}
