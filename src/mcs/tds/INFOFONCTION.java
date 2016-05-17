package mcs.tds;

import mcs.type.DTYPE;

public class INFOFONCTION extends INFO {
	
	DTYPE t;
	PARAMLIST l;
	
	// t est la type retour de la fonction
	// liste param
	public INFOFONCTION(DTYPE t, PARAMLIST l) {
		super(t);
		this.l = l;
		
	}
	
	public void setL(PARAMLIST l) {
		this.l = l;
	}

	public DTYPE getType() {
		return this.t;
	}
	
	public PARAMLIST getParametres() {
		return l;
	}
	
	public void ajouter(DTYPE t) {
		l.ajouter(t);
	}
	
	
	
	

}
