package packages;
import java.util.ArrayList;

/*  Class me servant de component */
public class Component {
    
    protected String nom;
    protected Type type;
    protected ArrayList<Component> components = new ArrayList<Component>();

    public Component(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public Type getType() {
        return type;
    }

    public void decrire() {
        System.out.println("NOM : " + getNom());
        System.out.println("TYPE : " + getType());

        if (this.type.equals(Type.DOSSIER)) {
            if (components.size() > 0) {
                for (Component component : components) {
                    System.out.println("-- sous élément du dossier -->" + this.nom);
                    component.decrire();
                }
            } else {
                System.out.println("|- Aucun sous élément");
            }
        }
    }

    public void ajouter(Component newElement) {
        components.add(newElement);
    }

    public ArrayList<Component> supprimer(Component elementASupprimer) {
        if (components.isEmpty()) {
            System.out.println("Rien à supprimer, le dossier ne contient aucun élément");
            return this.components;
        } else {
            for (Component component : components) {
                if (component.equals(elementASupprimer)) {
                    if (elementASupprimer.type.equals(component.type)) {
                        this.components.remove(elementASupprimer);
                        System.out.println("Le " + elementASupprimer.getType() + " nommé " + elementASupprimer.getNom()
                                + " a été supprimé avec succès !");
                        return this.components;
                    }
                }
            }
            System.out.println("Aucun " + elementASupprimer.getType() + " nommé " + elementASupprimer.getNom()
                    + " n'a été trouvé ");
            return this.components;
        }
    }

    /* Rechercher un élément (fichier ou dossier) à partir de son nom */
    public void obtenir(String nom) {
        if (getType().equals(Type.DOSSIER)) {
            if (components.isEmpty()) {
                System.out.println("Dossier "+ getNom() +" vide !");
                return;
            } else {
                for (Component component : components) {

                    if (component.getType().equals(Type.DOSSIER)) {
                        component.obtenir(nom);
                    } else {

                        if (component.getNom().equals(nom)) {
                            System.out.println("Un élément du type " + component.getType() + " nommé '" + nom
                                    + "' a été trouvé dans le dossier " + getNom() + " :)");
                            component.decrire();
                            System.out.println("Elément parent : " + this.getNom()+"\n");
                            return;
                        }
                    }

                }
                System.out.println("Aucun élément nommé '" + nom + "' n'a été trouvé dans le "+getType()+ " "+getNom());
            }

        } else {
            System.out.println(
                    "Ceci est un fichier, et donc ne peut être parcouru. Veuillez séléctionner un dossier pour effectuer la recherche de '"
                            + nom + "'");
        }
    }

}