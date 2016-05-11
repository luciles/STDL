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
public class S_INST_MCS {
LEX_MCS scanner;
  S_INST_MCS() {
    }
  S_INST_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle30() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_6 = new S_BLOC_MCS(scanner,att_eval) ;
    S_SIX_MCS x_7 = new S_SIX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_4, x_6, x_7);
    x_2.analyser(LEX_MCS.token_si);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
    x_6.analyser() ;
    x_7.analyser() ;
  }
  private void regle33() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_33(x_3);
    x_2.analyser(LEX_MCS.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_pv);
  }
  private void regle27() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_AFFX_MCS x_4 = new S_AFFX_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_27(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_pv);
  }
  private void regle80() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_80(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_80(x_4);
  }
  private void regle29() throws Exception {

    //declaration
    S_BLOC_MCS x_2 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_29(x_2);
    x_2.analyser() ;
  }
  private void regle28() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_pv);
  }
private void action_auto_inh_30(S_E_MCS x_4, S_BLOC_MCS x_6, S_SIX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> si paro E parf BLOC SIX ;"});
}
  }
private void action_gen_80(ASM x_4) throws Exception {
try {
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_auto_inh_33(S_E_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> retour E pv ;"});
}
  }
private void action_auto_inh_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> TYPE ident AFFX pv ;"});
}
  }
private void action_auto_inh_28(S_E_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> E pv ;"});
}
  }
private void action_auto_inh_29(S_BLOC_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> BLOC ;"});
}
  }
private void action_tds_80(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> asm #tds ASM #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 327
        regle27 () ;
      break ;
      case LEX_MCS.token_int : // 329
        regle27 () ;
      break ;
      case LEX_MCS.token_char : // 330
        regle27 () ;
      break ;
      case LEX_MCS.token_identc : // 354
        regle27 () ;
      break ;
      case LEX_MCS.token_struct : // 331
        regle27 () ;
      break ;
      case LEX_MCS.token_entier : // 350
        regle28 () ;
      break ;
      case LEX_MCS.token_chaine : // 352
        regle28 () ;
      break ;
      case LEX_MCS.token_caractere : // 351
        regle28 () ;
      break ;
      case LEX_MCS.token_plus : // 342
        regle28 () ;
      break ;
      case LEX_MCS.token_moins : // 343
        regle28 () ;
      break ;
      case LEX_MCS.token_non : // 349
        regle28 () ;
      break ;
      case LEX_MCS.token_null : // 335
        regle28 () ;
      break ;
      case LEX_MCS.token_paro : // 317
        regle28 () ;
      break ;
      case LEX_MCS.token_mult : // 345
        regle28 () ;
      break ;
      case LEX_MCS.token_ident : // 353
        regle28 () ;
      break ;
      case LEX_MCS.token_aco : // 319
        regle29 () ;
      break ;
      case LEX_MCS.token_si : // 325
        regle30 () ;
      break ;
      case LEX_MCS.token_retour : // 333
        regle33 () ;
      break ;
      case LEX_MCS.token_asm : // 328
        regle80 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
