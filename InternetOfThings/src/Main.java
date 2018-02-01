
class Main {
	
	public static void testThermometre() {
		Broker b = new Broker(5000,	true,true);		
		Thermometre t = new Thermometre();
		b.ajouterCapteur(t);
		// Afficher thermometre
		// Valeur mise à jour
		t.majValue();
		// Afficher thermometre
		t.majValue();
	}

	public static void testChaudiere() {
		Chaudiere c = new Chaudiere("Chaudière 1", 20);
		System.out.println(c);
		Chaudiere c2 = new Chaudiere("Chaudière 2", 10);
	}
	
	
	public static void main(String[] args) {
		// Création broker
		Broker b = new Broker(5000,	true,true);		
		System.out.println("Création broker");
		// Création chaudiere
		Chaudiere c = new Chaudiere("Chaudiere 1", 20);
		System.out.println("Création chaudière");
		// Création thermometre
		Thermometre t = new Thermometre();
		System.out.println("Création thermometre");
		// Ajouter des Ecouteurs
		t.abonner(c);
		System.out.println("Abonnement chaudiere à thermometre");
		// Ajouter les capteur dans le broket
		b.ajouterCapteur(t);
	}
}
