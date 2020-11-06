 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author samaniw
 */
public class Graphs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        

        Graph grafito = new Graph(6);
        grafito.addEdge(0, 1);
        grafito.addEdge(0, 2);
        grafito.addEdge(1, 0);
        grafito.addEdge(1, 3);
        grafito.addEdge(2, 0);
        grafito.addEdge(2, 3);
        grafito.addEdge(3, 1);
        grafito.addEdge(3, 2);
        grafito.addEdge(3, 0);
        //validación de puntos del taller
        System.out.println("Mostrar arcos");
        System.out.println(grafito.showEdges());
        //validar si entradas y salidas son iguales para todos los nodos
        System.out.println("Validar In - Out:" + grafito.validateInOut());
        System.out.println("matriz de adyacencia:");
        System.out.println(grafito.showAMatrix());

        System.out.println("lista de adyacencia:");
        System.out.println(grafito.showAList());

        
    }

}
