package packages;

public class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate()
    {
        pizza.setPate("feuilleteée");
    }

    public void monterSauce()
    {
        pizza.setSauce("piquante");
    }

    public void monterGarniture()
    {
        pizza.setGarniture("pepperoni+salami");
    }
}
