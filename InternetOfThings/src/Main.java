
class Main {
	
	public static void testThermometre() {
		Broker b = new Broker(5000,	true,true);		
		Thermometre t = new Thermometre();
		b.ajouterCapteur(t);
		// Afficher thermometre
		// Valeur mise � jour
		t.majValue();
		// Afficher thermometre
		t.majValue();
	}

	public static void testChaudiere() {
		Chaudiere c = new Chaudiere("Chaudi�re 1", 20);
		System.out.println(c);
		Chaudiere c2 = new Chaudiere("Chaudi�re 2", 10);
	}
	
	
	public static void main(String[] args) {
		// Cr�ation broker
		Broker b = new Broker(5000,	true,true);		
		System.out.println("Cr�ation broker");
		// Cr�ation chaudiere
		Chaudiere c = new Chaudiere("Chaudiere 1", 20);
		System.out.println("Cr�ation chaudi�re");
		// Cr�ation thermometre
		Thermometre t = new Thermometre();
		System.out.println("Cr�ation thermometre");
		// Ajouter des Ecouteurs
		t.abonner(c);
		System.out.println("Abonnement chaudiere � thermometre");
		// Ajouter les capteur dans le broket
		b.ajouterCapteur(t);
	}
}
