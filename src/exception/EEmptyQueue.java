/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author rodrigo
 */
public class EEmptyQueue extends Exception{
    public EEmptyQueue(){
    }
    public EEmptyQueue(String msn){
        super(msn);
    }
}
