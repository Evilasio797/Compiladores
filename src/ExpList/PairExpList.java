/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExpList;
import Exp.Exp;
/**
 *
 * @author evilasio.neto
 */
public class PairExpList extends ExpList{
    public Exp head;
    public ExpList tail;
    public PairExpList(Exp h, ExpList t){
        head = h;
        tail = t;
    }
}
