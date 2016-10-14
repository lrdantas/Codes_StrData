/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidade.Element;
import java.util.Scanner;
import method.MyQueue;

/**
 *
 * @author rodrigo
 */
public class QueueArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue novaPilha = new MyQueue();
        String escolha, newFile;
        boolean status = true;
        Scanner sc = new Scanner(System.in);
        
        while(status){
            System.out.println("Escolha a opção desejada:\n");
            System.out.println("1: Adicionar elemento a fila - enQueue\n");
            System.out.println("2: Remover elemento da fila - Dequeue\n");
            System.out.println("3: Verificar primeiro da fila- First\n");
            System.out.println("4: Verificar se a fila está vazia - isEmpty\n");
            System.out.println("5: Verificar tamanho da fila - Size\n");
            System.out.println("6: Sair\n");
            escolha = sc.nextLine();
            if(null != escolha)switch (escolha) {
                case "1":
                    newFile=sc.nextLine();
                    Element novoSite= new Element(newFile);
                    novaPilha.enqueue(novoSite);
                    break;
                case "2":
                    try {
                        novaPilha.dequeue();    
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "3":
                    try {
                        novaPilha.first();
                        System.out.println("O primeiro elemento é: ");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "4":
                    try {
                        novaPilha.isEmpty();
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "5":
                    novaPilha.size();
                    System.out.println("O tamanho da fila é: " + novaPilha.size());
                    break;
                default:
                    status = false;
            }
        }
    }
}
