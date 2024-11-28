import packages.*;

public class Prog
{
    public static void main(String args[])
    {
        Singleton singleton = Singleton.getInstance();

        System.out.println("-----------------------");
        singleton.operation1(2, 3, 4);   

        System.out.println("-----------------------");
        singleton.operation2(2, 3, 4);   

        System.out.println("-----------------------");
        singleton.operation3(2, 3, 4);   

    }
}