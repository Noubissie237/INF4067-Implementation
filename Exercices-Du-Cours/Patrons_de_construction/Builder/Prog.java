import packages.*;

public class Prog {
    public static void main(String[] args) {
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurReine = new MonteurPizzaReine();

        
        Pizzeria pizzeria = new Pizzeria(); // ici, pizzaria me servira de directeur, pour organiser la contruction de pizza

        // Construire une pizza piquante
        pizzeria.setMonteurPizza(monteurPiquante);
        pizzeria.construirePizza();
        Pizza pizzaPiquante = pizzeria.getPizza();
        System.out.println("Pizza Piquante:");
        pizzaPiquante.print();
        
        System.out.println("--------------------");

        // Construire une pizza reine
        pizzeria.setMonteurPizza(monteurReine);
        pizzeria.construirePizza();
        Pizza pizzaReine = pizzeria.getPizza();
        System.out.println("Pizza Reine:");
        pizzaReine.print();
    }
}
