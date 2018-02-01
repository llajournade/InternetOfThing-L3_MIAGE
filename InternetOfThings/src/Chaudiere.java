
public class Chaudiere extends Effecteur implements IEffecteurInterrupteur, IEffecteurVariateur, IEcouteurEntier {
	private int temperatureSeuil;
	private boolean estAllumer;
	
	public Chaudiere(String name, int temperatureSeuil) {
		super(name);
		this.temperatureSeuil=temperatureSeuil;
		this.estAllumer=false;
	}

	@Override
	public void allumer() {
		this.estAllumer = true;
		System.out.println(this.getName() + " est allumé");
	}

	@Override
	public void eteindre() {
		this.estAllumer = false;
		System.out.println(this.getName() + " est éteinds");
		
	}

	@Override
	public void setValue(int v) {
		this.temperatureSeuil = v;
		
	}

	@Override
	public int getValue() {
		return this.temperatureSeuil ;
	}
	
	public boolean estAllumer() {
		return this.estAllumer;
	}
	
	public String toString() {
		return "Chaudière [nom=" +this.getName()
			+", id="+this.getID()
			+", etat="+this.getEtat()
			+", est Allumer=" + this.estAllumer()
			+ ", temperature seuil="+this.getValue()
			+"]";
	}

	@Override
	public void reagir(MAJEventEntier event) {
		if(event.getNouvVal() < this.getValue()) {
			this.allumer();
		} else {
			this.eteindre();
		}
		
	}

}
