import java.util.ArrayList;

/**
 * 
 * @author Etudiant
 * Capteur de température.
 */
public class Thermometre extends Capteur implements ICapteurEntier{
	private final int limite=255;
	private int temperature;
	private int temperatureMaximale;
	private ArrayList<IEcouteurEntier> abonnes;
	
	public Thermometre() {
		this("TempR15");
	}
	
	private Thermometre(String name) {
		super(name);
		this.abonnes = new ArrayList<IEcouteurEntier>();
		this.majValue();
		this.temperatureMaximale=this.temperature;
	}

	@Override
	public void majValue() {
		this.temperature = (int )(Math.random() * 50 + 1);
		MAJEventEntier e = new MAJEventEntier(this.getID(), this.temperature);
		for(IEcouteurEntier abonne : this.abonnes) {
			abonne.reagir(e);
		}
	}

	@Override
	public String getValue() {
		return ""+this.temperature;
	}

	@Override
	public Integer getIntValue() {
		return this.temperature;
	}

	@Override
	public Integer getIntMaxValue() {
		return this.temperatureMaximale;
	}
	
	public String toString() {
		return "Thermometre [name="+this.getName()
			+ ", id="+this.getID()
			+ ", value="+this.getValue()
			+ ", maxValue="+this.getIntMaxValue()
			+"]";
	}

	@Override
	public void abonner(IEcouteurEntier e) {
		this.abonnes.add(e);		
	}

	@Override
	public void desabonner(IEcouteurEntier e) {
		this.abonnes.remove(e);
	}

}
