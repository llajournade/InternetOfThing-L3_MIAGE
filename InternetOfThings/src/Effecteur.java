import java.util.UUID;

abstract class Effecteur implements IEffecteur{
	
	private String id;
	private String name;
	private String etat;
	
	public  Effecteur(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.etat = "inconnu";
	}
	
	public String getID(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public String getEtat(){
		return this.etat;
	}
	
	public void setEtat(String etat){
		this.etat = etat;
	}
	
	public String toString(){
		return "E-"+this.name+" ("+this.getID()+") - " + this.getEtat();
	}					
}

