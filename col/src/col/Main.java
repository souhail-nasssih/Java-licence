package col;


public class Main {
	public static void main(String[] args) {
		 Stock stock = new Stock();

	        ProduitAlimentaire pomme = new ProduitAlimentaire("Pomme", 2.5, 50, 1.2);
	        ProduitAlimentaire banane = new ProduitAlimentaire("Banane", 1.8, 100, 1.0);

	        ProduitElectronique tele = new ProduitElectronique("Télévision", 300.0, 10, 150);
	        ProduitElectronique frigo = new ProduitElectronique("Réfrigérateur", 500.0, 5, 200);

	        stock.ajouterProduit(pomme);
	        stock.ajouterProduit(banane);
	        stock.ajouterProduit(tele);
	        stock.ajouterProduit(frigo);

	        System.out.println("Liste des produits :");
	        stock.afficherTousLesProduits();

	        System.out.println("Valeur totale du stock : " + stock.calculerValeurTotaleStock());

	        stock.mettreAJourQuantite("Pomme", 60);
	        stock.augmenterQuantitePourcentage("Banane", 10);

	        System.out.println("Après mise à jour des quantités :");
	        stock.afficherTousLesProduits();

	    }
	}


