/**
 * 
 * @author Etudiant
 * Cette interface sera utilis�e pour caract�riser les diff�rents capteurs qui 
 * pourront renvoyer une valeur de type  Entier  (Integer)  
 * au  travers  de  la  m�thode getIntValue().  
 * La  m�thode getIntMaxValue() permet d�obtenir 
 * la valeur maximum de la valeur du capteur.
 */
interface ICapteurEntier extends ICapteur {
	public abstract Integer getIntValue(); //renvoie une valeur de type  Entier  (Integer)
	public abstract Integer getIntMaxValue(); // permet d�obtenir la valeur maximum de la valeur du capteur
	public abstract void abonner(IEcouteurEntier e);
	public abstract void desabonner(IEcouteurEntier e);
}
