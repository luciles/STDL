package mcs.tds;

import mcs.type.DTYPE;

public class INFOTYPE extends INFO {

	public INFOTYPE(DTYPE t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	// affichage
	public String toString() {
		return "; ALIAS sur : " + "type=" + type ;
	}

}
