
interface ICapteurReel extends ICapteur{
	public abstract float getFloatValue();
	public abstract Integer getIntValue();
	public abstract void abonner(IEcouteurReel e);
	public abstract void desabonner(IEcouteurReel e) ;
	@Override
	public abstract void majValue() ;

	@Override
	public abstract String getValue();
}
