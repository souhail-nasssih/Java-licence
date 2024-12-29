package col;

public class Produit {

	 private double prix;
	    private int quantite;
	    private String nom;


	    public Produit(String nom, double prix, int quantite) {
	        this.nom = nom;
	        this.prix = prix;
	        this.quantite = quantite;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public double getPrix() {
	        return prix;
	    }

	    public void setPrix(double prix) {
	        this.prix = prix;
	    }

	    public int getQuantite() {
	        return quantite;
	    }

	    public void setQuantite(int quantite) {
	        this.quantite = quantite;
	    }

	    public void afficherDetails() {
	        System.out.println("Nom: " + nom + ", Prix: " + prix + ", Quantité: " + quantite);
	    }
}
