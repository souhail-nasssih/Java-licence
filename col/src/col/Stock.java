package col;

import java.util.ArrayList;
import java.util.List;


public class Stock {

    private List<Produit> produits;

    public Stock() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit p) {
        produits.add(p);
    }

    public void afficherTousLesProduits() {
        for (Produit p : produits) {
            p.afficherDetails();
            System.out.println("--------------------");
        }
    }

    public double calculerValeurTotaleStock() {
        double valeurTotale = 0;
        for (Produit p : produits) {
            valeurTotale += p.getPrix() * p.getQuantite();
        }
        return valeurTotale;
    }

    public void mettreAJourQuantite(String nom, int nouvelleQuantite) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                p.setQuantite(nouvelleQuantite);
                System.out.println("Quantité mise à jour pour " + nom);
                return;
            }
        }
        System.out.println("Produit non trouvé : " + nom);
    }

    public void augmenterQuantitePourcentage(String nom, double pourcentage) {
        for (Produit p : produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                int nouvelleQuantite = (int) (p.getQuantite() * (1 + pourcentage / 100));
                p.setQuantite(nouvelleQuantite);
                System.out.println("Quantité augmentée de " + pourcentage + "% pour " + nom);
                return;
            }
        }
        System.out.println("Produit non trouvé : " + nom);
    }


}



