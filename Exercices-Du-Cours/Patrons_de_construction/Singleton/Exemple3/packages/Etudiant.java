package packages;

public final class Etudiant {
    private static Etudiant instance = null;
    private String nom;
    private String prenom;
    private String matricule;

    private Etudiant(String name, String first_name, String register) {
        this.nom = name;
        this.prenom = first_name;
        this.matricule = register;
    }

    public static Etudiant getInstance(String nom, String prenom, String matricule)
    {
        if (instance == null)
        {
            instance = new Etudiant(nom, prenom, matricule);
        }
        return instance;
    }

    public void afficheEtudiant()
    {
        System.out.println(" ------- | ETUDIANT | ------- ");
        System.out.println("Nom : "+this.nom.toString().toUpperCase());
        System.out.println("Prenom : "+this.prenom.toString().toUpperCase());
        System.out.println("Matricule : "+this.matricule.toString().toUpperCase());
        System.out.println(" ----------- ");
    }


}
