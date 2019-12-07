package packiteratoraveccondition;

import java.util.List;

public class IteratorPersonne
{
	
	private String motCle;
	private int index;					
	private List<Personne> liste;
	

	public IteratorPersonne(List<Personne> liste, String motCl) 
	{
		super();
		this.liste = liste;
		setMotCle(motCl);			// doit initialiser le crit�re avant de faire la recherche
		start();
		
	}
	
	
	
	public Personne item() 
	{
		if (index < liste.size()) 
		{	return liste.get(index);		}
		else 
		{	return null;					}
	}

	
	public void setMotCle(String motCle) 
	{	this.motCle = motCle;		}
	
	// R�cup�re la 1�re personne en fonction du crit�re, 
	// on retiendra en fait la valeur de INDEX, dans le sens 
	// qu'on s'arrete dessus en fonction de index++
	public void start() 
	{
		for (;;) 		
		{
			Personne p = item();
			p = item();
			if (p == null)				 
			{	return;			}
			
			if (p.plusGrand(motCle)) 
			{	return;			}		 
										
			index++;					
		}
	}
	
	// Recherche de l'�l�ment suivant correspondant au crit�re demand� 
	public void next() 
	{
		index++;
		for (;;) 
		{
			Personne p = item();
			if (p == null) 
			{	return;				}
			
			if (p.plusGrand(motCle)) 
			{	return;				}
			
			index++;
		}
	}
}