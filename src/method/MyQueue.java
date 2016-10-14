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
public class MyQueue implements InterfaceQueue{
   // Site novoSite = new Site();
   // Site[] siteAcessado;
    public int n=5;
    Element[] siteAcessado = new Element[n];
    int i =2,f=2;
    @Override
    public int size() {
        return (n - i + f) % n;
    }

    @Override
    public boolean isEmpty() throws EEmptyQueue{
        return i==f;        
    }

    @Override
    public Object first() throws EEmptyQueue {
        if(isEmpty()){
            throw new EEmptyQueue("A Pilha está vazia");
        }  
        return siteAcessado[f];
    }

    @Override
    public void enqueue(Element o){
       if(1-siteAcessado.length==f){
           n=n*2;
       }
       else{
           i++;
           siteAcessado[f]= o;
           f=(f+1)%n;
       }
    }

    @Override
    public Object dequeue() throws EEmptyQueue {
        if(isEmpty()){
            throw new EEmptyQueue("A Pilha está vazia");
        }
        else{
            Object o = siteAcessado[i];
            i = n % (i+1); 
            return o;
        }
    }    
}
