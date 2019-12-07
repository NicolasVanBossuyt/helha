package packpersonnesansstrategy;

public class Personne 
{
	private int vitesse;
	private Deplacement deplacement;
	public enum Deplacement {ARRET, MARCHE, COURSE;};	
	
 
	public Personne() 
	{	vitesse = 0;	}			 
									

	public void setDeplacement(Deplacement deplacement) 
	{	this.deplacement = deplacement;	}
	
	
	public void seDeplacer() 
	{

		if (deplacement == Deplacement.ARRET) 
		{
			System.out.println("Je suis � l'arr�t !");
			setVitesse(0);
		}

		else if (deplacement == Deplacement.MARCHE) 
		{
			System.out.println("Je me d�place en marchant !");
			setVitesse(6);
		}

		else if (deplacement == Deplacement.COURSE) 
		{
			System.out.println("Je me d�place en courant !");
			setVitesse(12);
		}

		System.out.println(toString());
	}
	

	public void setVitesse(int vitesse) 
	{
		if (vitesse >= 0)
			this.vitesse = vitesse;
	}
		
	 
	public String toString() 
	{	return "Je me d�place � la vitesse de " + vitesse + " km/h";	}
}
