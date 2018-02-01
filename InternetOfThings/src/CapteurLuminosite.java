import java.util.ArrayList;

public abstract class CapteurLuminosite extends Capteur implements ICapteurReel{
	private int luminosite;
	private final int limite=255;
	private ArrayList<IEcouteurReel> abonnes;

	public CapteurLuminosite(String name) {
		super(name);
		this.luminosite=0;
		this.abonnes = new ArrayList<>();
	}

	@Override
	public float getFloatValue() {
		return (this.luminosite/this.limite);
	}

	@Override
	public Integer getIntValue() {
		return this.luminosite;
	}

	@Override
	public void abonner(IEcouteurReel e) {
		this.abonnes.add(e);
		
	}

	@Override
	public void desabonner(IEcouteurReel e) {
		this.abonnes.remove(e);
		
	}

	@Override
	public void majValue() {
		this.luminosite = (int )(Math.random() * 50 + 1);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}



}
