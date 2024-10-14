import packages.*;

public class Prog
{
    public static void main(String args[])
    {
        // Création d'un premier etudiant
        Etudiant etudiant = null;
        etudiant = Etudiant.getInstance("Noubissie", "Wilfried", "20U2671");

        etudiant.afficheEtudiant(); // Affichage. L'étudiant est bel et bien celui que j'ai créé

        // Si à présent j'essaie de créer un nouvel etudiant avec la meme variable
        etudiant = Etudiant.getInstance("Kamga", "Wilfried", "20u2671");
        //et que j'essaie de l'afficher
        etudiant.afficheEtudiant(); // Je constate que c'est toujours le précédent etudiant (Noubissie) qui y est

        // La seule solution est donc de créer une nouvelle variable si l'on souhaite créer un nouvel etudiant.

    }
}