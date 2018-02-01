abstract class MAJEvent {
	private	String idCapteur;
	
	public MAJEvent(String id){
		this.idCapteur = id;
	}
	
	public String getID(){
		return this.idCapteur;
	}
}