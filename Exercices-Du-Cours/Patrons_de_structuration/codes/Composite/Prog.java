import packages.*;

/* Client */
public class Prog {
    public static void main(String[] args) {

        Component folder1;
        folder1 = new Component("Master1", Type.DOSSIER); // Création d'un dossier nommé master1
        
        Component file1 = new Component("Calendrier_Académique", Type.PDF); // Création d'un fichier pdf nommé Calendrier Académique
        folder1.ajouter(file1); // Ajout d'un fichier pdf nommé Calendrier Académique dans le dossier Master1

        Component subfolder1 = new Component("INF4067", Type.DOSSIER); // Création d'un dossier nommé INF4067
        Component subfolder2 = new Component("INF4057", Type.DOSSIER); // Création d'un dossier nommé INF4057
        
        folder1.ajouter(subfolder1); // Ajout du dossier INF4067 en tant que sous dossier au dossier Master1
        folder1.ajouter(subfolder2); // Ajout du dossier INF4057 comme sous dossier au dossier Master1
                
        Component subfolder1_1 = new Component("Cours", Type.DOSSIER); // Création d'un sous dossier nommé Cours
        Component subfolder1_2 = new Component("Codes", Type.DOSSIER); // Création d'un sous dossier nommé Codes
        
        Component file1_1_1 = new Component("Design_Pattern", Type.PDF); // Création du fichier pdf nommé Design_Pattern
        Component file1_2_1 = new Component("README", Type.TXT); // Création du fichier txt nommé README
        
        subfolder1_1.ajouter(file1_1_1); // Ajout du fichier Design_Pattern dans le dossier (Cours)
        subfolder1_2.ajouter(file1_2_1); // Ajout du fichier README dans le dossier (Code)
        
        subfolder1.ajouter(subfolder1_1); // Ajout du dossiers Cours dans le dossier INF4067
        subfolder1.ajouter(subfolder1_2); // Ajout du dossiers Codes dans le dossier INF4067

        
        System.out.println("\n--------------------------------------------------------------- ");
        folder1.decrire();
        System.out.println("\n--------------------------------------------------------------- ");


        subfolder1_2.supprimer(file1_2_1); // Suppression du fichier README.txt

        System.out.println("\n--------------------------------------------------------------- ");
        folder1.decrire();
        System.out.println("\n--------------------------------------------------------------- ");

        folder1.supprimer(subfolder1); // Suppression du dossier INF4067

        System.out.println("\n--------------------------------------------------------------- ");
        folder1.decrire();
        System.out.println("\n--------------------------------------------------------------- ");

        folder1.obtenir("Calendrier_Académique"); // Recherche du calendrier Académique
        folder1.obtenir("note_cc"); // Recherche d'un élément nommé note_cc (inexistant)
    }
}