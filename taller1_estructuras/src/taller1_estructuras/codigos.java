package taller1_estructuras;


public class codigos {
	
	
	
	
	static int tribonacci(int n) 
    { 
          
        if (n == 0 || n == 1) 
            return 0; 
              
        if (n == 2) 
            return 1; 
        else
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3); 
    } 
      
    public void printTribonacci(int n) 
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(tribonacci(i) +" "); 
    } 
    
    
    public boolean existeValor(int [] a, int dato, int posicion) {
    	
    	if (posicion == 0) {
    		if(a[posicion]==dato)
    			return true;
    		
    		else 
    			return false;    		    	
    	} 
    	else {
    		if (a[posicion]!=dato) 
    			return existeValor(a, dato, posicion-1);
    		
    		else 
    			return true;
    		
    	}
    	
    }
    
    
    public boolean palindrome (String palabra) {
    	if(palabra.length() == 0 || palabra.length() == 1)
            return true; 
        if(palabra.charAt(0) == palabra.charAt(palabra.length()-1))
        
        return palindrome(palabra.substring(1, palabra.length()-1));

        return false;
    	
    }
    
    
    public String numerologia(int numero) {
    	String numeroS = String.valueOf(numero);
    	if(numeroS.length()==1)
    		return numeroS;
    		
    	else {
    	char[] a= numeroS.toCharArray();
    	int suma=0;
    	int numeroI=0;
    	
    	for (int i=0; i<a.length;i++) {
    		numeroI = Character.getNumericValue(a[i]);
    		suma=suma+numeroI;
    	
    	}
    	return numerologia(suma);
    	}
    		
    }
       

}
