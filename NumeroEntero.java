
import java.util.*;
import java.io.*;
import java.util.InputMismatchException;

public class NumeroEntero {
	
	    private static Scanner leer;
	    
	    public static void main (String[] args) {
	      	      
	      leer = new Scanner(System.in);
	      
	      int numero;
	       try{
	        System.out.println("Ingrese un numero entero: ");
	        numero = leer.nextInt();
	        
	        System.out.println("su numero es:" + numero);
	       }catch(InputMismatchException a){
	    	   leer.nextLine();
	    	  
	    	   System.out.println("Ingrese un numero entero: "+ a.toString()); 
	       }
	    } 
}
