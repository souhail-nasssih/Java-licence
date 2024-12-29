package col;

public class ProduitElectronique extends Produit {
	  private int puissance;

	    public ProduitElectronique(String nom, double prix, int quantite, int puissance) {
	        super(nom, prix, quantite);
	        this.puissance = puissance;
	    }

	    public int getPuissance() {
	        return puissance;
	    }

	    public void setPuissance(int puissance) {
	        this.puissance = puissance;
	    }

	    @Override
	    public void afficherDetails() {
	        super.afficherDetails();
	        System.out.println("Puissance: " + puissance + " watts");
	    }
}

