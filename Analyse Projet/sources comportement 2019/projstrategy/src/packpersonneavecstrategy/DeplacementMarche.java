package packpersonneavecstrategy;

public class DeplacementMarche implements Deplacement	 
{

	@Override
	public void seDeplacer(Personne p) 
	{
		System.out.println("Je me d�place en marchant !");
		p.setVitesse(6);
	}
}
