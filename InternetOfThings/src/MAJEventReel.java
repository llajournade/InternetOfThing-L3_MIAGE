
public class MAJEventReel extends MAJEvent{
	private float nouvVal;

	public MAJEventReel(String id,float nouvVal) {
		super(id);
		this.nouvVal=nouvVal;
	}
	
	public float getNouvVal() {
		return this.nouvVal;
	}


}
