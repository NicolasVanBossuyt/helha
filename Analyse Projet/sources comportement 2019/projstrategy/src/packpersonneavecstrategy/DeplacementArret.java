package packpersonneavecstrategy;

public class DeplacementArret implements Deplacement 
{

	@Override
	public void seDeplacer(Personne p) 
	{	
		System.out.println("Je suis � l'arr�t !");
		p.setVitesse(0);
	}
}
