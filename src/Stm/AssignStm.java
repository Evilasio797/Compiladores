/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stm;
import Exp.Exp;
/**
 *
 * @author evilasio.neto
 */
public class AssignStm {
    public String id;
    public Exp exp;
    public AssignStm(String i, Exp e){
        id = i;
        exp = e;
    }
}
