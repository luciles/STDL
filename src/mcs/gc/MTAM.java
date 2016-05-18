package mcs.gc;


/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {
	
	private static int cpt=0 ; //compteur pour les étiquettes
	
	public String genFonction(String etiquette, int taillepars,int tailleretour, String code) {
		return "_" + etiquette + ":\n" + code + "\tRETURN (" + taillepars + ") "
				+ tailleretour + "\n";
	}
	
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
	
	public String genFin() {
		return "\tHALT\n";
	}
	
	public String genEtiq() {
		return "X" + cpt++ ;
	}
	
	
	public String genIf(String code, String code2) {
		String sinon = genEtiq();
		String fin = genEtiq();
		return "\t; if\n" + code + "\n" + "\tJUMPIF(0) " + sinon + "\n" + code2
				+ "\n" + "\tJUMP " + fin + "\n" + sinon + "\n" + code2 + "\n"
				+ fin + "\n" + "\t; fin if\n";
	}
	public String genElse(String code) {
		String sinon = genEtiq() ; 
		return sinon + "\n" + code ; 
	}
	
	

	
}
