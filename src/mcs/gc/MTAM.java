package mcs.gc;


/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {
	

	
	
	@Override
	public String getSuffixe() {
		return "tam";
	}
	
	public String genPush(int taille) {
		return "\tPUSH " + taille + "\n" ; 
	}
	
	public String genCst(String v) {
		return "\tLOADL " + v + "\n" ;
	}
	
	public String genFree(int i) {
		return "\tPOP(0)" + i + "\n" ; 
	}
	
	public String genReadMem(int dep, int taille) {
		return "\tLOAD(" + taille + ") " + dep + "[LB]\n" ;
	}
	
	public String genWriteMem(int dep, int taille) {
		return "\tSTORE(" + taille + ") " + dep + "[LB]\n";
	}

	public String genReadIndirectMem(int taille) {
		return "\tLOADI(" + taille + ")\n";
	}

	public String genWriteIndirectMem(int taille) {
		return "\tSTOREI(" + taille + ")\n";
	}
	
	public String genMalloc(int taille) {
		return "\tLOADL " + taille + "\n" + "\tSUBR Malloc\n";
	}

	public String genAdr(int dep) {
		return "\tLOADA " + dep + "[LSB]\n";
	}
	//adresse d'une donnée pointée
	public String genAdrField(int dep) {
		return "\t;Calcul deplacement struct " + dep + "\n" + "\tLOADL " + dep
				+ "\n\tSUBR Iadd\n";
	}

	
	

	
}
