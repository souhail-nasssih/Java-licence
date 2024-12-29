package col;

public class ProduitAlimentaire extends Produit {
	  private double poids;

	    public ProduitAlimentaire(String nom, double prix, int quantite, double poids) {
	        super(nom, prix, quantite);
	        this.poids = poids;
	    }

	    public double getPoids() {
	        return poids;
	    }

	    public void setPoids(double poids) {
	        this.poids = poids;
	    }

	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("Poids: " + poids + " kg");
	    }
}
