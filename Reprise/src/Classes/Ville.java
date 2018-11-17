package Classes;

public class Ville {
	
	public String nomVille;
	public String nomPays;
	public int nbreHabitants;
	
	public Ville ()
	{
		this.nomVille = "Ville Inconnue";
		this.nomPays = "Pays Inconnu";
		this.nbreHabitants = 0;
	}
	
	public Ville (String Ville, String Pays, int nbreHab)
	{
		this.nomVille = Ville;
		this.nomPays = Pays;
		this.nbreHabitants = nbreHab;
	} 
	
	//Getters
	public String getNomVille () {
		return this.nomVille;
	}
	
	public String getNomPays () {
		return this.nomPays;
	}
	
	public int getnbreHabitants () {
		return this.nbreHabitants;
	}
	//Setters
	public void setNomVille (String Ville) {
		this.nomVille=Ville;
	}
	
	public void setNomPays (String Pays) {
		this.nomPays = Pays;
	}
	
	public void setnbreHabitants (int nbreHab) {
		this.nbreHabitants = nbreHab;
	}
	
	/**
	 * Comparer le nombre d'habitants de deux villes
	 * @param V 
	 * @return 1 si le nbreHabitants > V.nbreHabitants, -1 si le nbreHabitants < V.nbreHabitants
	 */
	public int compare (Ville V)
	{
		if (this.nbreHabitants>V.nbreHabitants)
			return 1;
		else 
		{
			if (this.nbreHabitants<V.nbreHabitants)
				return -1;
		}
		return 0;
	}
	
	public String toString ()
	{
		return this.nomVille + "\n" + this.nomPays+"\n"+this.nbreHabitants;
	}
}
