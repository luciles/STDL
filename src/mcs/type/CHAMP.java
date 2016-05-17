package mcs.type;

public class CHAMP {
	
	private String nom;
	private int dep;
	private DTYPE type;
	
	public String getNom() {
		return nom;
	}
	
	public int getDep() {
		return dep;
	}
	
	public DTYPE getType() {
		return type;
	}
	
	public CHAMP(String nom, DTYPE type, int dep) {
		this.type = type;
		this.dep = dep;
		this.nom = nom ; 
	}
	
	public String toString() {
		return nom + ": " + type + " dep = " + dep ; 
	}

}
