package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_ENTITE_MCS {
LEX_MCS scanner;
  S_ENTITE_MCS() {
    }
  S_ENTITE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle79() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_79(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_79(x_4);
  }
  private void regle3() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_typedef);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser(LEX_MCS.token_pv);
  }
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_4 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
  }
private void action_gen_79(ASM x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> asm #tds ASM #gen ;"});
}
  }
private void action_auto_inh_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> TYPE ident DECL ;"});
}
  }
private void action_tds_79(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> asm #tds ASM #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 332
        regle3 () ;
      break ;
      case LEX_MCS.token_void : // 327
        regle4 () ;
      break ;
      case LEX_MCS.token_int : // 329
        regle4 () ;
      break ;
      case LEX_MCS.token_char : // 330
        regle4 () ;
      break ;
      case LEX_MCS.token_identc : // 354
        regle4 () ;
      break ;
      case LEX_MCS.token_struct : // 331
        regle4 () ;
      break ;
      case LEX_MCS.token_asm : // 328
        regle79 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
