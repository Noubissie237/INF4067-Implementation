package packages;

public class MonteurPizzaReine extends MonteurPizza {
    public void monterPate()
    {
        pizza.setPate("croisée");
    }

    public void monterSauce()
    {
        pizza.setSauce("douce");
    }

    public void monterGarniture()
    {
        pizza.setGarniture("jambo+champignon");
    }
}
