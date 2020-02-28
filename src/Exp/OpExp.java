/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exp;

/**
 *
 * @author evilasio.neto
 */
public class OpExp extends Exp{
    public Exp left;
    public Exp right;
    public int oper;
    final public static int Plus=1, Minus=2, Times=3, Div=4; //Binop
    public OpExp(Exp l, Exp r, int o){
        left = l;
        right = r;
        oper = o;
    }
}
