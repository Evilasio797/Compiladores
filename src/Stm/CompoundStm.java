/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stm;

/**
 *
 * @author evilasio.neto
 */
public class CompoundStm extends Stm{
    public Stm stm1, stm2;
    public CompoundStm(Stm s1, Stm s2){
        stm1 = s1;
        stm2 = s2;
    }
}
