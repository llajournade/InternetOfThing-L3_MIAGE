import java.util.UUID;

abstract class Capteur implements ICapteur {
	
	private String id;
	private String name;
	
	public  Capteur(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
	
	public String getID(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String toString(){
		return this.name+" ("+this.getID()+") : "+this.getValue();
	}					
}