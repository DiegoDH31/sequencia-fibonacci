package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Digite um número para calcular a sequência de Fibonacci:");
		  int numero = sc.nextInt();

	        List<Integer> fibbonacciSequence = new ArrayList<>();

	        int aux = 1;

	        int a = 0;
	        int b = 1;
	        int c = 1;

	        while (aux < numero) {

	                fibbonacciSequence.add(a);

	                a = b;
	                b = c;
	                c = a + b;

	                aux = fibbonacciSequence.get(fibbonacciSequence.size() - 1);
		
		}
	      System.out.println(fibbonacciSequence + "\n");
	       
	      if (fibbonacciSequence.contains(numero)) {
	    	  
	    	  System.out.println("O número " + numero + " pertence a sequência.");
	    	  
	      } else {
	    	  System.out.println("O número " + numero + " não pertence a sequência.");
	      }
	      
	      sc.close();
	}
	
}
