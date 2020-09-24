/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lists;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samaniw
 */
public class Lists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	/**
    	SingleLinkedList<Integer> miListaS = new SingleLinkedList<>();
        miListaS.addLast(11);
        miListaS.addLast(33);
        miListaS.addLast(22);
        System.out.println(miListaS.showMaj());
        System.out.println(miListaS.showMin());
        miListaS.addLast(44);
        miListaS.addLast(55);
        miListaS.add(99);
        miListaS.add(5);
        System.out.println("el promedio es " + miListaS.getAverage());
        System.out.println(miListaS.showMaj());
        System.out.println(miListaS.showMin());
        System.out.println(miListaS.showData());
        
        miListaS.delete(); 
        System.out.println("Datos despues del borrado " + miListaS.showData());
        miListaS.deleteLast();
        System.out.println("Datos despues del borrado " + miListaS.showData());
        miListaS.deleteLast();
        System.out.println("Datos despues del borrado " + miListaS.showData());
        miListaS.deleteLast();
        System.out.println("Datos despues del borrado " + miListaS.showData());
        miListaS.delete();
        System.out.println("Datos despues del borrado " + miListaS.showData());
        System.out.println("el promedio es " + miListaS.getAverage());
        System.out.println(miListaS.showMaj());       
        System.out.println(miListaS.showMin());
        **/
    	/**
    	DoubleLinkedList<Integer> miListaD = new DoubleLinkedList<>();
    	miListaD.add(12);
    	miListaD.add(1);
    	miListaD.add(99);
    	miListaD.add(24);
    	miListaD.add(34);
    	System.out.println("Datos despues del borrado " + miListaD.showData());
    	System.out.println(miListaD.exist(12));
    	miListaD.deleteLast();
    	miListaD.deleteLast();
    	System.out.println(miListaD.exist(12));
    	miListaD.delete();
    	System.out.println("Datos despues del borrado " + miListaD.showData());
    	**/
    	/**
    	CircularSingleLinkedList<Integer> miListaC1 = new CircularSingleLinkedList<>();
    	CircularSingleLinkedList<Integer> miListaC2 = new CircularSingleLinkedList<>();
    	miListaC1.add(12);
    	miListaC1.add(1);
    	miListaC1.add(99);
    	miListaC1.add(24);
    	miListaC1.add(34);
    	System.out.println("Lista " + miListaC1.showData());
    	miListaC1.deleteLast();
    	miListaC1.deleteLast();
    	System.out.println("PAso?");
    	System.out.println("PAso?");
    	System.out.println("PAso?");
    	System.out.println("1");
    	System.out.println("Datos despues del borrado " + miListaC1.showData());
    	System.out.println("PAso?");
    	miListaC2.add(5);
    	miListaC2.add(4);
    	miListaC2.add(3);
    	miListaC2.add(2);
    	miListaC2.add(1);
    	System.out.println("Lista dos " + miListaC2.showData());
    	miListaC1.joinList(miListaC2);
    	System.out.println("Lista " + miListaC1.showData());
    	**/
    	
    	CircularDoubleLinkedList<Integer> miListaCD = new CircularDoubleLinkedList<>();
    	CircularDoubleLinkedList<Integer> miListaCD2 = new CircularDoubleLinkedList<>();
    	miListaCD.add(1);
    	miListaCD.add(12);
    	miListaCD.add(99);
    	miListaCD.add(24);
    	miListaCD.add(34);    	
    	System.out.println("Lista " + miListaCD.showData());
    	System.out.println("Lista " + miListaCD.showDataDesc());
    	miListaCD.delete();    	
    	miListaCD.delete(); 
    	System.out.println("Lista " + miListaCD.showData());
    	miListaCD.deleteLast();    	
    	miListaCD.deleteLast();
    	System.out.println("Lista " + miListaCD.showData());
    	
    	/**
    	miListaCD2.addOrdered(1);
    	miListaCD2.addOrdered(25);
    	miListaCD2.addOrdered(35);
    	miListaCD2.addOrdered(12);
    	miListaCD2.addOrdered(20);
    	miListaCD2.addOrdered(35);
    	miListaCD2.addOrdered(20);
    	System.out.println("Lista dos " + miListaCD2.showData());
    	System.out.println("Lista paso ");
    	miListaCD2.delete();
    	miListaCD2.delete();
    	System.out.println("Lista dos " + miListaCD2.showData());
    	System.out.println("Lista paso ");
    	miListaCD2.deleteLast();
    	miListaCD2.deleteLast();
    	System.out.println("Lista dos " + miListaCD2.showData());
    	System.out.println("Lista paso ");
    	**/
    }

}
