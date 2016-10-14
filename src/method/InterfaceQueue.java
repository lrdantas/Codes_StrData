/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

import entidade.Element;
import exception.EEmptyQueue;

/**
 *
 * @author rodrigo
 */
public interface InterfaceQueue {
    public int size();
    public boolean isEmpty() throws EEmptyQueue;
    public Object first() throws EEmptyQueue;
    public void enqueue(Element o);
    public Object dequeue() throws EEmptyQueue; 
}
