package mcs.tds;

import java.util.ArrayList;

import mcs.type.DTYPE;

public class PARAMLIST {

	public ArrayList<DTYPE> liste;

	
	public static PARAMLIST creerListe() {
		return new PARAMLIST();
	}
	
	public void ajouter(DTYPE t) {
		liste.add(t);
	}
	
	
	public DTYPE get(int i) {
		return liste.get(i);
	}
	
	public int getTaille() {
		return liste.size();
	}
	
	
	
}
