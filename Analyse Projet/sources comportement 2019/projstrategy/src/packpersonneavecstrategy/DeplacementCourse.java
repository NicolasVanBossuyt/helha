package packpersonneavecstrategy;

public class DeplacementCourse implements Deplacement 
{

	@Override
	public void seDeplacer(Personne p) 
	{
		System.out.println("Je me d�place en courant !");
		p.setVitesse(12);
	}
}
