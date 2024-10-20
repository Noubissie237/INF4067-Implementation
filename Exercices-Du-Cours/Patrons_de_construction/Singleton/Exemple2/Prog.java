import packages.*;

public class Prog
{
    public static void main(String args[])
    {
        int som = Singleton.getInstance().somme(2, 5);
        System.out.println("La somme est : "+som);

        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();
    }
}