package taller1_estructuras;
import java.util.Scanner;

public class yo {
	
    public static void main(String args[]) 
    { 
        int n = 11; 
        int [] arreglo = {12,14,13,45,56,54};
        int tamaño=arreglo.length-1;
        int datoBuscado=1;
        String palabraEvaluar="motor";
        int numeroN = 2323;
        
        codigos r = new codigos();
  
        //r.printTribonacci(n);
        //System.out.println(r.existeValor(arreglo, datoBuscado, tamaño));
        //System.out.println(r.palindrome(palabraEvaluar));
        System.out.println(r.numerologia(numeroN));
    } 

}
