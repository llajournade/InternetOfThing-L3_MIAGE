
public class VoletRoulant extends Effecteur implements IEffecteurInterrupteur, IEcouteurEntier, IEcouteurReel {

	public VoletRoulant(String name) {
		super(name);
	}

	@Override
	public void allumer() {
		this.setEtat("Ouvert");
		
	}

	@Override
	public void eteindre() {
		this.setEtat("Fermé");
		
	}

	@Override
	public void reagir(MAJEventEntier event) {
		if(event.getNouvVal()>30) {
			this.eteindre();
		} else {
			this.allumer();
		}
		
	}

	@Override
	public void reagir(MAJEventReel event) {
		if(event.getNouvVal()>0.6) {
			this.eteindre();
		} else {
			this.allumer();
		}
		
	}

}
