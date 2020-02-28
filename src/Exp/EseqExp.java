/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp;

import Stm.Stm;

/**
 *
 * @author evilasio.neto
 */
public class EseqExp extends Exp{
    public Stm stm;
    public Exp exp;
    public EseqExp(Stm s, Exp e){
        stm = s;
        exp = e;
    }
}
