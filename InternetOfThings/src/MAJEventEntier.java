
class MAJEventEntier extends MAJEvent{
	private int nouvVal;

	public MAJEventEntier(String id,int nouvVal) {
		super(id);
		this.nouvVal=nouvVal;
	}
	
	public int getNouvVal() {
		return this.nouvVal;
	}

}
