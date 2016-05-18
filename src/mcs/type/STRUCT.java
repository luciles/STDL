package mcs.type;

import java.util.ArrayList;

public class STRUCT implements DTYPE {

	private LCHAMPS champs;
	private String nom ; 

	public STRUCT(LCHAMPS champs, String n) {
		this.champs = champs;
		this.nom = "struct " + champs.getTaille() ; 
	}



	public LCHAMPS getChamps() {
		return champs;
	}
	public boolean compareTo(DTYPE autre) {
		if (autre instanceof STRUCT)
			return champs.compareTo(((STRUCT) autre).champs);
		/*if (autre instanceof TUPLE)
			return getTypes().compareTo(((TUPLE) autre).getTypes());
		return false;*/
	}


	public String toString(){
		return super.toString() + " champs = " + champs;
	}



	public ArrayList<DTYPE> getTypes() {
		ArrayList<DTYPE> lt = new ArrayList<DTYPE>();
		for (CHAMP c : champs){
			lt.add(c.getType());
		}
		return lt;
	}



	@Override
	public int getTaille() {
		// TODO Auto-generated method stub
		return champs.getTaille();
	}



	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return nom;
	}
}